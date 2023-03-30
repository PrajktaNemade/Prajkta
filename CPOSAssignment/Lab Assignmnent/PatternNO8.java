class PatternNO8
{
	public static void main(String[] args)
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
			System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(k+" ");
			}
			
			System.out.println();
		
		}
		
	}
}	



/*class PatternNO8
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)      		// Row
		{
			for(int j=4; j>=i; j--)				//Spaces
			{
				System.out.print(" ");
			}	
			for(int k=5-i+1; k<=5; k++)// if the condition is reverse so.....
			{
				System.out.print(k+" ");
			}System.out.println();
				
		}
	}
}*/