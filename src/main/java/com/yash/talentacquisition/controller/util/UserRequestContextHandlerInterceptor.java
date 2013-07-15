package com.yash.talentacquisition.controller.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class UserRequestContextHandlerInterceptor implements HandlerInterceptor {

    @Autowired
    private UserRequestContext userRequestContext;
    
   
    public void afterCompletion(HttpServletRequest req,
            HttpServletResponse resp, Object handler, Exception exp)
            throws Exception {
    }


    public void postHandle(HttpServletRequest req, HttpServletResponse resp,
            Object handler, ModelAndView mav) throws Exception {
    }

  
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp,
            Object handler) throws Exception {
	    	if(null != req.getUserPrincipal() ) {
	    		userRequestContext.setUserEmail( req.getUserPrincipal().getName() );
	    		return true;
	    	}
        return false;
    }
}
