package com.vishwa.capstone.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishwa.capstone.entity.FakeNews;
import com.vishwa.capstone.service.FakeNewsService;

@RestController
@RequestMapping("/api2")
public class FakeNewsRestController {

	@Autowired
	private FakeNewsService fakeNewsService;
	
	
	@GetMapping("/fakenews/{url}")
	public FakeNews getFakeNews(@PathVariable String url) {
		
		FakeNews theFakeNews=fakeNewsService.getFakeNews(url);
		if(theFakeNews==null) {
			
		}
		return theFakeNews;
		
	}
	
	@PostMapping("/fakenews")
	public FakeNews addFakeNews(@RequestBody FakeNews theFakeNews) {
		theFakeNews.setId(0);
		fakeNewsService.saveFakeNews(theFakeNews);
		
		return theFakeNews;
	}
	
}
