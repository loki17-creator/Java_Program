package javaapplication1;
public class min_max_from_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        even_min(arr);
        even_max(arr);
        odd_min(arr);
        odd_max(arr);
    }
    public static void even_min(int arr[]){
        int min=arr[0];
        for(int i=0; i<arr.length;i++){
           if(i%2==0){
               if(min>arr[i]){
                   min=arr[i];
               }
           } 
        }
        System.out.println(min +"min from even"); 

    }
    public static void odd_min(int arr[]){
        int min=arr[1];
        for(int i=0; i<arr.length;i++){
            if(i%2!=0){
               if(min>arr[i]){
                   min=arr[i];
               }
           }
        }
        System.out.println(min +"min from odd"); 
    }
    public static void even_max(int arr[]){
        int max=0;
        for(int i=0; i<arr.length;i++){
            if(i%2==0){
               if(max<arr[i]){
                   max=arr[i];
               }
           }
        }
        System.out.println(max +"min from even"); 

    }
    public static void odd_max(int arr[]){
        int max=0;
        for(int i=0; i<arr.length;i++){
            if(i%2!=0){
               if(max<arr[i]){
                   max=arr[i];
               }
           }
        }
        System.out.println(max +"max from odd"); 

    }
}
