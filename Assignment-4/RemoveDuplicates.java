public class RemoveDuplicates
{
    public static void main(String[] args)
    {
	     String str="GouthamiVinay";
	     System.out.println("String:"  +str);
	     String str1=" ";
	     
	     for(int i=0;i<str.length();i++)
	     {
	       char ch=str.charAt(i);
	       if(str1.indexOf(ch)==-1)
	       {
	    	   str1=str1+ch; 
	    	  
	       }
	     }
	     System.out.println("NewString:"  +str1);
    }
    
}
