package javaapplication1;
import javafx.util.Pair;

public class findminAndMax {
    public static void main(String[] args) {
        int []arr=new int[]{3,2,1,56,10,167};
        findminAndMax f=new findminAndMax();
        System.out.println(findMinMax(arr));
    }
    public static Pair<Integer,Integer> findMinMax(int []arr){
        if(arr.length==0||arr==null){
           throw new IllegalArgumentException("Array cannot be empty"); 
        } 
        int min=arr[0];
        int max=arr[0];
        for(int num:arr){
            if(num<min){
                min =num;
            }
            if(num>max){
                max=num;
            }
        }
        return new Pair<>(min,max);
    }
}
