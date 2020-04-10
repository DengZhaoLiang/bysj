package com.liang.repository.posts;

import java.util.List;
import org.jooq.Record;
import org.jooq.RecordMapper;

/**
 * @author Liang
 * Created By 2020/4/8
 **/

public interface IPostsRepository {

    /**
     * 分页获取帖子列表
     */
    <T> List<T> list(Integer check, Integer type, RecordMapper<Record, T> mapper);

    /**
     * 置顶/取消置顶
     */
    void stick(Long id, Integer stick);

    /**
     * 通过审核
     */
    void check(Long id);

    /**
     * 删除帖子
     */
    void delete(Long id);
}
