package array.Example;

public class Reverse {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,33,4,67,22,31};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
				int temp = ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" | ");
		}
	}

}
