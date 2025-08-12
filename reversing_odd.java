package javaapplication1;
public class reversing_odd {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int a[]= new int[n];
        int b[]=new int[n/2];
        int k=0;
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                b[p++]=arr[i];
            }
            else{
                a[i]=arr[i];
            }
        }
        int o=0;
        for(int i=(b.length-1);i>=0;i--){
            b[o++]=b[i];
        }
        int index=0;
        for (int i = 0; i < n; i++) {
            if(a[i]==0){
                a[i]=b[k++];
                
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
    }
}
