package array.Example;

public class DuplicateNumber {
	public static void main(String[] args) {
		int[] ar = {10,20,30,10,20,30,10,20,30};
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					ar[j]=-1;
				}
			}
			if(count>1 && ar[i]!=-1)
			{
				System.out.println(ar[i]+" present "+count+" times");
			}
		}
		
	}

}
