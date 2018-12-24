package com.zoop.config;


import com.zoop.bean.Person;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@PropertySource({"config/person.properties"})
@EnableConfigurationProperties(Person.class)
public class WebMvcConf  {


    @Configuration
    public static  class WebMvcConfAdapter implements WebMvcConfigurer {

        @Override
        public void configurePathMatch(PathMatchConfigurer configurer) {
            configurer.setUseSuffixPatternMatch(true);
        }
    }

}
