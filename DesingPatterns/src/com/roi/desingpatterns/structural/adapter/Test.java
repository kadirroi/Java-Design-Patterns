package com.roi.desingpatterns.structural.adapter;

public class Test {

	public static void main(String[] args) {

		IIO bufferIO = new BufferIO();
		bufferIO.createTextFile("..//..//example.txt");
		bufferIO.createFolder("..//..//Desktop");
		bufferIO.copy("..//..//example.txt", "..//..//Desktop");

        //BatchIO is converted		
		IIO batchIOAdapter = new BatchAdapter(new BatchIO());
		batchIOAdapter.createTextFile("..//..//batch.txt");
		batchIOAdapter.createFolder("..//..//Desktop");
		batchIOAdapter.copy("..//..//batch.txt", "..//..//Desktop");

	}
}
