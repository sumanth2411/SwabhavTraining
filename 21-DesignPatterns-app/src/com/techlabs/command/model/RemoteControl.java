package com.techlabs.command.model;

public class RemoteControl {
	  private ICommand command;

	public RemoteControl(ICommand command) {
		super();
		this.command = command;
	}

	public ICommand getCommand() {
		return command;
	}

	public void setCommand(ICommand command) {
		this.command = command;
	}

	public void pressButton() {
        command.execute();
    }

}
