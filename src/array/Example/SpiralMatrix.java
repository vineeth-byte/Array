package array.Example;
import java.util.Scanner;
public class SpiralMatrix {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the array length");
	int n = sc.nextInt();
	int[][] ar = new int[n][n];
	int no=1;
	int minRow=0;
	int minCol=0;
	int maxRow=ar.length-1;
	int maxCol=ar.length-1;
	while(no<=n*n)
	{
		for(int i=minCol;i<=maxCol;i++)
		{
			ar[minRow][i]=no;
			no++;
		}
		for(int i=minRow+1;i<=maxRow;i++)
		{
			ar[i][maxCol]=no;
			no++;
		}
		for(int i=maxCol-1;i>=minCol;i--)
		{
			ar[maxCol][i]=no;
			no++;
		}
		for(int i=maxRow-1;i>minRow;i--)
		{
			ar[i][minCol]=no;
			no++;
		}
		minRow++;
		minCol++;
		maxRow--;
		maxCol--;
	}
	for(int i=0;i<ar.length;i++)
	{
		for(int j=0;j<ar[i].length;j++)
		{
			System.out.print(ar[i][j]+" \t");
		}
		System.out.println();
	}
}
}
