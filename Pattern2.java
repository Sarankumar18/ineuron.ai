/*
 * @author Saran
 * Program for printing pattern INEURON
 */
public class Pattern2 {

	public static void main(String[] args)
	{
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==(n-1)/2||i==(n-1)) //I pattern
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
				if(j==0||i==j||j==(n-1)) //N pattern
				{
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
		    }
			
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0||i==(n-1)/2||i==(n-1)) //E pattern
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}	
			}
			
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
				if(j==n-1||i==n-1||j==0) //U pattern
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
				if(j==0||(i==0&&j<=(n-1)/2)||(j==(n-1)/2&&i<=(n-1)/2)||i-j==(n-1)/2) //R pattern
				{
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
				
			}
			
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
			    //if((i==0&&j>n/4&&j<(3*n)/4)||(j==n/4&&i>=n/4&&i<=(3*n)/4)||(i==n-1&&j>n/4&&j<(3*n)/4)||(j==(3*n)/4&&i>=n/4&&i<=(3*n)/4))
				if(i==0 || j==0 || i==n-1 || j==n-1) //O pattern
				{
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=0;j<n;j++)
			{
				if(j==0||i==j||j==(n-1)) //N pattern
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		} 
		
	}

}
