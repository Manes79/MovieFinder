package pl.manes.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.manes.constant.MovieDataFinderPath;
import pl.manes.constant.MovieDataFinderTemplate;
import pl.manes.service.MovieService;

@Controller
@RequiredArgsConstructor
public class MovieDataFinderResultController {

    private final MovieService movieService;

    @PostMapping(value = MovieDataFinderPath.RESULT)
    public String resultForSearchingMovie(@RequestParam("title") final String movieTitle, final Model model) {

        final var response = movieService.findMovie(movieTitle);

        if (response.getStatusCode().equals(HttpStatus.NOT_FOUND))
            return MovieDataFinderTemplate.NOT_FOUND;

        model.addAttribute("movie", movieService.findMovie(movieTitle).getBody());
        return MovieDataFinderTemplate.RESULT;
    }
}
