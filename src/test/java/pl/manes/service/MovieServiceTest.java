package pl.manes.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.manes.domain.model.Favorite;
import pl.manes.domain.repository.MovieFinderRepository;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MovieServiceTest {

    @Autowired
    private MovieFinderRepository movieFinderRepository;

    @Autowired
    private MovieService movieService;

    @Test
    void getAllFavoritesMovies() {
        //given
        movieFinderRepository.deleteAll();

        movieFinderRepository.saveAll(List.of(
                new Favorite(
                        "The Hobbit: An Unexpected Journey",
                        "Peter Jackson",
                        "Adventure, Fantasy",
                        "A reluctant Hobbit, Bilbo Baggins, sets out to the Lonely Mountain with a spirited group of dwarves to reclaim their mountain home, and the gold within it from the dragon Smaug"),
                new Favorite(
                        "The Lord of the Rings: The Fellowship of the Ring",
                        "Peter Jackson",
                        "Adventure, Fantasy",
                        "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron."),
                new Favorite(
                        "Ant-Man",
                        "Peyton Reed",
                        "Action, Adventure, Comedy",
                        "Armed with a super-suit with the astonishing ability to shrink in scale but increase in strength, cat burglar Scott Lang must embrace his inner hero and help his mentor, Dr. Hank Pym, pull off a plan that will save the world.")
        ));

        //when
        List<Favorite> favorites = movieService.getAllFavoritesMovies();

        //then
        assertThat(favorites)
                .hasSize(3)
                .extracting(Favorite::getTitle)
                .containsExactlyInAnyOrder("The Hobbit: An Unexpected Journey", "The Lord of the Rings: The Fellowship of the Ring", "Ant-Man");

        assertThat(favorites)
                .hasSize(3)
                .extracting(Favorite::getDirector)
                .containsExactlyInAnyOrder("Peter Jackson", "Peter Jackson", "Peyton Reed");

        assertThat(favorites)
                .hasSize(3)
                .extracting(Favorite::getGenre)
                .containsExactlyInAnyOrder("Adventure, Fantasy", "Adventure, Fantasy", "Action, Adventure, Comedy");

        assertThat(favorites)
                .hasSize(3)
                .extracting(Favorite::getPlot)
                .containsExactlyInAnyOrder
                        ("A reluctant Hobbit, Bilbo Baggins, sets out to the Lonely Mountain with a spirited group of dwarves to reclaim their mountain home, and the gold within it from the dragon Smaug",
                                "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.",
                                "Armed with a super-suit with the astonishing ability to shrink in scale but increase in strength, cat burglar Scott Lang must embrace his inner hero and help his mentor, Dr. Hank Pym, pull off a plan that will save the world.");
    }

    @Test
    void addMovieToFavorite() {
        //given
        Favorite favorite = new Favorite();

        //when
        Favorite resultOfAddingMovieToFavorite = movieService.addMovieToFavorite(favorite);

        //then
        assertThat(resultOfAddingMovieToFavorite.getTitle()).isEqualTo(favorite.getTitle());
        assertThat(resultOfAddingMovieToFavorite.getDirector()).isEqualTo(favorite.getDirector());
        assertThat(resultOfAddingMovieToFavorite.getGenre()).isEqualTo(favorite.getGenre());
        assertThat(resultOfAddingMovieToFavorite.getPlot()).isEqualTo(favorite.getPlot());
    }
}