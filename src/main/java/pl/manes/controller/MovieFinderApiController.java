package pl.manes.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.manes.domain.model.Favorite;
import pl.manes.service.MovieService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/movies")
public class MovieFinderApiController {

    private final MovieService movieService;

    @GetMapping
    List<Favorite> getAllFavoriteMovies() {
        return movieService.getAllFavoritesMovies();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    Favorite addMovieToFavorite(@RequestBody Favorite favorite) {
        return movieService.addMovieToFavorite(favorite);
    }
}
