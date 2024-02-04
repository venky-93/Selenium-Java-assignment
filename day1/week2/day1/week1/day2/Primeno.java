package week1.day2;

//week 1 day 2 Assignment 7

public class Primeno {

	public static void main(String[] args) {
		int num = 13;
		boolean var = false;
		for(int i=2 ; i<num/2 ; i++)
		{
			if(num % i == 0) 
			{
			var = true;
			break;
		}

	}

		if(!var)
		{
			System.out.println(num +" is a prime no.");
		}
		else
		{
			System.out.println(num + "is not a prime no.");
		}
}
}