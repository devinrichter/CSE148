package model;

import java.time.LocalDate;

public class DemoHikingHistory {

	public static void main(String[] args) {
		Hike h1 = new Hike("10", LocalDate.parse("2021-01-22"), 2.5);
		Hike h2 = new Hike("100", LocalDate.parse("2021-02-22"), 20.5);
		Hike h3 = new Hike("1000", LocalDate.parse("2021-03-22"), 200.5);
		
		HikingHistory hikes = new HikingHistory();
		hikes.addHike(h1);
		hikes.addHike(h2);
		hikes.addHike(h3);
		
		for(Hike h : hikes.getHistory()) {
			String id = h.getTrailId();
			String date = h.getLocalDate().toString();
			double duration = h.getDuration();
		}
	}

}
