package array.Example;
import java.util.Scanner;
public class SecoundMax {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the array length");
	int n = sc.nextInt();
	int[] ar = new int[n];
	for(int i=0;i<ar.length;i++)
	{
		System.out.println("enter the array"+i);
		ar[i]= sc.nextInt();
	}
	int max1 = Integer.MIN_VALUE;
	int max2 = Integer.MIN_VALUE;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]>max1)
		{
			max2=max1;
			max1=ar[i];
		}
		else if (ar[i]>max2)
		{
			max2=ar[i];
		}
	}
	System.out.println(max1);
	System.out.println(max2);
}
}
