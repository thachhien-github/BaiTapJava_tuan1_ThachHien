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
public class Bai2_DienTichHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double dai = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = sc.nextDouble();
        double dientich = dai * rong;
        System.out.println("Diện tích = " + dientich);
    }
}
