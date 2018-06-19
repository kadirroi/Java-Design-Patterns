package com.roi.desingpatterns.structural.adapter;

public class BatchIO {

	public void createTextFile(String path) {
		System.out.println("Text file is created to " + path);

	}

	public void createFolder(String path) {

		System.out.println("Folder is created to " + path);

	}

	public void copy(String source, String destination) {
		System.out.println("The file  was copied from " + source + " to " + destination);

	}

}
