package com.techlabs.test;

import com.techlabs.model.AudioPlayer;
import com.techlabs.model.MediaPlayer;
import com.techlabs.model.Podcast;
import com.techlabs.model.VideoPlayer;

public class MediaPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediaPlayer player=new AudioPlayer();
		MediaPlayer.supportedFiles();
		player.start();
		player.stop();
		
		player=new VideoPlayer();
		MediaPlayer.supportedFiles();
		player.start();
		player.stop();
		
		player=new Podcast();
		MediaPlayer.supportedFiles();
		player.start();
		player.stop();
		

	}

}
