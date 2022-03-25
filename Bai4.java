/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caulenhlapphien2;

import com.sun.tools.javac.Main;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n : ");
        int n = sc.nextInt();
        boolean songuyento ; 
        for ( int i = 1; i < n ; i++){
             songuyento = true;
            for (int j = 2 ; j < i;j++){

                if(i % j == 0){
                    songuyento = false ; 
                }
              
           
            }
            if ( songuyento== true)
                    System.out.println( i +" ");
        }
    }
}
