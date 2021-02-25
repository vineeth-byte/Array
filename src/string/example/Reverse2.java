package string.example;

public class Reverse2 {
	public static void main(String[] args) {
		String name ="vineeth sivasankaran";
		String[] ar = name.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			char[] ch =ar[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				for(int k=j+1;k<ch.length;k++)
				{
					char temp = ch[j];
			         ch[j]=ch[k];
			         ch[k]=temp;
				}
				
			}
			System.out.print(ch);
			System.out.print(" ");
		}
	}

}
