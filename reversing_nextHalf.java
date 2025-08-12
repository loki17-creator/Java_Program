package javaapplication1;
public class reversing_nextHalf {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        int arr1[]=new int[arr.length];
        int n=arr.length;
        int a=n-1;
        for(int i=0;i<(n/2);i++)
        {
            arr1[i]=arr[i];         
        }
        for(int i=arr.length/2;i<arr.length;i++){
            arr1[i]=arr[a--];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
