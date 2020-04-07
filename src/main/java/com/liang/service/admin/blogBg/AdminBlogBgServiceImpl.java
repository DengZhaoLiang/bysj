package com.liang.service.admin.blogBg;

import com.liang.dto.PageResponse;
import com.liang.dto.admin.blogBg.AdminBlogBgPageResponse;
import com.liang.dto.admin.blogBg.AdminBlogBgResponse;
import com.liang.repository.blogBg.IBlogBgRepository;
import com.liang.utils.PageUtils;
import generated.tables.pojos.BlogBg;
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
public class AdminBlogBgServiceImpl implements AdminBlogBgService {

    @Autowired
    private IBlogBgRepository mBlogBgRepository;

    @Override
    public AdminBlogBgPageResponse page(String params, Integer type, Pageable pageable) {
        List<AdminBlogBgResponse> page = mBlogBgRepository.list(params, type, it -> it.into(AdminBlogBgResponse.class));

        page.forEach(it -> {
            switch (it.getType()) {
                case 1:
                    it.setTypeStr("可回收垃圾");
                    break;
                case 2:
                    it.setTypeStr("有害垃圾");
                    break;
                case 3:
                    it.setTypeStr("干垃圾");
                    break;
                case 4:
                    it.setTypeStr("湿垃圾");
                    break;
                case 5:
                    it.setTypeStr("厨余垃圾");
                    break;
                case 6:
                    it.setTypeStr("其它垃圾");
                    break;
                default:
                    it.setTypeStr(null);
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
        List<AdminBlogBgResponse> list = page.stream()
                .sorted(Comparator.comparing(AdminBlogBgResponse::getId))
                .skip(pageSize * (pageNumber - 1))
                .limit(pageSize)
                .collect(Collectors.toList());
        PageResponse pageResponse = PageUtils.getPageResponse(pageNumber, pageSize, page);
        AdminBlogBgPageResponse response = new AdminBlogBgPageResponse();
        response.setBlogBg(list);
        response.setPage(pageResponse);
        return response;
    }

    @Override
    public void insert(BlogBg blogBg) {
        mBlogBgRepository.insert(blogBg);
    }

    @Override
    public BlogBg detail(Long id) {
        return mBlogBgRepository.detail(id);
    }

    @Override
    public void update(BlogBg blogBg) {
        mBlogBgRepository.update(blogBg);
    }

    @Override
    public void delete(Long id) {
        mBlogBgRepository.delete(id);
    }
}
