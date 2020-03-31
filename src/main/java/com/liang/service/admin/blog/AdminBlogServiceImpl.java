package com.liang.service.admin.blog;

import com.liang.dto.PageResponse;
import com.liang.dto.admin.blog.AdminBlogPageResponse;
import com.liang.dto.admin.blog.AdminBlogResponse;
import com.liang.repository.blog.IBlogRepository;
import com.liang.utils.PageUtils;
import generated.tables.pojos.Blog;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Liang
 * Created By 2020/3/30
 **/
@Service
public class AdminBlogServiceImpl implements AdminBlogService {

    @Autowired
    private IBlogRepository mIBlogRepository;

    @Override
    public AdminBlogPageResponse page(String params, Integer type, Pageable pageable) {
        List<AdminBlogResponse> page = mIBlogRepository.list(params,type,it->it.into(AdminBlogResponse.class));

        page.forEach(it->{
            switch (it.getType()){
                case 1 : it.setTypeStr("可回收垃圾"); break;
                case 2 : it.setTypeStr("有害垃圾"); break;
                case 3 : it.setTypeStr("干垃圾"); break;
                case 4 : it.setTypeStr("湿垃圾"); break;
                case 5 : it.setTypeStr("厨余垃圾"); break;
                case 6 : it.setTypeStr("其它垃圾"); break;
                default: it.setTypeStr(null);
            }
        });

        /*
         * 初始化页面大小和起始页
         */
        int pageNumber = 1;
        int pageSize = 18;
        if (pageable.getPageNumber() != 0) {
            pageNumber = pageable.getPageNumber();
        }
        //获取内容体
        List<AdminBlogResponse> list = page.stream()
                .sorted(Comparator.comparing(AdminBlogResponse::getId))
                .skip(pageSize * (pageNumber - 1))
                .limit(pageSize)
                .collect(Collectors.toList());
        PageResponse pageResponse = PageUtils.getPageResponse(pageNumber, pageSize, page);
        AdminBlogPageResponse response = new AdminBlogPageResponse();
        response.setBlog(list);
        response.setPage(pageResponse);
        return response;
    }

    @Override
    public void insert(Blog blog) {
        mIBlogRepository.insert(blog);
    }

    @Override
    public Blog detail(Long id) {
        return mIBlogRepository.detail(id);
    }

    @Override
    public void update(Blog blog) {
        mIBlogRepository.update(blog);
    }

    @Override
    public void delete(Long id) {
        mIBlogRepository.delete(id);
    }
}
