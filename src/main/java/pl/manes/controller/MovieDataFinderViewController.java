package pl.manes.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.manes.domain.model.Favorite;
import pl.manes.service.MovieService;

@RequiredArgsConstructor
@Controller
@RequestMapping("/favorites")
public class MovieDataFinderViewController {

    private final MovieService movieService;

    @GetMapping("add")
    public String addFavoriteMovieView(Model model) {

        model.addAttribute("add", new Favorite());

        return "add";
    }

    @PostMapping
    public String addFavoriteMovie(Favorite favorite) {

        movieService.addMovieToFavorite(favorite);

        return "redirect:/index";
    }

    @GetMapping("favorite")
    public String viewAllFavoritesMovies(Model model) {

        model.addAttribute("favorites", movieService.getAllFavoritesMovies());

        return "favorite";
    }
}
