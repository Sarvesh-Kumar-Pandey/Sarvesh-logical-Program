class Rk   
{
	public static void main(String[] args) 
	{ int n=9;
	for(int i=0;i<n;i++)
		{
         for(int j=0;j<n;j++)
			{
			 if(j==n/2-i&&j==n/2+i&&j==n-1-i&& j==i)
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
