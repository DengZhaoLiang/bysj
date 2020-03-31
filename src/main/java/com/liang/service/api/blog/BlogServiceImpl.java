package com.liang.service.api.blog;

import com.liang.dto.PageResponse;
import com.liang.dto.api.blog.ApiBlogPageResponse;
import com.liang.dto.api.blog.ApiBlogResponse;
import com.liang.repository.blog.IBlogRepository;
import com.liang.repository.blogBg.IBlogBgRepository;
import com.liang.utils.PageUtils;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Liang
 * Created By 2020/3/31
 **/
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private IBlogRepository mIBlogRepository;

    @Autowired
    private IBlogBgRepository mIBlogBgRepository;

    @Override
    public ApiBlogPageResponse listBlog(Integer type, Pageable pageable) {
        List<ApiBlogResponse> page = mIBlogRepository.list(null,type, it->it.into(ApiBlogResponse.class));

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
        List<ApiBlogResponse> list = page.stream()
                .sorted(Comparator.comparing(ApiBlogResponse::getId))
                .skip(pageSize * (pageNumber - 1))
                .limit(pageSize)
                .collect(Collectors.toList());
        PageResponse pageResponse = PageUtils.getPageResponse(pageNumber, pageSize, page);
        ApiBlogPageResponse response = new ApiBlogPageResponse();
        response.setBlog(list);
        response.setPage(pageResponse);
        return response;
    }
}
