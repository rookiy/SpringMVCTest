package main.java.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by try on 2015/9/15.
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        return new Class<?>[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        return new Class<?>[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings()
    {
        return new String[] {"/"};
    }
}
