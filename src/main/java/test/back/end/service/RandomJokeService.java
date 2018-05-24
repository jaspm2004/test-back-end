package test.back.end.service;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import test.back.end.model.RandomJoke;

@Service
public class RandomJokeService {

	public RandomJoke callPublicAPI() {
		final String uri = "https://api.chucknorris.io/jokes/random";		
			    
		RestTemplate rt = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        
        ResponseEntity<RandomJoke> res = rt.exchange(uri, HttpMethod.GET, entity, RandomJoke.class);
        System.out.println(res.getBody());
	    
	    return res.getBody();
	}
}
