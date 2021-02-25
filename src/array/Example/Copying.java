package array.Example;

public class Copying {
	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50,60};
		int[] br = {70,80,90};
		int len = ar.length+br.length;
		int[] cr = new int[len];
		int j=0;
		for(int i=0;i<cr.length;i++)
		{
			if(ar.length>i)
			{
				cr[i]=ar[i];
			}
			else
			{
				cr[i]=br[j];
				j++;
			}
	

		}
		for(int i=0;i<cr.length;i++)
		{
			System.out.println(cr[i]);
		}
	}

}
