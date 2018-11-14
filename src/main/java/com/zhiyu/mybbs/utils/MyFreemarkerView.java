package com.zhiyu.mybbs.utils;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author zhiyu
 */
public class MyFreemarkerView extends FreeMarkerView {
    private String SLASH = "/";

    @Override
    protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
        String basePath = request.getContextPath();
        if (!basePath.endsWith(SLASH)) {
            basePath += SLASH;
        }
        model.put("basePath", basePath);
        super.exposeHelpers(model, request);
    }
}
