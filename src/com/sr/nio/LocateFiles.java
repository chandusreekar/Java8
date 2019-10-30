package com.sr.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LocateFiles {
	public static void main(String[] args) {
		System.out.println("************list()******************");
		try(Stream<Path> paths = Files.list(Paths.get("repo"))){
			paths.forEach(System.out::println);
			
		}
		catch(IOException io) {
			io.printStackTrace();
		}
		
		System.out.println("***************walk()*******************");
		try(Stream<Path> walkPaths = Files.walk(Paths.get("repo"))){
			walkPaths
			.filter(f->Files.isRegularFile(f))
		//	.filter(f->f.toString().endsWith(".txt"))
			.forEach(System.out::println);
		}
		catch(IOException io) {
			io.printStackTrace();
		}
	}

}
