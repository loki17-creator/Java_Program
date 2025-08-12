//factorial of trail 0 retuns yes else no
package javaapplication2;
public class trail_zero_fact
{
    public static void main(String[] args) 
    {
        int n=4;
        System.out.println((fact(n)%10==0)?"yes":"no");
    }
    static int fact(int n)
    {
        int f=1;
        for(int i=2;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
}
