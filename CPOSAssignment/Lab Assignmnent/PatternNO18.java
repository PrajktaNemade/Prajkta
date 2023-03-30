class PatternNO18
{
	public static void main(String args[])
	{ 
	int alpha=65;
		for(int i=4; i>=0; i--)      		// Row
		{
			
			for(int k=0; k<=i; k++)// if the condition is reverse so.....
			{
				System.out.print((char)(alpha+k)+" ");
			}System.out.println();
				
		}
	}
}