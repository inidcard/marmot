package com.grass.elephant.marmot;

import org.junit.Test;

import com.st.myenuma.DogE;
import com.st.myenuma.Size;

public class AppEnumTest {
	
	@Test
	public void testEnum01(){
		
		Size s = Size.MEDIUM;
		System.out.println("===: " + Size.SMALL);
		System.out.println("===A name: " + s.name());
		System.out.println("===A toString: " + s.toString());
		
		System.out.println(s == Size.MEDIUM);
		System.out.println(s == Size.LARGE);
		System.out.println(s.equals(Size.MEDIUM));
		System.out.println("--------------------------------------------------");

		System.out.println(s.ordinal());
		System.out.println(Size.SMALL.ordinal());
		
		System.out.println(s.compareTo(Size.LARGE));

	}

	@Test
	public void testEnum02(){
		Size s = Size.MEDIUM;
		onChosen(s);

		System.out.println("------------------------------"); 
		System.out.println(Size.SMALL == Size.valueOf("SMALL")); 

		System.out.println("------------------------------"); 
		
		DogE d = DogE.GREEND;
		System.out.println(d.getAbbr());
		
		d = DogE.FromAbbr("R");
		System.out.println(d.getTitle());

	}
	
	public void onChosen(Size s){
		
		switch(s){
		case SMALL:
			System.out.println("this is SMALL !"); break;
		case MEDIUM:
			System.out.println("this is MEDIUM!"); break;
		case LARGE:
			System.out.println("this is LARGE!"); break;
		}
		
	}
	
	
}
