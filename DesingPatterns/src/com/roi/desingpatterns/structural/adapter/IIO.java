package com.roi.desingpatterns.structural.adapter;

public interface IIO {

	void createTextFile(String path);

	void createFolder(String path);

	void copy(String source, String destination);

}
