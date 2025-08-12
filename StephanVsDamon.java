package OnlineClass;

import java.util.Arrays;

public class StephanVsDamon {
public static void main(String[] args) {
	int n=6;
	String str="093212";
	System.out.println(getPower(n,str));
}
public static int getPower(int n,String power)
{
	if(n!=power.length())
		return 0;
	int[] arr=new int[n];
	int total=0;
	for(int i=0;i<n;i++)
	{
		arr[i]=power.charAt(i)-'0';
		total+=arr[i];
	}
	Arrays.sort(arr);
	//System.out.println(Arrays.toString(arr));
	int stephan=0;
	int damon=0;
	for(int i=arr.length-1;i>=0;i--)
	{
		stephan+=arr[i];
		damon=total-stephan;
		
		if(stephan>damon)
		{
			return stephan;
		}
	}
	return 0;
	
}
}
