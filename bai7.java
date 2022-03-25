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
public class bai7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n : ");
        int n = sc.nextInt();
        int sodu;
        int tong = 0;
        while(n>0){
            sodu = n %10;
            n = n/10;
            tong +=sodu;
           
        }
        System.out.println("tong la: " + tong);
}
}