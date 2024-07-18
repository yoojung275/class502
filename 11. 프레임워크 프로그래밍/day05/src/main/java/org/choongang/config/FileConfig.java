package org.choongang.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FileConfig implements WebMvcConfigurer {

    @Value("${file.upload.path}")
    private String uploadPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //파일 업로드 정적 경로 설정

        registry.addResourceHandler("/uploads/**").addResourceLocations("file:///" + uploadPath);
                /* addResourceLocations("file:///") -> // 두개 넣으면 / 하나로 인식 해서 // 두개로 인식 되게 하고 싶으면 /// 세개 넣어야 함 */
    }
}
