package com.service;

import java.nio.file.Files;
import java.util.Comparator;

public class Sort implements Comparator<Files> {

	
	@Override
	public int compare(Files o1, Files o2) {
		
		return o1.getName().coom;
	}

}
