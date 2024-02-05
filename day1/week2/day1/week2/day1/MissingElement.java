package week1.day2;

//week1 day2 Assignment 5

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,7,6,8};
		Arrays.sort(a);
		int sum1 = 0;
		for(int i =0;i<a.length ; i++)
		{
			sum1=sum1 + a[i];
			
			}
		System.out.println(sum1);
		
		int sum2 = 0;
		for(int i =1;i<=8;i++)
		{
			sum2 = sum2 + i;
			
			
		}
		System.out.println(sum2);
		System.out.println((sum2-sum1));

	}
}