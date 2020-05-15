package com.liang.service.api.post;

import com.liang.dto.PageResponse;
import com.liang.dto.api.post.PostPageResponse;
import com.liang.dto.api.post.PostResponse;
import com.liang.repository.posts.IPostsRepository;
import com.liang.utils.PageUtils;
import generated_jooq.tables.pojos.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Liang
 * com.liang.service.api.post PostServiceImpl  2020/5/5 0005  Liang
 */
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private IPostsRepository mIPostsRepository;

    @Override
    public void insertPost(Posts posts) {
        mIPostsRepository.insert(posts);
    }

    @Override
    public PostPageResponse page(String params, Long userId, Pageable pageable) {
        List<PostResponse> page =
                mIPostsRepository.page(params);
        page = page.stream()
                .filter(it -> (it.getCheck() == 1 || (it.getCheck() != 1 && it.getUserId().equals(userId)))).collect(Collectors.toList());
        /*
         * 初始化页面大小和起始页
         */
        int pageNumber = 1;
        int pageSize = 18;
        if (pageable.getPageNumber() != 0) {
            pageNumber = pageable.getPageNumber();
        }
        //获取内容体
        List<PostResponse> list = page.stream()
                .skip(pageSize * (pageNumber - 1))
                .limit(pageSize)
                .collect(Collectors.toList());
        PageResponse pageResponse = PageUtils.getPageResponse(pageNumber, pageSize, page);
        PostPageResponse response = new PostPageResponse();
        response.setPost(list);
        response.setPage(pageResponse);
        return response;
    }
}
