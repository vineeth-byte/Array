package string.example;

public class Hteeniv {
	public static void main (String[] args) {
		String name = "Vineeth";
		char[] ch = name.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				char temp = ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
		System.out.println(ch);
		
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		System.out.println();
		
	}

}
