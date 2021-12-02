package com.xworkz.dto.dp.dao;

import com.xworkz.dto.dp.dto.WebSeriesDTO;

public class WebSeriesDAO {

	private WebSeriesDTO[] webSeries = new WebSeriesDTO[10];
	private int count = 0;

	public void save(WebSeriesDTO name) {
		if (this.count < 0 && name != null) {
			this.webSeries[this.count++] = name;
			System.out.println("invoked save method".concat(String.valueOf(name)));
		} else {
			System.err.println("Array is full".concat(String.valueOf(count)));

		}

	}

	public void delete(int index) {
		if (index >= 0 && index < webSeries.length) {

			this.webSeries[index] = null;
			System.out.println("index is deleted".concat(String.valueOf(index)));
		} else {
			System.out.println("index is pointing to null");
		}

	}

	public void update(int index, WebSeriesDTO name) {
		if (index >= 0 && index < webSeries.length && name != null) {
			this.webSeries[index] = name;
			System.out.println("The array is updated and not pointing to null ".concat(String.valueOf(index)));
		} else {
			System.out.println("The index is updated ".concat(String.valueOf(index)));
		}
	}

	public WebSeriesDTO[] getWebSeries() {
		return webSeries;
	}

}
