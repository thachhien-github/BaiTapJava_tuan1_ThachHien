/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part4_array_string;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ThachHien
 */
public class Bai12_SapXepMangTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Nhập 5 phần tử:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
