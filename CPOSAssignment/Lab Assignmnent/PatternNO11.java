/*class PatternNO11
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)      		// Row
		{
			for(int j=4; j>=i; j--)				//Spaces
			{
				System.out.print(" ");
			}	
			for(int k=1; k<=i; k++)// if the condition is reverse so.....
			{
				if()
				System.out.print("* ");
				else
				System.out.print("* ");
					
			}System.out.println();
				
		}
	}
}*/


class PatternNO11
{
	public static void main(String args[])
	{

		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}