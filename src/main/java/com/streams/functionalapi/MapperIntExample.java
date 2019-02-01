package com.streams.functionalapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperIntExample {

	public static void main(String[] arv) {
		  List<String> names = Arrays.asList("Atul","Vinay","Shubham","Amit");
	        
	      names.stream()
	        		.filter(MapperIntExample::isNotVinay)
	        		.map(User::new)
	        		.forEach(System.out::println);
	      List<User> users = names.stream()
					      			.filter(MapperIntExample::isNotVinay)
					      			.map(User::new)
					      			.collect(Collectors.toList());
	      
	      // Map to Point Example
	      int ageSum = users.stream()
	    		  				.mapToInt(User::getAge)
	    		  				.sum();

	      System.out.println(ageSum);
	}
	
	public static boolean isNotVinay(String name) {
		return !name.equalsIgnoreCase("Vinay");
	}
	
	static class User {
		private String name;
		private Integer age = 23;

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public User(String name) {
			super();
			this.name = name;
		}
		
		public User(String name, Integer age) {
			super();
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}
		
		
	}
	
}
