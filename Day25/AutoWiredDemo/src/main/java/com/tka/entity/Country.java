package com.tka.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {
	
	int cid;
	String cname;
	
	public Country() {
		
	}
	
	public Country(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	@Autowired
	public void setCid(@Value("9") int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	
	@Autowired
	public void setCname(@Value("India") String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	

}
