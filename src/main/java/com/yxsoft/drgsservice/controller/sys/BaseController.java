package com.yxsoft.drgsservice.controller.sys;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yxsoft.drgsservice.system.Result;
import com.yxsoft.drgsservice.system.utils.ResultGenerator;
import lombok.val;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 *  控制类基类
 */
@Transactional
public class BaseController {
    private HttpServletRequest request;

    public HttpServletRequest getRequest() {
        return (HttpServletRequest) RequestContextHolder.getRequestAttributes();
    }

    private HttpServletResponse response;

    public HttpServletResponse getResponse() {
        HttpServletResponse response = (HttpServletResponse) RequestContextHolder.getRequestAttributes();
        response.setHeader("Access-Control-Allow-Origin", "*");
        return response;
    }

    public String getValue(Map<String, Object> map, String name) {
        String flag = "";
        if (!map.containsKey(name)) {
            return flag;
        } else if (map.containsKey(name)) {
            flag = (String) map.get(name);
            return flag;
        } else {
            return flag;
        }
    }

    public Integer getInt(Map<String, Object> map,String name){
        if (map.containsKey(name)){
            return (Integer) map.get(name);
        }else {
            return -1;
        }
    }
}