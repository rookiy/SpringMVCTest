package test.java.spittr.web;

/**
 * Created by try on 2015/9/16.
 */

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


import main.java.spittr.web.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

public class HomeControllerTest
{
    @Test
    public void testHomePage() throws Exception
    {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }

}
