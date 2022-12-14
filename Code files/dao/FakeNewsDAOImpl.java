package com.vishwa.capstone.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vishwa.capstone.entity.FakeNews;

@Repository
public class FakeNewsDAOImpl implements FakeNewsDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public FakeNews getFakeNews(String url) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		FakeNews theFakeNews=currentSession.get(FakeNews.class, url);
		
		return theFakeNews;
	}
	
	@Override
	public void saveFakeNews(FakeNews theFakeNews) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theFakeNews);
	}
	
	
}
