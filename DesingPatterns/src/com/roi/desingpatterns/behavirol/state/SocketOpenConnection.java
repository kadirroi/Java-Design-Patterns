package com.roi.desingpatterns.behavirol.state;

public class SocketOpenConnection  implements ISocketState {

	@Override
	public void handle(Socket socket) {
		// TODO Auto-generated method stub
	    System.out.println("Socket is opened");
		socket.setSocketState(new SocketListener());
		
	}
}
