package com.liang.repository.information;

import generated_jooq.tables.pojos.Information;
import org.jooq.Record;
import org.jooq.RecordMapper;

import java.util.List;

/**
 * @author Liang
 * Created By 2020/4/7
 **/
public interface IInformationRepository {

    /**
     * 分页获取资讯列表
     */
    <T> List<T> list(String params, Integer type, RecordMapper<Record, T> mapper);

    /**
     * 新增资讯
     */
    void insert(Information information);

    /**
     * 获取资讯详情
     */
    Information detail(Long id);

    /**
     * 修改资讯
     */
    void update(Information information);

    /**
     * 删除资讯
     */
    void delete(Long id);

    /**
     * 更新阅读量
     */
    void updatePV(Long id, Long pv);
}
