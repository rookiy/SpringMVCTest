package main.java.spittr.web;

import main.java.spittr.Spitter;
import main.java.spittr.data.SpitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


/**
 * Created by try on 2015/9/19.
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController
{
    @Autowired
    private SpitterRepository spitterRepository;

    public SpitterController()
    {
    }

    public void setSpitterRepository(SpitterRepository spitterRepository)
    {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value="/register", method= RequestMethod.GET)
    public String showRegistration(Model model)
    {
        model.addAttribute("spitter", new Spitter());
        return "registerForm";
    }

    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String processRegistration(@Valid Spitter spitter, BindingResult errors)
    {
        if (errors.hasErrors())
        {
            return "registerForm";
        }

        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value="/{username}", method=RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username, Model model)
    {
        Spitter spitter = spitterRepository.findByUsername(username);
        model.addAttribute("spitter", spitter);
        return "profile";
    }
}
