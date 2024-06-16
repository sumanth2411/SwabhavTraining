package com.techlabs.model;

import java.io.Serializable;

public class Movies implements Serializable {
	private int movieId;
    private String name;
    private String genre;
    private int year;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Movies(int movieId, String name, String genre, int year) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.genre = genre;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", name=" + name + ", genre=" + genre + ", year=" + year + "]";
	}
    
	

}
