package week3.day2;

//Week3 Day2 Assignment 9

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
	String[] companyName = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		Arrays.sort(companyName);
		

		List <String> companyList  = new ArrayList<String>();
		for (int i=0 ; i<companyName.length ; i++)
		{
			companyList.add(companyName[i]);
			
		}
		System.out.println(companyList);
		Collections.sort(companyList);
		System.out.println("Ascending Order" +companyList);
		Collections.reverse(companyList);
		System.out.println("Descending Order" +companyList);
	}

}
