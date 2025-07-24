/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2_conditions;

import java.util.Scanner;

/**
 *
 * @author ThachHien
 */
public class Bai4_ChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " là số chẵn");
        else
            System.out.println(n + " là số lẻ");
    }
}
