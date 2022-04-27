package model;

import java.time.LocalDate;

public class Hike {
	private String trailId;
	private LocalDate localDate;
	private double duration;
	
	
	public Hike(String trailId, LocalDate localDate, double duration) {
		super();
		this.trailId = trailId;
		this.localDate = localDate;
		this.duration = duration;
	}


	public String getTrailId() {
		return trailId;
	}


	public void setTrailId(String trailId) {
		this.trailId = trailId;
	}


	public LocalDate getLocalDate() {
		return localDate;
	}


	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}


	public double getDuration() {
		return duration;
	}


	public void setDuration(double duration) {
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "Hike [trailId=" + trailId + ", Date=" + localDate + ", duration=" + duration + "]";
	}
	
	

}
