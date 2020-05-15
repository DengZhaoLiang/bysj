package com.liang.DAO.information;

import com.liang.utils.DSLPlusUtils;
import generated_jooq.tables.pojos.Information;
import generated_jooq.tables.records.InformationRecord;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static generated_jooq.Tables.INFORMATION;

/**
 * @author Liang
 * Created By 2020/4/7
 **/
@Repository
public class InformationDAO implements InformationDbStrategy {

    @Autowired
    private DSLContext mDSLContext;

    @Override
    public <T> List<T> list(String params, Integer type, RecordMapper<Record, T> mapper) {
        SelectQuery<InformationRecord> query = mDSLContext.selectQuery(INFORMATION);
        query.addSelect(INFORMATION.fields());
        DSLPlusUtils.containsIfNotBlank(query, INFORMATION.NAME, params);
        DSLPlusUtils.eqIfNotNull(query, INFORMATION.TYPE, type);
        return query.fetch(mapper);
    }

    @Override
    public void insert(Information information) {
        InformationRecord record = mDSLContext.newRecord(INFORMATION, information);
        record.insert();
    }

    @Override
    public Information detail(Long id) {
        SelectQuery<InformationRecord> query = mDSLContext.selectQuery(INFORMATION);
        query.addSelect(INFORMATION.fields());
        query.addConditions(INFORMATION.ID.eq(id));
        return query.fetchOneInto(Information.class);
    }

    @Override
    public void update(Information information) {
        InformationRecord record = mDSLContext.newRecord(INFORMATION, information);
        record.update();
    }

    @Override
    public void delete(Long id) {
        mDSLContext.delete(INFORMATION)
                .where(INFORMATION.ID.eq(id))
                .execute();
    }

    @Override
    public void updatePV(Long id, Long pv) {
        mDSLContext.update(INFORMATION)
                .set(INFORMATION.PV, pv)
                .where(INFORMATION.ID.eq(id))
                .execute();
    }
}
