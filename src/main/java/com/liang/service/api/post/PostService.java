package com.liang.service.api.post;

import com.liang.dto.api.post.PostPageResponse;
import generated_jooq.tables.pojos.Posts;
import org.springframework.data.domain.Pageable;

/**
 * @author Liang
 * com.liang.service.api.post PostService  2020/5/5 0005  Liang
 */
public interface PostService {

    /**
     * 新增帖子
     */
    void insertPost(Posts posts);

    /**
     * 获取所有的帖子
     */
    PostPageResponse page(String params, Long userId, Pageable pageable);
}
