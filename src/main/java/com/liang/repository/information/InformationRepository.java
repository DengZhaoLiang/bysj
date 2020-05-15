package com.liang.repository.information;

import com.liang.DAO.information.InformationDbStrategy;
import generated_jooq.tables.pojos.Information;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Liang
 * Created By 2020/4/7
 **/
@Repository
@Primary
public class InformationRepository implements IInformationRepository {

    @Autowired
    private InformationDbStrategy mInformationDbStrategy;

    @Override
    public <T> List<T> list(String params, Integer type, RecordMapper<Record, T> mapper) {
        return mInformationDbStrategy.list(params, type, mapper);
    }

    @Override
    public void insert(Information information) {
        mInformationDbStrategy.insert(information);
    }

    @Override
    public Information detail(Long id) {
        return mInformationDbStrategy.detail(id);
    }

    @Override
    public void update(Information information) {
        mInformationDbStrategy.update(information);
    }

    @Override
    public void delete(Long id) {
        mInformationDbStrategy.delete(id);
    }

    @Override
    public void updatePV(Long id, Long pv) {
        mInformationDbStrategy.updatePV(id, pv);
    }
}
