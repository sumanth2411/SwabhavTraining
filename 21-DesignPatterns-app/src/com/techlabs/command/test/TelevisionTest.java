package com.techlabs.command.test;

import com.techlabs.command.model.ICommand;
import com.techlabs.command.model.OffCommand;
import com.techlabs.command.model.OnCommand;
import com.techlabs.command.model.RemoteControl;
import com.techlabs.command.model.Television;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Television tv = new Television();

	        ICommand onCommand = new OnCommand(tv);
	        ICommand offCommand = new OffCommand(tv);

	        RemoteControl remote = new RemoteControl(onCommand);
	        remote.pressButton(); 

	        remote.setCommand(offCommand);
	        remote.pressButton();  

	}

}
