package com.roi.desingpatterns.structural.adapter;

public class BatchAdapter implements IIO {

	private BatchIO batchIO;

	public BatchAdapter(BatchIO batchIO) {
		super();
		this.batchIO = batchIO;
	}

	@Override
	public void createTextFile(String path) {
		 batchIO.createTextFile(path);

	}

	@Override
	public void createFolder(String path) {
		batchIO.createFolder(path);

	}

	@Override
	public void copy(String source, String destination) {
		batchIO.copy(source, destination);
	}

}
