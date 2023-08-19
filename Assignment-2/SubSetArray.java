public class SubSetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int arr_sub[] = {1,3,9,7,10};
		
		
		int arr_len, arr_sub_len, i, j;
		boolean flag=true;
		
		arr_len = arr.length;
		arr_sub_len = arr_sub.length;
		
		for(j=0; j<arr_sub_len; j++) {
			for(i=0; i<arr_len; i++) {
				if(arr_sub[j] == arr[i]) {
					break;
				}
			}
			
			if(i == arr_len) {
				System.out.println("subset of array not found");
				flag = false;
				break;
			}
		}
		
		if(flag==true) {
		    System.out.println("subset of array is found: ");
		    for(j=0; j<arr_sub_len; j++) {
		    	System.out.print(arr_sub[j] + "  ");
		    }
		}
	}

}
