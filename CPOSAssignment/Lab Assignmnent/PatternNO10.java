class PatternNO10
{
	public static void main(String args[])
	{
		int a=65;
		for(int i=1; i<=5; i++)      		// Row
		{
			for(int j=4; j>=i; j--)				//Spaces
			{
				System.out.print(" ");
			}	
			for(int k=4-i+1; k<=4; k++)// if the condition is reverse so.....
			{
				System.out.print((char)(a+k)+" ");
			}System.out.println();
				
		}
	}
}