package com.xworkz.dto.dp.dto;

import com.xworkz.dto.dp.constants.Genre;

public class WebSeriesDTO {
	private String name;
	private Genre genre;
	private String cast;
	private int noofCharacters;
	private String rating;
	private int totalSeasons;
	private int currentSeason;

	public WebSeriesDTO() {
		System.out.println("invoked no argument constructor");
	}

	public WebSeriesDTO(String name, Genre genre, String cast, int noofCharacters, String rating, int totalSeasons,
			int currentSeason) {
		super();
		this.name = name;
		this.genre = genre;
		this.cast = cast;
		this.noofCharacters = noofCharacters;
		this.rating = rating;
		this.totalSeasons = totalSeasons;
		this.currentSeason = currentSeason;
	}

	public String getName() {
		return name;
	}

	public Genre getGenre() {
		return genre;
	}

	public String getCast() {
		return cast;
	}

	public int getNoofCharacters() {
		return noofCharacters;
	}

	public String getRating() {
		return rating;
	}

	public int getTotalSeasons() {
		return totalSeasons;
	}

	public int getCurrentSeason() {
		return currentSeason;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public void setNoofCharacters(int noofCharacters) {
		this.noofCharacters = noofCharacters;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setTotalSeasons(int totalSeasons) {
		this.totalSeasons = totalSeasons;
	}

	public void setCurrentSeason(int currentSeason) {
		this.currentSeason = currentSeason;
	}

}
