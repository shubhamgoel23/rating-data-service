package io.imdb.ratingdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.imdb.ratingdataservice.models.Rating;
import io.imdb.ratingdataservice.models.UserRating;

@RestController
@RequestMapping("/ratingsData")
public class RatingsDataResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);

	}

	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(new Rating("123", 4), new Rating("223", 5));
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;

	}

}
