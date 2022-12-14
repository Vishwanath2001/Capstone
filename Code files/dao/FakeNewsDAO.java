package com.vishwa.capstone.dao;

import com.vishwa.capstone.entity.FakeNews;

public interface FakeNewsDAO {

	public FakeNews getFakeNews(String url);
	
	public void saveFakeNews(FakeNews theFakeNews);
		
	
}
	

