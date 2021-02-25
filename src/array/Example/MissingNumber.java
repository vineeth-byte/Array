package array.Example;
import java.util.Scanner;
public class MissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int[] ar=new int[n-1];
		int nn = 1;
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			
			ar[i]=nn;
			sum = sum+ar[i];
			nn++;
		}
		int total= n*(n+1)/2;
		int find = total-sum;
		System.out.println(find);
		
	}

}
