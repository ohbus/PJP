package com.subho.wipro.pjp.tm02.proj;

public class Video {
	String[] videoName = new String[100];
	boolean[] checkout = new boolean[100]; // by default all values of the array is false
	int[] rating = new int[100];
	
	Video(String name){   // Parameterised constructor
		;
	}
	
	public void setVideoName(int i, String name ) {  //set video name
		videoName[i] = name;
	}
	public String getName(int i) {   // return movie name
		return videoName[i];
	}
	
	public void doCheckout(int i) {     // set checkout
		if(checkout[i] == false)
			checkout[i] = true;
	}
	
	public void doReturn(int i ) {       //set return
		if(checkout[i] == true) {
			checkout[i] = false;
		}
	}
	
	public void recieveRating(int i, int rate) {    //set rating 
		rating[i] = rate;
	}
	
	public int getRating(int i) {     // return rating
		return rating[i];
	}
	
	public boolean getCheckout(int i) {  // return checkout status
		return checkout[i];
	}
}