package test.java.spittr.web;

import static org.junit.Assert.assertNotNull;

import main.java.spittr.config.WebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.validation.Validator;

/**
 * Created by try on 2015/9/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ValidatorConfig.class)
public class ValidatorTest
{
    @Autowired
    private Validator validator;

    @Test
    public void shouldNotBeNull()
    {
        assertNotNull(validator);
    }

}
