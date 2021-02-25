package string.example;

public class Reverse {
	public static void main(String[] args) {
		String name = "-----merfentx-----pvt-----ltd";
		String[] ar = name.split("-----");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				String temp = ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]);
			System.out.print(" ");
		}
	}

}
