package com.streams.functionalapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FilesAPI {

	public static void main(String[] args) throws IOException {

		String filePath = "D:\\eclipse\\demo\\functionalapi\\pom.xml";
		List<String> listOfNameTagValuesFromPOM 
					 = Files.lines(Paths.get(filePath))
							.filter(line -> line.contains("<name>"))
							.map(line->{
								String name = line.replaceAll("<name>", "")
													.replaceAll("</name>", "");
								return name;
							})
							.collect(Collectors.toList());

		listOfNameTagValuesFromPOM.forEach(System.out::println);
	
	}

}
