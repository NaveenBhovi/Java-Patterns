package Apple;

public class Pattern13 
{

	public static void main(String[] args) 
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				     System.out.print(" ");
			}
			for(int k=4; k>=i; k--)
			{
				     System.out.print("*");
			}
			for(int n=3; n>=i; n--)
			{
				     System.out.print("*");
			}
			         System.out.println();
		}

	}

}
