package databaseTesting;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
//import java.sql.Statement;
import java.util.Scanner;

public class CrudOperations  extends ClassUtils{

	
	public static PreparedStatement pre;
	public static void Insert() throws Exception
	{
	try {
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter UserName");
     String UserName=sc.next();
     System.out.println("Enter Pwd");
     String Pwd=sc.next();
     /*System.out.println("Enter Id");
     String Id=sc.next();*/
 	 ClassUtils.Utils();
     pre=con.prepareStatement("insert into emp (USERNAME,PWD) values (?,?)");
     
     pre.setString(1, UserName);
     pre.setString(2, Pwd);

    
	   int i=pre.executeUpdate();
	   if(i==1){
		   System.out.println("Insert Success");
	   }
	   else{
		   System.out.println("Not Success");
	    }
    } 
		catch(Exception e)
		{
			 System.out.println(e);
		}
		
	}
	

	public static void fetch() {
	try{
		ClassUtils.Utils();
		 pre=con.prepareStatement("select * from emp");
		ResultSet rs=pre.executeQuery();
		  while(rs.next()){
				
				System.out.println("UserName:::"+rs.getString(1));
				System.out.println("PassWord::::"+rs.getString(2));
				System.out.println("Id:::::::::::"+rs.getString(3));
			
			}
	    	
		
	}catch(Exception e){
		System.out.println(e);
	}
	}
	
	
	public static void update()
	{
	try{
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the UserName to Update:::::");
    	String username=sc.next();
    	ClassUtils.Utils();
    	pre=con.prepareStatement("select * from emp");
        ResultSet rs=pre.executeQuery();
        HashSet<String> hs=new HashSet<>();
        while(rs.next()){
        	hs.add(rs.getString("username"));
        }
        if(hs.contains(username)){
        	System.out.println("Record Found::::");
        	System.out.println("Enter the Details to Update:::::");
        	System.out.println("Enter the PassWord:::::::");
     	    String password=sc.next();
     	 
     	   System.out.println("Enter the Id::::::::::::::::::::");
     	   int id=sc.nextInt();
     	   
     	   System.out.println("Enter the username::::::::::::::::::::");
    	   String username1=sc.next();
    	   
     	   ClassUtils.Utils();
           pre=con.prepareStatement("update emp set pwd=?,id=?,username=? where username=?");
           pre.setString(1, password);
           pre.setInt(2, id);
           pre.setString(3, username1);
           pre.setString(4, username);
           int i=pre.executeUpdate();
           if(i==1){
         	  System.out.println("Update Success::::");
          }else{
        	  System.out.println("Update Not Success::::");
          }
        	
        	
        }else{
        	System.out.println("Record Not Found::::");
        }
    }catch(Exception e){
    	System.out.println(e);
    }
		
		
		
	}

	public static void delete() {
		try{
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the UserName to Delete:::::");
	    	String username=sc.next();
	    	ClassUtils.Utils();
	    	pre=con.prepareStatement("select * from emp");
	        ResultSet rs=pre.executeQuery();
	        HashSet<String> hs=new HashSet<>();
	        while(rs.next()){
	        	hs.add(rs.getString("username"));
	        }
	        if(hs.contains(username)){
	        	System.out.println("Record Found::::");
	            ClassUtils.Utils();
	            pre=con.prepareStatement("delete from emp where username=?");
	            pre.setString(1, username);
	          int i=pre.executeUpdate();
	          if(i==1){
	        	  System.out.println("Delete Success::::");
	          }else{
	        	  System.out.println("Delete Not Success::::");
	          }
	        	
	        	
	        }else{
	        	System.out.println("Record Not Found::::");
	        }
	    	
	    }
		catch(Exception e)
		{
	    	System.out.println(e);
	    }		
	}

}

