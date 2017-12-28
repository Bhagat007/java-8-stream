package com.api.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamDemo {
	
	String str;
	public StreamDemo() {
	}
	
	public StreamDemo(String str) {
		this.str=str;
	}
	
	public String  nonStaticMethod(String s){
		return s;
	}
	public static Integer staticMethod(Integer s){
		return s;
	}
	
	
	public void print() {
	    System.out.println(str);
	}

	 public static void main(String[] args) {
		 
		List<String> strings= Arrays.asList("bhagat","Singh","Poonam","Harit","Rahul");
		List<Integer> integers= Arrays.asList(1,1,2,3,3,4,5,8,0,8,9);
		
		
/*
*static method call with method reference
*/		
	System.out.println(integers.stream().map(StreamDemo::staticMethod).collect(Collectors.toList()));
/*
 * Non static method call with method reference only possible if you have collection of same class object.
 *   
*/
    Arrays.asList(new StreamDemo("a"), new StreamDemo("b")).forEach(StreamDemo::print);	
/*
*    Non static method call with method reference
*/
	System.out.println(strings.stream().map(new StreamDemo()::nonStaticMethod).collect(Collectors.toList()));

 }
}