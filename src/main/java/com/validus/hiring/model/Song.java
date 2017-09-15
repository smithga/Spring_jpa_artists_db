package com.validus.hiring.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Song extends BaseModel {
	protected int track;
	protected String name;
	@ManyToOne
	protected Album album;
	
	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

}
