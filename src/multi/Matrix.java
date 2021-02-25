package multi;
import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		int[][] ar = new int[3][5];
		Scanner sc = new Scanner (System.in);
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.println("enter a"+"["+i+"]"+"["+j+"]");
				ar[i][j]= sc.nextInt();
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" |");
			}
			System.out.println();
		}
	}

}
