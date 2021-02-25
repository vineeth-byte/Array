package array.Example;
public class BubbleSorting {
	public static void main(String[] args) {
		int[] ar= {10,65,40,55,22,30};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j]) {
				int temp = ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
