package array.Example;
import java.util.Scanner;
public class RemoveNumber2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = {10,20,30,-10,-20,-30,40,-40};
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
			{
				count++;
			}
		}
		int[] br = new int[count];
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
			{
				br[j]=ar[i];
				j++;
			}
		}
		for(int i=0;i<br.length;i++)
		{
			System.out.println(br[i]);
		}
	}

}
