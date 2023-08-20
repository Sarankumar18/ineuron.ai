public class CountVowelConsonant
{
	public static void main(String[] args)
	{
		int vCount=0,cCount=0,splChar=0;
		String str="#Untill the miracle happens";
		str=str.toLowerCase();
		int i;
		
		System.out.println("str.length() " +str.length() );
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vCount++;
			}
			else if(ch>='a'&& ch<='z')
			{
				cCount++;
			       //add special characters...
			} else if(ch == '#' || ch == ' ' || ch == '@') {
				splChar++;
			}
		}
		System.out.println("Number of vowels::"  +vCount);
		System.out.println("Number of consonants::"  +cCount);
		System.out.println("Number of special characters::"  +splChar);
	}

}
