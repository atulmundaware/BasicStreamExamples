package com.streams.functionalapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapExample {

	public static void main(String[] arv) {
		  List<User> users = Arrays.asList(
				  new User("Atul",27,Arrays.asList("1","2")),
				  new User("Vinay",27,Arrays.asList("3","4")),
				  new User("Shubham",27,Arrays.asList("5","6")),
				  new User("Amit",27,Arrays.asList("7","8"))
		  );
	      
		  Optional<String> stringOptional = users.stream()
										  			.map(user->user.getPhoneNumber().stream())
										  			.flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("5")))
										  			.findAny();
		  stringOptional.ifPresent(System.out::println);
	      users.forEach(System.out::println);
	    
	}
	
	public static boolean isNotVinay(String name) {
		return !name.equalsIgnoreCase("Vinay");
	}
	
	static class User {
		private String name;
		private Integer age = 23;
		private List<String> phoneNumber;
		
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
		
		public User(String name, Integer age, List<String> phoneNumber) {
			super();
			this.name = name;
			this.age = age;
			this.phoneNumber = phoneNumber;
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

		public List<String> getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(List<String> phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
		}
		
		
	}
	
}
