package com.yxsoft.drgsservice.controller.sys;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 *  控制类基类
 */
@Transactional
public class BaseController {
  private  HttpServletRequest request;

    public HttpServletRequest getRequest() {
        return (HttpServletRequest) RequestContextHolder.getRequestAttributes();
    }
    private HttpServletResponse response;

    public HttpServletResponse getResponse() {
        HttpServletResponse response = (HttpServletResponse) RequestContextHolder.getRequestAttributes();
        response.setHeader("Access-Control-Allow-Origin", "*");
        return response;
    }


}
