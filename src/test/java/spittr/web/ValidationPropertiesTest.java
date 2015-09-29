package test.java.spittr.web;

import static org.junit.Assert.assertNotNull;

import main.java.spittr.config.RootConfig;
import main.java.spittr.config.WebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

import java.util.Locale;

/**
 * Created by try on 2015/9/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value="web")
@ContextHierarchy({
        @ContextConfiguration(name="parent", classes=RootConfig.class),
        @ContextConfiguration(name="child", classes=WebConfig.class)
})
public class ValidationPropertiesTest
{
    @Autowired
    private MessageSource messageSource;
    @Autowired
    private WebApplicationContext wac;

    @Test
    public void messageSourceShouldNotBeNull()
    {
        assertNotNull(messageSource);
    }

    @Test
    public void out()
    {
        System.out.println(messageSource.getMessage("firstName.size", new Object[]{3,5}, Locale.US));
    }

}
