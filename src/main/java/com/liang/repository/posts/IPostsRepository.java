package com.liang.repository.posts;

import com.liang.dto.api.post.PostResponse;
import org.jooq.Record;
import org.jooq.RecordMapper;

import java.util.List;

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
    void check(Long id, Integer check);

    /**
     * 删除帖子
     */
    void delete(Long id);

    /**
     * 新增帖子
     */
    void insert(generated_jooq.tables.pojos.Posts posts);

    /**
     * 查询所有相关的帖子
     */
    List<PostResponse> page(String params);
}
