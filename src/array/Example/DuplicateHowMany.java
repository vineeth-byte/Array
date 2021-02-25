package array.Example;

public class DuplicateHowMany {
	public static void main(String[] args) {
		int[] ar = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
		for(int i=0;i<ar.length;i++)
		{
		 int count=1;
		 for(int j=i+1;j<ar.length;j++)
		 {
			 if(ar[i]==ar[j]&& ar[i]!=0)
			 {
				 count++;
				 ar[j]=0;
			 }
		 }
		 if(count>1)
		 {
			 System.out.println(ar[i]+" present in "+count+" times ");
		 }
		}
		
		
		
	}
}