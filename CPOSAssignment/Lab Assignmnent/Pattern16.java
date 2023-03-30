class Pattern16
{
	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
			for(int k=4;k>=i;k--)
			{
			System.out.print(" ");
			}
		
		for(int j=0;j<=i;j++)	
		{
		if(j==i||j==0||i==4)
			{
			System.out.print("*");
			}
			else
			{
			System.out.print(" ");
			}
		}
		System.out.println();
		
	}
	}
}
