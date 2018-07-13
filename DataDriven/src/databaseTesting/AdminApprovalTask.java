package databaseTesting;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Scanner;

public class AdminApprovalTask extends ClassUtils {

	public static PreparedStatement pre;
	public static void AdminLogin() throws Exception
	{
		Scanner sc=new Scanner(System.in);
    	System.out.println("WelCome.......Choose any option");
    	System.out.println("1.Admin Form.......");
    	System.out.println("2.User Registration Form.......");
      	System.out.println("3.View User Profile.......");
    	int userchoice =sc.nextInt();
    	switch(userchoice)
    	{
    	case 1: 
    		AdminApprovalTask.Admindetails();
    		break;
    	case 2:
    		AdminApprovalTask.UserRegistration();
    		break;
    	case 3:
    		AdminApprovalTask.UserFormFetching();
    		break;
    	default:
    		System.out.println("Thank you");
    		break;
    	}
        
        
      }
	
	public static void Admindetails() throws Exception
	{
		try
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
        	AdminApprovalTask.AdminnotApproval();
        	AdminApprovalTask.AdminApproval();
        }
        else
        {
           //System.out.flush();  
        	System.out.println("You have given wrong details");
        }
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
	}

	
	public static void UserRegistration()
	{
		try {
			
			 System.out.println("Welcome to UserRegistration Form .........");
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter UserName");
		     String UserName=sc.next();
		     System.out.println("Enter Pwd");
		     String Pwd=sc.next();
		     System.out.println("Enter EmailId");
		     String EmailId=sc.next();
		     System.out.println("Enter PhoneNo");
		     String PhoneNo=sc.next();
		     
		 	 ClassUtils.Utils();
		     pre=con.prepareStatement("insert into userregistraion(username,pwd,emailid,phoneno,AdminApprove) values (?,?,?,?,'No')");
		     
		     pre.setString(1, UserName);
		     pre.setString(2, Pwd);
		     pre.setString(3, EmailId);
		     pre.setString(4, PhoneNo);
		    
			   int i=pre.executeUpdate();
			   if(i==1){
				   System.out.println("Successfully Registered");
				  // AdminApprovalTask.UserFormFetching();
			   }
			   else{
				   System.out.println("Unsuccessfull...");
			    }
		    } 
			catch(Exception e)
			{
				
				System.out.println(e);
			}
	}
	
	public static void UserFormFetching()
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name or UserName");
		String UserName =sc.next();
		
		System.out.println("Enter Password");
		String Password =sc.next();
		ClassUtils.Utils();
	
    	pre=con.prepareStatement("select * from userregistraion");
        ResultSet rs=pre.executeQuery();
        HashSet<String> hs=new HashSet<>();
        while(rs.next()){
        	
        	hs.add(rs.getString("username"));
        	hs.add(rs.getString("pwd"));
        }
        
        if(hs.contains(UserName)&& hs.contains(Password))
        {
        
        	
          
			ClassUtils.Utils();
		    pre=con.prepareStatement("select * from userregistraion where  AdminApprove='Approved' and username=? and pwd=?");
		    pre.setString(1, UserName);
		    pre.setString(2, Password);
            ResultSet rs1=pre.executeQuery();
		    
		    
				if(rs1.next())
				{
			    System.out.println("Welwome to the UserProfile form ");
		    	System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
				System.out.println("username:::"+rs1.getString(2));
				//System.out.println("PassWord::::"+rs1.getString(3));
				System.out.println("Email:::::::::::"+rs1.getString(4));
				System.out.println("PhoneNo:::::::::::"+rs1.getString(5));
				}
				else
				{
					System.out.println("Admin did not give permissions to view ur profile");
				}
			
	    	 
        }
        else
        {
        	System.out.println("You are not registered user ");
        }
		
	}catch(Exception e){
		System.out.println(e);
	}
	}
	public static void AdminnotApproval()
	{
	
		try
		{
		
			System.out.println("Welcome to admin approval form.............");
            ClassUtils.Utils();
		    pre=con.prepareStatement("select * from userregistraion where AdminApprove='No' ");
		    ResultSet rs1=pre.executeQuery();
		    HashSet<String> hs=new HashSet<>();
	        while(rs1.next())
	        {
	        	
	        	hs.add(rs1.getString("username"));
	        	
	        }
		    
		    if (hs.size()>0)
		    {
                 
		    	
		    	ClassUtils.Utils();
			    pre=con.prepareStatement("select * from userregistraion where AdminApprove='No' ");
			    ResultSet rs2=pre.executeQuery();
		    while(rs2.next())
		    {
		    	
		    	System.out.println("This Record is not Approved :::::::");
				System.out.println("username:::"+rs2.getString(2));
				//System.out.println("PassWord::::"+rs2.getString(3));
				System.out.println("Email:::::::::::"+rs2.getString(4));
				System.out.println("PhoneNo:::::::::::"+rs2.getString(5));
				System.out.println("AdminApproval :::::::::::"+rs2.getString(6));
		    	
			}
		    }
		    else
		    {
		    	System.out.println("There is no records to approve");
		    }
		    
		
		    System.out.println("");
        
		
	    }catch(Exception e)
		{
		    System.out.println(e);
	    }
	
		
	}
	public static void AdminApproval()
	{
		
		try
		{
			Scanner sc=new Scanner(System.in);
			String username="";
		  	
	    	ClassUtils.Utils();
	    	pre=con.prepareStatement("select * from userregistraion where AdminApprove='No'  ");
	        ResultSet rs1=pre.executeQuery();
	        HashSet<String> hs=new HashSet<>();
	        while(rs1.next()){
	        	hs.add(rs1.getString("username"));
	        }
	        if (hs.size()>0)
	        {
	    	System.out.println("Enter the UserName to Update:::::");
	    	username=sc.next();
	        
	        if(hs.contains(username))
	           {
	        	 ClassUtils.Utils();
	             pre=con.prepareStatement("update userregistraion set AdminApprove='Approved' where username=? ");
	         
	             pre.setString(1, username);
	             int i=pre.executeUpdate();
	             if(i==1){
	           	  System.out.println("Successfully Approved ::::");
	            }
	        else{
	          	  System.out.println("You Cant Approve ,you have given wrong details::::");
	            }
	          	
	          	
	        }
	         
	    	
	    }
	        System.out.println(" ");
		
	}catch(Exception e){
		System.out.println(e);
	}
		
	

	}
}
