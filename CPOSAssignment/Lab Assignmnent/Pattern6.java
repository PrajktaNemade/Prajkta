class Pattern6
{
	public static void main(String args[])
	{
	for(int i=1;i<=5;i++)//row
	{
		int j=1;
		for(;j<i;j++){
		
			System.out.print(" ");
		}
		for(int k=i;k<=11-i-1;k++)
		{
			
			System.out.print("*");
		}
		
		System.out.println();
		
	}
	
}
}