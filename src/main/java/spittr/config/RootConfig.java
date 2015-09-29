package main.java.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by try on 2015/9/15.
 */
@Configuration
@ComponentScan(basePackages = {"main.java.spittr"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig
{
}
