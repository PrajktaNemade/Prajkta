/*class Pattern11
{
	public static void main(String args[])
	{
	for(int i=1;i<=5;i++)
	{
		for(int k=2;k<=i;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=5;j++)
		{
		
			System.out.print("*");
	    }
		for(int l=5;l<=1;l--)
		{
		
			System.out.print("*");
	    }
		
		System.out.println();
	}
}
}*/



class Pattern11
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
			System.out.print("*");
			}
			System.out.println();
			for(int k=1;k<=i;k++)
			{
			System.out.print(" ");
			}
		}
	}
}