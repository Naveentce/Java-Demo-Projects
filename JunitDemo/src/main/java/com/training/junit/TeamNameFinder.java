package com.training.junit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TeamNameFinder {

	public static void main(String[] args) throws IOException {
		BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in)); 
      
     // Reading data using readLine 
     String name = reader.readLine(); 
		if (name != null) {
			//System.out.println(findTeamName(name));
		}

	}
	
	public String findTeamName(String teamMemberName) {
		String teamName = null;
		List<String> teamList = new ArrayList<String>(Arrays.asList("Naresh", "Rajiv", "Sakthi", "Navaneethan")) ;
		
		if(teamList.contains(teamMemberName)) {
			teamName = "Spartans";
		} else {
			teamName = "Panthers";
		}
		return teamName;
	}

	public void throwExceptionsForMe() throws Exception {
		throw new Exception();
		
	}

}
