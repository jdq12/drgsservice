package com.yxsoft.drgsservice.interceptor

import com.yxsoft.drgsservice.system.utils.TokenManager
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 *  request 拦截检查类
 */
class ServletInterceptor : HandlerInterceptor {
    //HandlerInterceptor这是springMvc提供的拦截器接口
    override
    fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        if (request.method == "OPTIONS")
            return super.preHandle(request, response, handler)

        val uri = request.requestURI
        if (uri == "/system/sysUser/login")
            return super.preHandle(request, response, handler)

        request.session.removeAttribute("user")

        // 如果 header 里面含有 token 那么从 token 里面取出 user 信息，并校验
        val token: String = request.getHeader("token") ?: ""//获取请求头里的token信息
        if (token.isNotEmpty() && token != "undefined")
            TokenManager.checkToken(token, request, response)
        return super.preHandle(request, response, handler)
    }

    override
    fun postHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any, modelAndView: ModelAndView?) {
//        if (request.session != null) {
//            val user = request.session?.getAttribute("user")
//            if (user != null)
//                request.session.removeAttribute("user")
//
//        }
    }

    override
    fun afterCompletion(request: HttpServletRequest, response: HttpServletResponse, handler: Any, ex: Exception?) {
        val user = request.session.getAttribute("user")
        if (user != null)
            request.session.removeAttribute("user")
    }
}
