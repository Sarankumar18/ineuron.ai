public class MaxCharacterString 
{
     public static void main(String[] args)
     {
    	 String str="Blue Black Brown";
    	 int[] a=new int[str.length()]; 
    	 char minChar=str.charAt(0),maxChar=str.charAt(0);
    	 int i,j,min,max;
    	 
    	 char[] string=str.toCharArray();
    	 
    	 for( i=0;i<string.length;i++)
    	 { 
    		 a[i]=1;
    	 
    	    for( j=i+1;j<string.length;j++)
    	    {
    		 
    		   if((string[i]==string[j])&& (string[i]!=' ') && (string[i]!='0'))
    		   {
    			 a[i]++;
    	         string[j]='0';
    		   }
    	    }
    	   
         min=max=a[0];
         if(min>a[i] && a[i]!='0')
         {
        	 min=a[i];
        	 minChar=string[i];
         }
    		 
         if(max<a[i])
         {
        	 max=a[i];
        	 maxChar=string[i];
         }
    	 }
     System.out.println("Minimum occuring Character :"  +minChar);
     System.out.println("Maximum occuring character :"  +maxChar);
     }
}
