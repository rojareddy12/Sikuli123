package Tasks4618;

import java.util.Scanner;

public class ShortestPolyndrome
{

	public static void main(String[] args)
	{
	 System.out.println("Please Enter your String");	
	 Scanner sc=new Scanner(System.in);
	 String s1=sc.nextLine();
     String s2="";
	 for(int i=s1.length()-1;i>=0;i--)
	 {
		 s2=s2+s1.charAt(i);
	 }
	  System.out.println(s2);
	  
	  String s3=s2+s1;
	  System.out.println(s3);
    }
}
