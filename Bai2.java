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
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
        int giaithua=1;
        for (int i = 1 ; i<=n;i++){
            giaithua *=i;
            
        }
        System.out.println(" Giai thua cua " + n + " la:  "  +giaithua );
    }
}
