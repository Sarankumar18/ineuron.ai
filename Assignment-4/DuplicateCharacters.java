public class DuplicateCharacters 
{
    public static void main(String[] args)
    {
    	String str="full stack java class";
    	int count;
    	char[] ch=str.toCharArray();
    	System.out.println("Duplicate Characters in the String are:");
    	for(int i=0;i<str.length();i++)
    	{
    		count=0;
    	    for(int j=i+1;j<str.length();j++)
    	    {
    		    if((ch[i]==ch[j])&&(ch[i]!=' '))
    		    {
    	            count++;
    	            ch[j]='0';
    		    }
    	    }
    	    if(count>1 && ch[i]!='0')
    		    System.out.print(ch[i] + " ");
    	 }
    }

}
