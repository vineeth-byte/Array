package array.Example;

public class MaxMin {
	public static void main(String[] args) {
		int[] ar = {67,-200,34,21,-87,92};
		int max = Integer.MIN_VALUE;
		int min= Integer.MAX_VALUE;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
			    max=ar[i];
			   // System.out.println(max);
			}
			else if(ar[i]<min)
			{
				min=ar[i];
				//System.out.println(min);
			}
		}
		System.out.println(min);
		System.out.println(max);
		

}
}
