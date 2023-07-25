package com.biconsumer;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram {

	
		
		public static void main (String [] args) {
			String name="nayam";
			String anagram="mayan";
			  Map<Character,Long> charVsCount= mapToCount(name);
			  Map<Character,Long> charVsCount2= mapToCount(anagram);

			 if(charVsCount.equals(charVsCount2)) {
				 System.out.println("anagram");
			 }
			 else {
				 System.out.println("Not Anagram");
			 }
		}
	public static Map<Character,Long> mapToCount(String name){
		 return name.chars()
          .mapToObj(c -> (char) c)
          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
	
}
