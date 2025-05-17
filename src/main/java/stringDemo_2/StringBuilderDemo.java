package stringDemo_2;

public class StringBuilderDemo 
{

	public static void main(String[] args) 
	{
        String s = new String("This ");
        
        s+="is ";
        s+="String object";
        
        System.out.println(s);

        StringBuilder sb = new StringBuilder("This ");
        
        sb.append("is ");
        sb.append("StringBuilder object");
        
        System.out.println(sb);
        
        StringBuilder builder=new StringBuilder("hello");  
        builder.append("java");  
        System.out.println(builder);  

	}

}
