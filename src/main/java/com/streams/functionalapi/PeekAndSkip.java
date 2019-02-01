package com.streams.functionalapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekAndSkip {
	public static void main(String[] args) {
		
		List<String> numbersAsString 
						= Stream.of("One", "Two", "Three")
							.filter(obj -> !obj.equals("One"))
							.peek(nextObj -> System.out.println("Peeked" + nextObj)) // it is generally used for logging values in between stream processes
							.collect(Collectors.toList());
		numbersAsString.forEach(System.out::println);
		
		IntStream.of(1,23,4,5,6,7)
				.skip(2) // Skips two values from further oprations
				.filter(i -> i > 5)
//				.peek(nextObj -> System.out.println("Peeked" + nextObj))
				.forEach(System.out::println);
//		numbersAsIntegers.forEach(System.out::println);
	}
}
