package com.techlabs.test;

import com.techlabs.model.Audio;
import com.techlabs.model.Playable;
import com.techlabs.model.Video;

public class PlayableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable audio = new Audio("Song");
        Playable video = new Video("Movie", "1080p");
        
        audio.play();
        audio.pause();
        audio.stop();

        video.play();
        video.pause();
        video.stop();
        

	}

}
