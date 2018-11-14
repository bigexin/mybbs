package com.zhiyu.mybbs;

import com.alibaba.druid.pool.DruidDataSource;
import com.zhiyu.mybbs.interceptors.MyInterceptor;
import com.zhiyu.mybbs.utils.MyFreemarkerView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import javax.sql.DataSource;

/**
 * @author zhiyu
 */
@Configuration
public class MyConfiguration implements WebMvcConfigurer {

    private final Logger logger = LoggerFactory.getLogger(MyConfiguration.class);

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        logger.info("add interceptors");
        registry.addInterceptor(new MyInterceptor())
                .excludePathPatterns("/css/**", "/images/**", "/js/**", "/layui/**", "/res/**");
    }

    @Bean
    public CommandLineRunner customFreemarker(FreeMarkerViewResolver resolver) {
        return args -> resolver.setViewClass(MyFreemarkerView.class);
    }
}
