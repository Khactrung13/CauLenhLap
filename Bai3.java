/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caulenhlapphien2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n :"); 
        int n = sc.nextInt();
        int fn = 0;
        int fn1 = 1;
        int fn2 = 1;
        System.out.println(fn1);
        System.out.println(fn2);
    
        
        
        for (int i = 3 ; i<=n;i++){
        fn = fn1 + fn2 ;
        System.out.println(fn);
        

        //cap nhat gia tri cho fn1 va fn2
        fn1 = fn2;
        fn2 = fn;
    }
 }  
}
