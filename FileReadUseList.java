package com.streams.files;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReadUseList {
public static void main(String[] args) {
	
	try {
	String path="C://Files/file.txt";
	List<String> lines=Files.readAllLines(Paths.get(path));
	for(String line:lines) {
		System.out.println(line);
	}
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	
	
}
}
