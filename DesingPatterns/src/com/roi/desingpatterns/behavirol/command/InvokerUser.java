package com.roi.desingpatterns.behavirol.command;

import java.util.ArrayList;
import java.util.List;

public class InvokerUser {

	private List<CommandUser> commandUsers;

	public InvokerUser() {

		commandUsers = new ArrayList<>();
	}

	public List<CommandUser> getCommandUsers() {
		return commandUsers;
	}

	public void setCommandUsers(List<CommandUser> commandUsers) {
		this.commandUsers = commandUsers;
	}

	public void executeAll() {
		for (CommandUser commandUser : commandUsers) {
            commandUser.execute();
		}
	}
}
