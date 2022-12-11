package pl.manes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.manes.constant.MovieDataFinderPath;
import pl.manes.constant.MovieDataFinderTemplate;

@Controller
public class MovieDataFinderIndexController {

    @GetMapping(value = {MovieDataFinderPath.INDEX, "/"})
    public String indexHandler() {
        return MovieDataFinderTemplate.INDEX;
    }

}
