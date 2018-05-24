package test.back.end.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.back.end.model.RandomJoke;
import test.back.end.service.RandomJokeService;

@RestController
@RequestMapping("joke")
public class RandomJokeController {

	@Autowired
	RandomJokeService service;
	
	@GetMapping("/random")
	public RandomJoke getRandomJoke( ) {
		return service.callPublicAPI();
	}
}
