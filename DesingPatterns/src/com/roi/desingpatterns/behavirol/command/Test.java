package com.roi.desingpatterns.behavirol.command;

public class Test {

	public static void main(String[] args) {
		User user  = new User();
		user.setId(100);
		user.setUserName("Max");
        
		ReceiverUser receiverUser = new ReceiverUser(user);
		
		CommandUser commandUserAdd = new ConcreteCommandUserAdd(receiverUser);
		CommandUser commandUserDelete = new ConcreteCommandUserDelete(receiverUser);
		
		InvokerUser invokerUser = new InvokerUser();
		invokerUser.getCommandUsers().add(commandUserAdd);
		invokerUser.getCommandUsers().add(commandUserDelete);
		
		invokerUser.executeAll();
	}

}
