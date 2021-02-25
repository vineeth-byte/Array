package array.Example;

public class Binary {
public static void main(String[] args) {
	int[] ar = {10,20,30,44,54,65,90};
	int key = 44;
	int min=0;
	int max = ar.length-1;
	while(min<=max)
	{
		int avg = (min+max)/2;
		if(ar[avg]==key)
		{
			System.out.println("got the number");
			break;
		}
		else if(ar[avg]>key)
		{
			max=avg-1;
		}
		else
		{
			min=avg+1;
		}
	}
	if(min>max)
	{
		System.out.println("number not found");
	}
}
}
