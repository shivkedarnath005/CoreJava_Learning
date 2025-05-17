package hybrid.inheritance_13;

public class Hybrid_Son extends Hybrid_Father
{
	public void showS()    
	{    
	System.out.println("He is Son.");    
	}    
	public static void main(String args[])    
	{     
	   Hybrid_Daughter obj = new Hybrid_Daughter();  
	   obj.showD();
	   obj.showF();  
	   obj.showG();  
	   Hybrid_Son obj2 = new Hybrid_Son();  
	   obj2.showS();  
	   obj2.showF();    
	   obj2.showG();   
	}    

}
