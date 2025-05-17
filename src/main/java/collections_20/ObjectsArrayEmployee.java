package collections_20;

import java.util.Scanner;

public class ObjectsArrayEmployee //Objects Array Class
{
	
		int id;
		String name;
		String department;
		Scanner sc=new Scanner(System.in);
		
		public void getData()
		{
			System.out.println("Enter Employee ID");
			id=sc.nextInt();
			System.out.println("Enter Employee Name");
			name=sc.next();
			System.out.println("Enter Employee Department");
			department=sc.next();
		}
		public void showData()
		{
			System.out.println("Employee ID= "+id+"\n"+"Employee Name= "+name+"\n"+"Employee Department= "+department);
			
		}
		public static void main(String[] args) 
		{
			ObjectsArrayEmployee emp[]=new ObjectsArrayEmployee[5];
			//int a[]=newint[5];
			for(int i=0;i<emp.length;i++)//Array enter input elements
			{
				emp[i]=new ObjectsArrayEmployee();//each objects memory allocation like object declare first
				emp[i].getData();//then enter data in memory
				
			}
			for(int i=0;i<emp.length;i++)//array output elements
			{
				emp[i].showData();
			}
				
		}
		
}
