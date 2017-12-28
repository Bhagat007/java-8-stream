package com.api.java8.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalBasicExample {
	
public static  Map<String,String>  	doit( Map<String,String> map){
	
	return map;
		
	}

    public static void main(String[] args) {

    	
    	
    	Map<String,String> map =new HashMap<String, String>();
    	
    	
    	map.put("null","bhagat");
    	map.put("singh","645163");
    	map.put("Saroj","null");
    	map.put("BHim","null");
    	Optional.ofNullable(map).ifPresent(OptionalBasicExample::doit);
    	System.out.print(Optional.of(map).get().get("singh"));
    	//System.out.println(gender.isPresent());
    	/*System.out.println(gender);
        System.out.println("Non-Empty OptionalL:" + gender);
*/
    	
        String answer1 = "Yes";
        String answer2 = null;

        /*System.out.println("Non-Empty Optional:" + gender.isPresent());
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

        // java.lang.NullPointerException
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));*/

    }

}
