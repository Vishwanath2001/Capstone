package com.vishwa.capstone.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.vishwa.capstone.dao.FakeNewsDAO;
import com.vishwa.capstone.entity.FakeNews;

public class FakeNewsServiceImpl implements FakeNewsService {
	
	
	@Autowired
	private FakeNewsDAO fakeNewsDAO;

	@Override
	@Transactional
	public FakeNews getFakeNews(String url) {
		
		return fakeNewsDAO.getFakeNews(url);
	}

	@Override
	@Transactional
	public void saveFakeNews(FakeNews theFakeNews) {
		
		 fakeNewsDAO.saveFakeNews(theFakeNews);
	}

}
