package array.Example;

public class StoringInReverse {
	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50,60};
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				int temp = ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		System.out.println();
		System.out.println("************************************************");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+"\t");
		}
	}

}
