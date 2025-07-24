/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part4_array_string;

import java.util.Scanner;

/**
 *
 * @author ThachHien
 */
public class Bai10_TimMinMaxMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Nhập 5 phần tử:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Giá trị nhỏ nhất: " + min);
        System.out.println("Giá trị lớn nhất: " + max);
    }
}
