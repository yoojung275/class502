package org.choongang.global.cofigs;


import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Controller;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
@EnableJpaAuditing
public class MvcConfig implements WebMvcConfigurer {

        @Bean
        public HiddenHttpMethodFilter httpMethodFilter() {
            return new HiddenHttpMethodFilter();
        }
}
