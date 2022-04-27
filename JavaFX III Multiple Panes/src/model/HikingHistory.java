package model;

import java.util.ArrayList;

public class HikingHistory {
	private ArrayList<Hike> hikes;
	private TrailBag trailBag;
	
	public HikingHistory(TrailBag trailBag) {
		hikes = new ArrayList<>();
		this.trailBag = trailBag;
	}
	
	public HikingHistory() {}
	
	public void addHike(Hike hike) {
		hikes.add(hike);
	}
	
	public ArrayList<Hike> getHistory() {
		return hikes;
	}
	
	public Hike findByTrailName(String name) {
		String idFound = trailBag.findByName(name).getId();
		for(int i = 0; i < hikes.size(); i++) {
			if (hikes.get(i).getTrailId().equals(idFound)) {
				return hikes.get(i);
			}
		}
		return null;
	}
}
