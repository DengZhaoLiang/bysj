package com.liang.service.api.blogBg;

import com.liang.repository.blogBg.BlogBgRepository;
import com.liang.repository.blogBg.IBlogBgRepository;
import generated.tables.pojos.BlogBg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liang
 * Created By 2020/3/31
 **/
@Service
public class BlogBgServiceImpl implements BlogBgService {

    @Autowired
    private IBlogBgRepository mIBlogBgRepository;

    @Override
    public BlogBg detailBlogBg(Integer type) {
        return mIBlogBgRepository.detail(type);
    }
}
