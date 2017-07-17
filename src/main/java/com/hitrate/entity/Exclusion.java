package com.hitrate.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Exclusion {
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Date getExcludedSince() {
		return excludedSince;
	}

	public void setExcludedSince(Date excludedSince) {
		this.excludedSince = excludedSince;
	}

	public Date getExcludedTill() {
		return excludedTill;
	}

	public void setExcludedTill(Date excludedTill) {
		this.excludedTill = excludedTill;
	}

	private String host;
	private Date excludedSince;
	private Date excludedTill;
}
