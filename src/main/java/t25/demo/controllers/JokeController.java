package t25.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import t25.demo.services.JokeService;
//figure out why this isn't reading
//import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Controller
public class JokeController {

    private JokeService joke_Service;

    @Autowired
    public JokeController(JokeService joke_Service){
        this.joke_Service = joke_Service;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model)
    {
        model.addAttribute("joke", joke_Service.getJoke());

        return "chucknorris";
    }

}
