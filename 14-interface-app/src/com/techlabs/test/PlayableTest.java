package com.techlabs.test;

import com.techlabs.model.Audio;
import com.techlabs.model.Playable;
import com.techlabs.model.Video;

public class PlayableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable audio=new Audio("kevu keka");
		audio.play();
		audio.pause();
		audio.stop();
		
		Playable video=new Video("kevu keka","144p");
		video.play();
		video.pause();
		video.stop();
		

	}

}
