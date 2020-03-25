package com.liang.utils;

import com.liang.dto.PageResponse;
import java.util.List;
import org.springframework.util.CollectionUtils;

/**
 * @author Liang
 * Created By 2020/3/25
 **/
public class PageUtils {

    /**
     * 获取分页参数
     */
    public static PageResponse getPageResponse(int pageNumber, int pageSize, List<?> page) {
        PageResponse response = new PageResponse();

        //获取当前页
        response.setCurrentPage(pageNumber);
        //获取总页数
        int totalPage = 1;
        if (!CollectionUtils.isEmpty(page)) {
            int rows = page.size();
            totalPage = (int) (rows % pageSize == 0 ? Math.ceil(rows / pageSize) : Math.ceil(rows / pageSize) + 1);
        }
        response.setTotalPage(totalPage);
        //获取上一页
        int previous = 1;
        if (pageNumber - 1 >= 1) {
            previous = pageNumber - 1;
        }
        response.setPrevious(previous);
        //获取下一页
        int next = 1;
        if (pageNumber + 1 <= totalPage) {
            next = pageNumber + 1;
        }
        response.setNext(next);
        return response;
    }
}
