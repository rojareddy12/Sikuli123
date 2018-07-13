package TestNG;

import org.testng.annotations.Test;

public class TestNGPractice 
{
@Test(groups="sum")
	public void add()
	{
	    int i =1;
	    int j=2;
	    int k=i+j;
	    System.out.println(k);
	}

@Test(groups="sum")
public void sub()
{
    int i =1;
    int j=2;
    int k=i-j;
    System.out.println(k);
}
@Test(groups="mul")
public void mul()
{
    int i =1;
    int j=2;
    int k=i*j;
    System.out.println(k);
}

}
