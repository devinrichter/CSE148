package model;

import java.util.ArrayList;

import model.Trail.TrailType;

public class TrailBag implements Bagable {
	private Trail[] arr;
	private int nElems;

	public TrailBag(int maxSize) {
		arr = new Trail[maxSize];
	}

	@Override
	public void display() {

	}
	
	public Trail findByName(String name) {
		for(int i =0; i < nElems; i++) {
			if(arr[i].getName().equals(name)) {
				return arr[i];
			}
		}
		return null;
	}

	public ArrayList<Trail> searchByWordsInTrailName(String words) {
		return null;
	}

	public ArrayList<Trail> searchByTrailType(TrailType type) {
		return null;
	}

	public ArrayList<Trail> searchByTrailLength(double length) {
		return null;
	}

}
