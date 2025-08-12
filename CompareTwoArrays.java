package OnlineClass;

import java.util.Arrays;

public class CompareTwoArrays {
public static void main(String[] args) {
	int[] arr1= {1,0,5,4,2,3};
	int[] arr2= {4,0,1,2,5,3};
	System.out.println(checkTwoArrays(arr1,arr2));
	
}
public static boolean checkTwoArrays(int[] arr1,int[] arr2)
{
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	return Arrays.equals(arr1, arr2);
	
//	for(int i=0;i<arr1.length;i++)
//	{
//		if(arr1[i]!=arr2[i])
//		{
//			return false;
//		}
//	}
//	return true;
}
}
