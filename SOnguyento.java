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
public class SOnguyento {
    public static boolean Kiemtrasonguyento(int n){
        if (n<2){
            return false;
        }
        for (int i=2;i<= Math.sqrt(n);i++){
            if (n%i==0){
            return false;
            }
        }
        return true;
        
        
    }
    
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();
//        System.out.println("NHap m :");
//        int m = sc.nextInt();
        System.out.println("Cac so nguyen to dau tien den " + n +  " la: ");
        for (int i = 10000;i<n;i++){
         
            if(Kiemtrasonguyento(i)){
                System.out.println(i + " ");
                count++;
                
            
        }
            
    }
          System.out.println("tong cac so nguyen to la: " + count);
}
}
