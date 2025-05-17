package logic.interview;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class StarDiamondPattern 
{

	public static void main(String[] args) 
	{
		int i,j,k;
		
		for (i=1;i<=5;i++) //Forward loop
		{
			for(j=5;j>=i;j--) //backward loop
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) //forward loop
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(i=4;i>=1;i--) // Backward loop
		{
			for(j=4;j>=i;j--) //Backward loop
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) //Forward Loop
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}



	}

}
