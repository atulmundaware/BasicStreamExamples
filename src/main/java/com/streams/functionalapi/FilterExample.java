package com.streams.functionalapi;

import java.util.Arrays;
import java.util.List;

/**
 * FilterExample
 *
 */
public class FilterExample 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<String> names = Arrays.asList("Atul","Vinay","Shubham","Amit");
        
        System.out.println("================= way 1 =====================");
        names.forEach(name -> {
        	if(name.equalsIgnoreCase("Atul")) {
        		System.out.println(name);
        	}
        });
        
        
        System.out.println("================= way 2 =====================");
        names.stream()
        		.filter(name -> name.equalsIgnoreCase("Atul"))
        		.forEach(System.out::println);;
    }
}
