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
public class KIemtrasonguyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n : ");
        int n = sc.nextInt();
        int count = 0 ;
        System.out.println("Các số nguyên tố nhỏ hơn " + n + " la : ");
        for (int i = 10000; i <  n; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + " ");
                count++;
            }

        }
          System.out.println("Tổng các số nguyên tố là: " + count);
    }
  

    public static boolean isPrimeNumber(int n) {
  
        if (n < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
