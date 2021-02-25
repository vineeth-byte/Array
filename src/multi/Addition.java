package multi;

public class Addition {
	public static void main(String[] args) {
		int[][] a = {{1,2},{3,4}};
		int[][] b = {{5,6},{7,8}};
		int[][] c = new int[a.length][a.length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				 System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
