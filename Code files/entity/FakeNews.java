package com.vishwa.capstone.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "fakenews")
public class FakeNews {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="url")
	private String url;
	
	@Column(name="headline")
	private String headline;
	
	@Temporal(TemporalType.DATE)
	private Date date_of_upload;

	public FakeNews() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public Date getDate_of_upload() {
		return date_of_upload;
	}

	public void setDate_of_upload(Date date_of_upload) {
		this.date_of_upload = date_of_upload;
	}

	@Override
	public String toString() {
		return "FakeNews [id=" + id + ", url=" + url + ", headline=" + headline + ", date_of_upload=" + date_of_upload
				+ "]";
	}
	
	
	
}
