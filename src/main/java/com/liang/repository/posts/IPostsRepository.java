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
}
