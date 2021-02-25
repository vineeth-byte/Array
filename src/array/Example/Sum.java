package array.Example;

public class Sum {
	public static void main(String[] args) {
		int[] ar = {2,4,3,5,6,-2,4,7,8,9};
		int sum=7;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]+ar[j]==sum)
				{
					System.out.println("[ "+ar[i]+" , "+ar[j]+" ]");
				}
			}
		}
	
	}

}
