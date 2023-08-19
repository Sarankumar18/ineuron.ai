public class DuplicateArray {

		public static void main(String[] args) {
			
			int arr[]= {10,12,14,16,18,10,12,14,20,9};
			int n = arr.length;
	        System.out.println("Number of elements in an array:" + n);
	        System.out.print("Elements in an array:");
	        for(int i=0;i<n;i++) {
	        	System.out.print(" "+arr[i]);
	        	 
	        }
	        System.out.println("");
		
	        for(int i=0;i<n;i++)
	        {
	        	for(int j=i+1;j<n;j++)
	        	{
	        		if(arr[i]==arr[j])
	        		{
	        			System.out.println("Found the Duplicate:" +arr[i]);
	        		}
	        	}
	        }

	}

}
