package com.st.myenuma;

public enum DogE {

	REDD("R", "红狗"),
	GREEND("G", "绿狗"),
	BLUED("B", "绿狗");
	
	private String abbr;
	private String title;
	
	private DogE(String abbr, String title){
		this.abbr = abbr;
		this.title = title;
	}
	
	public String getAbbr(){
		return abbr;
	}
	public String getTitle(){
		return title;
	}
	
	public static DogE FromAbbr(String abbr){
		for (DogE d: DogE.values()){
			if (d.getAbbr().equals(abbr)){
				return d;
			}
			
		}
		
		return null;
		
	}

}
