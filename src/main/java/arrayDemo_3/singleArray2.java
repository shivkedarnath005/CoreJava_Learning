package arrayDemo_3;

public class singleArray2 {

	public static void main(String[] args)
	{
		int student_id[]=new int[5];
		
		student_id[0]=89;
		
		student_id[1]=55;
		
		student_id[2]=75;
		
		student_id[3]=890;
		
		student_id[4]=750;
		
		int sizeofArray=student_id.length;
		
		System.out.println("Length of Array is "+sizeofArray);
		
		for(int i=0;i<sizeofArray;i++)
		{
			
			System.out.println("Students ID is "+student_id[i]);
			
		}
		
		String student_name[]=new String[5];
		student_name[0]="Mukesh";
		
		student_name[1]="Amol";
		
		student_name[2]="Deokar";
		
		student_name[3]="Vipul";
		
		student_name[4]="Ishvari";
		
        int sizeofArrays=student_id.length;
		
		System.out.println("Length of Array is "+sizeofArrays);
		
		for(int j=0;j<sizeofArrays;j++)
		{
			
			System.out.println("Students Name is "+student_name[j]);
			
		}
		
		
	}

}
