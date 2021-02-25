package array.Example;

public class RemovingDuplicates {
	public static void main(String[] args) {
		int[] ar = {1,2,3,1,2,3,1,1,2,2,8,9};
		 find(ar);
		 
	}

		public static void find(int ar[])
		{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j] && ar[i]!=0)
				{
					ar[j]=0;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" |");
		}
	
		}
}
		
		 
	


