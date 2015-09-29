package main.java.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by try on 2015/9/15.
 */
@Controller
@RequestMapping({"/", "/homepage"})
public class HomeController
{
    @RequestMapping(method = RequestMethod.GET)
    public String home()
    {
        return "home";
    }

}
