/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author hp
 */
public class odd_digit_divisible_byk {
    public static void main(String[] args) {
        int n=1209,k=4;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=100;
        }
        System.out.println((sum%k==0)?"yes":"no"); 
    }
}
