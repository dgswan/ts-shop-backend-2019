package com.tsystems.tshop.config;

import com.tsystems.tshop.TshopAnnotationConfigDispatcherServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses =
        TshopAnnotationConfigDispatcherServletInitializer.class)
public class WebConfig {
}
