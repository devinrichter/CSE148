package model;

public class Trail {
	private String name;
	private String id;
	private TrailType trailType;
	private double length;
	private TrailLevel trailLevel;
	private int elevation_gain;
	
	public static int idCounter = 0;
	
	public enum TrailType {
		LOOP, OUT_AND_BACK, POINT_TO_POINT
	}
	
	public enum TrailLevel {
		EASY, MODERATE, HARD
	}

	public Trail(String name, TrailType trailType, double length, TrailLevel trailLevel, int elevation_gain) {
		super();
		this.name = name;
		this.trailType = trailType;
		this.length = length;
		this.trailLevel = trailLevel;
		this.elevation_gain = elevation_gain;
		id = String.valueOf(idCounter++);
	}

	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
}
