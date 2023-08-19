import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter the elements");
		int n=scan.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		scan.close();
		for(int j=0;j<=n-2;j++)
		{
			int min=a[j];
			int index=j;
			for(int i=j+1;i<=n-1;i++)
			{ 
				if(min>a[i])
				{
					min=a[i];
					index=i;
				}
			}
			int temp=a[j];
			a[j]=a[index];
			a[index]=temp;
		}
		  for(int elem:a)
          {
			 System.out.print(elem+" ");
          }
     }
	}
