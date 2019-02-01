package com.streams.functionalapi;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {

	public static void main(String[] args) {

		System.out.println("========== old way ==========");
		Game football = new Game() {
			@Override
			public void play() {
				System.out.println("I am playing cricket");
			}
		};
		
		Game cricket = new Game() {
			@Override
			public void play() {
				System.out.println("I am playing cricket");
			}
		};
		
		football.play();
		cricket.play();
		
		System.out.println("========== new way ==========");
		
		Game footballLambda = () -> System.out.println("I am playing football");
		Game cricketLambda = () -> System.out.println("I am playing cricket");
		
		footballLambda.play();
		cricketLambda.play();
		
		Series cricketSeries = (series) -> System.out.println("This is " + series + " series.");
		cricketSeries.play("ODI");
		
		List<String> players = Arrays.asList("Kholi", "Sachin", "Dhoni");
		
		players.stream().filter(player -> player.equalsIgnoreCase("kholi"))
												.findFirst()
												.ifPresent(System.out::println);
		
		
	}
	

	
	interface Game {
		void play();
	}
	
	interface Series {
		void play(String series);
	}
}
