package com.nxy.incerptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Bean
    SystemInterceptor getSystemInterceptor() {
        return new SystemInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 跨域拦截器放在最上面
        registry.addInterceptor(getSystemInterceptor())
                .addPathPatterns("/**");
    }
}
