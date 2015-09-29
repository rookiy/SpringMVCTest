package main.java.spittr.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;


/**
 * Created by try on 2015/9/15.
 */
@Configuration
@EnableWebMvc
@ComponentScan("main.java.spittr.web")
public class WebConfig extends WebMvcConfigurerAdapter// work with @EnableWebMvc to customize the configuration of SpringMVC.
{
    @Bean
    public ViewResolver viewResolver()
    {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
        return resolver;
    }

    @Override
    public Validator getValidator()
    {
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
        validator.setValidationMessageSource(messageSource());
        return validator;
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        super.addResourceHandlers(registry);
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
    {
        configurer.enable();
    }

    @Bean
    public MessageSource messageSource()
    {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:/main/resources/ValidationMessages");
        return messageSource;
    }

    @Bean
    public TilesConfigurer tilesConfigurer()
    {
        TilesConfigurer tiles = new TilesConfigurer();
        tiles.setDefinitions(new String[]{
                "/WEB-INF/layout/tiles.xml"
        });
        tiles.setCheckRefresh(true);
        return tiles;
    }

}
