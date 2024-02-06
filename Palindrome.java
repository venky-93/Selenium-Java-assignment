package week1.day2;

//Week1 Day2 Assignment 6

public class Palindrome {

	public static void main(String[] args) {
       int no =34343;
       int temp = no;
       int rev = 0,rem;
       while(temp!=0)
       {
    	   rem=temp%10;
    	   rev=rev*10+rem;
    	   temp = temp/10;
    	   
       }
        if(no==rev)
        {
        	System.out.println(no + " is palindrome");
        }
        else {
        	System.out.println(no + " is not palindrome");
        }
	}

}
