package com.vishwa.capstone.service;

import com.vishwa.capstone.entity.FakeNews;

public interface FakeNewsService {

	

	public FakeNews getFakeNews(String url);
	
	public void saveFakeNews(FakeNews theFakeNews);
}
