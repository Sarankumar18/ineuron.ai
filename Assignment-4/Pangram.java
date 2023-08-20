public class Pangram
{
	public static void main(String[] args) 
	{
		boolean flag=true;
		String s1="FARMER JACK REALIZED THAT BIG YELLOW QUILTS WERE EXPENSIVE";
		s1=s1.replace("  ","  ");
		//char[] ch=s1.toCharArray();
		
		int[] ar=new int[26];
		
		for(int i=0;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
			if(ch1>='A'&&ch1<='Z')
			{
				ar[ch1-'A']++;
			}else if(ch1>='a'&&ch1<='z')
			{
				ar[ch1-'a']++;
			}
			//int index=ch[i]-65;
			//ar[ch[i]-65]++;
			//ar[index]++;
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				
				System.out.println("It's not a Pangram");
				flag=false;
			}	
		}
		if(flag)
		{
			System.out.println("Given String:" +s1);
			System.out.println("It's a Pangram");
		}
	}
}
