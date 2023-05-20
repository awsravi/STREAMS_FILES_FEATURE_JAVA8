package com.streams.files;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReadUseStream {
public static void main(String[] args) throws IOException {
	
	
	String path="C://Files/file.txt";
	Stream<String> stream=Files.lines(Paths.get(path));
	stream.forEach(line ->{System.out.println(line);
	
	});
	
	
}
}
