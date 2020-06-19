package com.liang.service.api.post;

import com.liang.repository.posts.IPostsRepository;
import generated.tables.pojos.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liang
 * com.liang.service.api.post PostServiceImpl  2020/5/5 0005  Liang
 */
@Service
public class PostServiceImpl implements  PostService {

    @Autowired
    private IPostsRepository mIPostsRepository;

    @Override
    public void insertPost(Posts posts) {
        mIPostsRepository.insert(posts);
    }
}
