package dev.milikkan.spring.jokesappsb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "chucknorris";
    }
}
