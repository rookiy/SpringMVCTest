package test.java.spittr.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * Created by try on 2015/9/22.
 */
@Configuration
public class ValidatorConfig
{
    @Bean
    public Validator localValidatorFactoryBean()
    {
        return new LocalValidatorFactoryBean();
    }
}
