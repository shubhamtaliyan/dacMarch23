class S3
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--)
				System.out.print(" ");
				
			char a='A';
			for(int j=1;j<=5;j++)
			{
				//char a='A';
				if(j<=i)
				{
					System.out.print(a+" ");
					a++;
				}

				
			}
			System.out.println();
		}
	}
}