package OnlineClass;

public class MinimumStartAmount {
public static void main(String[] args) {
	int n=4;
	int[] arr= {2,-9,15,2};
	int bal=0;
	int min=0;
	for(int i=0;i<arr.length;i++)
	{
		bal+=arr[i];
		
		if(bal<min)
		{
			min=bal;
		}
	}
	System.out.println(-min);
}
}
