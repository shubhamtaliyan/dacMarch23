class S2
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=9;i++)
		{
			for(int k=8;k>=i;k--)
				System.out.print(" ");
				
			
			for(int j=1;j<=17;j++)
			{
				if(j<=i)
					System.out.print(j);

				
			}
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(l);
				
			}
		
			System.out.println();
		}
	}
}