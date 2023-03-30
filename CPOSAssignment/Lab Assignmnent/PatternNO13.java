class PatternNO13
{
	public static void main(String args[])
	{int b=65;
		for(int i=0; i<=4;i++)
		{
			for(int k=4;k>=i;k--)
			{
			System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
			System.out.print((char)(b+i)+" ");
			}
			
			System.out.println();
		}
	}
}	