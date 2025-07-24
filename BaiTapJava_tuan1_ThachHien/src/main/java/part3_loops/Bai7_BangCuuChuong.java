/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part3_loops;

/**
 *
 * @author ThachHien
 */
public class Bai7_BangCuuChuong {
    public static void main(String[] args) {
        System.out.println("=== BẢNG CỬU CHƯƠNG ===");

        for (int i = 2; i <= 9; i++) {
            System.out.println("\nBảng nhân " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
    }
}
