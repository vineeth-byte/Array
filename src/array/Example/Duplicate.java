package array.Example;
import java.util.Scanner;
public class Duplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array length");
		int n = sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("enter the "+i+" array");
			ar[i]=sc.nextInt();
		}
		
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					ar[j]=0;
				}
			}
			if(count>1 && ar[i]!=0)
			{
				System.out.println(ar[i]+"present "+count+" times");
			}
		}
	}

}
