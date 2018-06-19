package com.roi.desingpatterns.behavirol.state;

public class SocketClose implements ISocketState {

	@Override
	public void handle(Socket socket) {
		System.out.println("Socket is closed");
		socket.setSocketState(new SocketOpenConnection());
	}
   
	
}
