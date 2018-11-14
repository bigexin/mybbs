package com.zhiyu.mybbs.utils;

import javax.servlet.http.HttpServletRequest;

public class RequestUtils {
    private static final String USER = "my_user";

    /**
     * 是否登录
     * @param request
     * @return
     * true：已登录
     * false：未登录
     */
    public static boolean isLogin (HttpServletRequest request) {
        return request.getSession().getAttribute(USER) != null;
    }

    public static String getRequestIP(HttpServletRequest request) {
        String clientIp = request.getHeader("x-forwarded-for");
        if (clientIp == null || clientIp.length() == 0 || "unknown".equalsIgnoreCase(clientIp)) {
            clientIp = request.getHeader("Proxy-Client-IP");
        }
        if (clientIp == null || clientIp.length() == 0 || "unknown".equalsIgnoreCase(clientIp)) {
            clientIp = request.getHeader("WL-Proxy-Client-IP");
        }
        if (clientIp == null || clientIp.length() == 0 || "unknown".equalsIgnoreCase(clientIp)) {
            clientIp = request.getRemoteAddr();
        }
        return clientIp;
    }

    public static boolean isResponseBody(HttpServletRequest request) {
        if (request.getRequestURI().indexOf("ajax") > -1) {
            return true;
        }
        return false;
    }


    /**
     * 得到请求的根目录
     *
     * @param request
     * @return
     */
    public static String getBasePath(HttpServletRequest request) {
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName()
                + ":" + request.getServerPort() + path;
        return basePath;
    }

    /**
     * 得到结构目录
     *
     * @param request
     * @return
     */
    public static String getContextPath(HttpServletRequest request) {
        String path = request.getContextPath();
        return path;
    }

}
