package com.techlabs.model;

public interface MediaPlayer {
	void start();
	default void stop() {
		System.out.println("mediaPlayer has been stopped");
	}
	 static void supportedFiles() {
		System.out.println("The supported files are .mp3,.mp4,.mpeg");
	}

}
