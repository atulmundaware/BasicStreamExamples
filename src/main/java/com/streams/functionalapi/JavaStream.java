package com.streams.functionalapi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] a) {
		
		//Print range
		System.out.println("Print range =>");
		IntStream
			.range(1, 10)
			.skip(5)
			.forEach(System.out::println);
		
		
		//Sum
		System.out.println("Print Sum =>");
		System.out.println(
		IntStream
			.range(1, 10)
			.sum());
		
		//Stream String
		System.out.println("Stream String =>");
		Stream.of("abc","def","aaghi")
					.sorted()
					.findFirst()
					.ifPresent(System.out::println);
		
		//Stream of array, sort, filter & print
		System.out.println("Stream of array, sort, filter & print =>");
		
		String[] names = {"abc","def","aaghi"};
		Arrays.stream(names)
					.filter(x -> x.startsWith("a"))
					.sorted()
					.forEach(System.out::println);
		
		System.out.println("print square of array no =>");
		Arrays.stream(new int[] {2, 4, 5, 8, 10})
				.map(x->x*x)
				.average()
				.ifPresent(System.out::println);
		
		
		
	}
	
}
