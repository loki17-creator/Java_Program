
package javaapplication2;
public class count_except_3 {
    public static void main(String[] args) {
        int n=5,count=n;
        for(int i=1;i<=n;i++)
        {
            while(i>0){
                if(i%10!=3){
                    count--;
                    break;
                }
            }
            
        }
        System.out.println(count);
    }
}
