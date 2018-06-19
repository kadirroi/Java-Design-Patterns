package com.roi.desingpatterns.behavirol.state;

public class SocketListener implements ISocketState{

	@Override
	public void handle(Socket socket) {
		System.out.println("Socket is listening port");
		socket.setSocketState(new SocketClose());
	}

}
