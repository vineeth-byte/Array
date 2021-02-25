package array.Example;
import java.util.Scanner;
public class Remove {
	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50,60};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int[] br = new int[ar.length-1];
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=n)
			{
				br[j]=ar[i];
				j++;
			}
		}
		for(int i=0;i<br.length;i++)
		{
			System.out.print(br[i]+" \t");
		}
	}

}
