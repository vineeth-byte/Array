package array.Example;
import java.util.Scanner;
public class NumberIsPresentOrNor {
	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50,60};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int key = sc.nextInt();
		boolean flag = true;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==key)
			{
				System.out.println("number is present");
				flag = false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("number is not present");
		}
			
	}

}
