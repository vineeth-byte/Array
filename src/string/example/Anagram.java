package string.example;

public class Anagram {
	public static void main(String[] args) {
		String name = "salt";
		String name2 = "salt";
		int count = 0;
		for(int i=0;i<name.length();i++)
		{
			for(int j=0;j<name2.length();j++)
			{
				if (name.charAt(i)==name2.charAt(j))
				{
					count++;
				}
			}
		}
		
		if(count==name.length())
		{
			System.out.println("given string is anagram");
		}
		else
		{
			System.out.println("not a anagram");
		}
				
	}

}
