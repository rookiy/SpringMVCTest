package test.java.spittr.web;

import static org.mockito.Mockito.atLeastOnce;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import main.java.spittr.Spitter;
import main.java.spittr.data.SpitterRepository;
import main.java.spittr.web.SpitterController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;



/**
 * Created by try on 2015/9/19.
 */
public class SpitterControllerTest
{
    @Test
    public void shouldShowRegistration() throws Exception
    {
        SpitterRepository mockRepository = mock(SpitterRepository.class);
        SpitterController controller = new SpitterController();
        controller.setSpitterRepository(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/spitter/register"))
                .andExpect(view().name("registerForm"));
    }

    @Test
    public void shouldProcessingRegistration() throws Exception
    {
        SpitterRepository mockRepository = mock(SpitterRepository.class);
        Spitter unsaved = new Spitter("jbauer", "24hours", "Jack", "Bauer");
        Spitter saved = new Spitter(24L, "jbauer", "24hours", "Jack", "Bauer");
        when(mockRepository.save(unsaved)).thenReturn(saved);

        SpitterController controller = new SpitterController();
        controller.setSpitterRepository(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();

        /* Here is the normal case, test controller with a valid input,
           expect it to redirect to the user profile, and register the user
        mockMvc.perform(post("/spitter/register")
                .param("firstName", "Jack")
                .param("lastName", "Bauer")
                .param("username", "jbauer")
                .param("password", "24HOUR")
                .param("email", "all@163.com"))
                .andExpect(redirectedUrl("/spitter/jbauer"));
        verify(mockRepository, atLeastOnce()).save(unsaved);
        */

        // Here is my test for input validation.
        mockMvc.perform(post("/spitter/register")
                .param("firstName", "Jack")
                .param("lastName", "Bauer")
                .param("username", "jba")
                .param("password", "24HOUR")
                .param("email", "all@163.com"))
                //.andExpect(view().name("registerForm"));
                .andExpect(redirectedUrl("/spitter/jbauer"));
    }
}
