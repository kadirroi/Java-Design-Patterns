package com.roi.desingpatterns.behavirol.state;

public class Socket {

	private int port;
	
	private ISocketState socketState;

	public Socket(int port) {
		super();
		this.port = port;
		socketState = new SocketOpenConnection();
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ISocketState getSocketState() {
		return socketState;
	}

	public void setSocketState(ISocketState socketState) {
		this.socketState = socketState;
	}
	
	public void Do() {
		this.socketState.handle(this);
	}
}
