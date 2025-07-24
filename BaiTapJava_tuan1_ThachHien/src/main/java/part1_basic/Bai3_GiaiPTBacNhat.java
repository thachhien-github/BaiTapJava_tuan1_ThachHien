/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1_basic;

import java.util.Scanner;

/**
 *
 * @author ThachHien
 */
public class Bai3_GiaiPTBacNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) System.out.println("Phương trình vô số nghiệm");
            else System.out.println("Phương trình vô nghiệm");
        } else {
            double x = -b / a;
            System.out.println("Nghiệm x = " + x);
        }
    }
}
