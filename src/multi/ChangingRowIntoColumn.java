package multi;

public class ChangingRowIntoColumn {
	public static void main(String[] args) {
		int[][] ar= {{10,20,30},{40,50,60},{70,80,90}};
		int[][] br = new int[ar.length][ar.length];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				br[i][j]=ar[j][i];
			}
		}
	 
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
			if(j==0) {
			System.out.print(br[i][j]+"\t");
			}
			else if(i>1)
			{
				System.out.print(br[i][j]+" \t");
			}
			}
			System.out.println();
		}
	}

}
