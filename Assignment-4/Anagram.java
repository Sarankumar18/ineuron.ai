import java.util.Arrays;

public class Anagram
{
	public static void main(String[] args)
	{
		String  str1="SeCure";
		String  str2="reSCue";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1,ch2))
		//if(str1.length()==str2.length())
		{
			System.out.println("It's a Anagram");
		}
		else
		{
			System.out.println("It's not a Anagram");
		}
	}

}
