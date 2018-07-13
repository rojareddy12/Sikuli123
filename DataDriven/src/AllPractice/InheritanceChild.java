package AllPractice;

public class InheritanceChild extends InheritanceParent implements i2 
{
	
	public InheritanceChild()
	 {
		 super.parent();
	 }
	 public void sub()
	 {
		 super.parent();
        //super.i=40;
		 int a =20;
		// int c=this.i;
		// int b =c-super.i;
		 System.out.println(a);
	 }
	 
	 public void parent()
	 {
		 int x=10;
		 System.out.println(x);
	 }
	
	 public void parent(int x)
	 {
		 int y=10;
		 System.out.println(x);
	 }
	
//	int i=50;
 public static void main(String[] args) {
	
	 InheritanceParent var=new InheritanceChild();
		//var.sub();
		//i2 var2=new InheritanceChild();
		//var.i1methd();
		i2.i1methd();
	 

		//var.parent();
 
 }
/*@Override
public void i1methd() {
	System.out.println("am in method i1");
	
}*/

 




}





