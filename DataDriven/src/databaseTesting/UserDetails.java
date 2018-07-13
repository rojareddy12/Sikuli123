package databaseTesting;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Scanner;

public class UserDetails extends ClassUtils

{
	public static PreparedStatement pre;
	public static void AdminLogin() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the below details for Admin Login");
    	System.out.println("Enter the Admin UserName :::::");
    	String AdminUserName=sc.next();
    	
    	System.out.println("Enter the Admin Password :::::");
    	String AdminPassword=sc.next();
    	
    	ClassUtils.Utils();
    	pre=con.prepareStatement("select * from admintable");
        ResultSet rs=pre.executeQuery();
        HashSet<String> hs=new HashSet<>();
        while(rs.next()){
        	hs.add(rs.getString("username"));
        	hs.add(rs.getString("pwd"));
        }
        if(hs.contains(AdminUserName) && hs.contains(AdminPassword))
        {
        
        	System.out.println("Welwome to the Admin form ");
            UserDetails.UserDails();
 
            
        		System.out.println("Do you wanna Go to user Details form, if yes Enter y else enter no");
        		String  yes=sc.next();
        	   if(yes.equals("y"))
        	   {
        		  UserDetails.getStuidendetails();
        	   }
        	   else
        	   {
        		   System.out.println(":::::::::::Thank You ::::::::::::");
        	   }
        }
        else
        {
            System.out.flush();  
        	System.out.println("You have given wrong details");
        }
	}
	
	
	public  static void UserDails()
	{
		try {
			
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter Student UserName");
		     String UserName=sc.next();
		     System.out.println("Enter Student Pwd");
		     String Pwd=sc.next();
		     System.out.println("Enter Student Email");
		     String Email=sc.next();
		     System.out.println("Enter Student TELUGU");
		     int TELUGU=sc.nextInt();
		     System.out.println("Enter Student ENGLISH");
		     int ENGLISH=sc.nextInt();
		     System.out.println("Enter Student HINDI");
		     int HINDI=sc.nextInt(); 
		     System.out.println("Enter Student MATHS");
		     int MATHS=sc.nextInt();
		     System.out.println("Enter Student SCIENCE");
		     int SCIENCE=sc.nextInt();
		     System.out.println("Enter Student SOCAIL");
		     int SOCIAL=sc.nextInt();
		    
		     /*System.out.println("Enter Id");
		     String Id=sc.next();*/
		 	 ClassUtils.Utils();
		     pre=con.prepareStatement("insert into USERDETAILS(username,userpwd,email,telugu,english,hindi,maths,science,socail) values (?,?,?,?,?,?,?,?,?)");
		     
		     pre.setString(1, UserName);
		     pre.setString(2, Pwd);
		     pre.setString(3, Email);
		     pre.setInt(4, TELUGU);
		     pre.setInt(5, ENGLISH);
		     pre.setInt(6, HINDI);
		     pre.setInt(7, MATHS);
		     pre.setInt(8, SCIENCE);
		     pre.setInt(9, SOCIAL);
		

		    
			   int i=pre.executeUpdate();
			   if(i==1){
				   System.out.println("UserDetails Inserted  Successfully");
			   }
			   else{
				   System.out.println("UserDetails Not Inserted");
			    }
		    } 
				catch(Exception e)
				{
					 System.out.println(e);
				}
				
			}

	public static void getStuidendetails()
	{
		try{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Student Name or UserName");
			String UserName =sc.next();
			
			System.out.println("Enter Password");
			String Password =sc.next();
			ClassUtils.Utils();
	    	pre=con.prepareStatement("select * from USERDETAILS");
	        ResultSet rs=pre.executeQuery();
	        HashSet<String> hs=new HashSet<>();
	        while(rs.next()){
	        	hs.add(rs.getString("username"));
	        	hs.add(rs.getString("userpwd"));
	        }
	        if(hs.contains(UserName)) //&& hs.contains(Password))
	        {
	        
	        	System.out.println("Welwome to the UserDetails form ");
	          
	        	/*System.out.println("Enter Student Name or UserName");
				String UserName1 =sc.next();
				
				System.out.println("Enter Password");
				String Password1 =sc.next();*/
				  ClassUtils.Utils();
			    pre=con.prepareStatement("select * from USERDETAILS where username=?");
			    pre.setString(1, UserName);
			   // pre.setString(2, Password);
			    ResultSet rs1=pre.executeQuery();
			    
			    while(rs1.next()){
					
			 
                  System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
					System.out.println("username:::"+rs1.getString(2));
					System.out.println("PassWord::::"+rs1.getString(3));
					System.out.println("Email:::::::::::"+rs1.getString(4));

					System.out.println("Telugu  Marks:::"+rs1.getInt(5));
					System.out.println("English Marks::::"+rs1.getInt(6));
					System.out.println("Hindi Marks :::::::::::"+rs1.getInt(7));

					System.out.println("Maths Marks:::"+rs1.getInt(8));
					System.out.println("Science Marks ::::"+rs1.getInt(9));
					System.out.println("Social Marks:::::::::::"+rs1.getInt(10));
					
					int Total=rs1.getInt(5)+rs1.getInt(6)+rs1.getInt(7)+rs1.getInt(8)+rs1.getInt(9)+rs1.getInt(10);
					System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
					System.out.println("Total Marks   " + Total +"  Out of 600  " );
				
				}
		    	
	        }
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}
	

