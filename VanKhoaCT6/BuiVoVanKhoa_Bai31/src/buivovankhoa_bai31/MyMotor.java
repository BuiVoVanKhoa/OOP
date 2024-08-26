/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai31;

import java.util.Scanner;

/**
 *
 * @author FPTSHOP
 */
public class MyMotor implements IMotor {

    String code, name, type;
    public int capacity;
    Scanner kb = new Scanner(System.in);

    @Override
    public void InputInfo() {
        // Nhập code và xử lý ở lớp khác

        // Nhập name
        do {
            System.out.println("Nhap name: ");
            name = kb.nextLine();
            if (name.length() < 6) {
                System.out.println("Toi thieu 6 ky tu..!");
            }
        } while (name.length() < 6);

        // Nhập type
        do {
            System.out.println("Nhap type (Xe so hoac Xe ga): ");
            type = kb.nextLine();
            if (!type.equalsIgnoreCase("xe so") && !type.equalsIgnoreCase("xe ga")) {
                System.out.println("Nhap sai. Vui long nhap lai..!");
            }
        } while (!type.equalsIgnoreCase("xe so") && !type.equalsIgnoreCase("xe ga"));

        // Nhập capacity
        boolean flag;
        do {
            flag = false; // Chua sai
            try {
                System.out.println("Nhap capacity: ");
                capacity = kb.nextInt();
                if (capacity < 50) {
                    throw new Exception();
                }
            } catch (Exception e) {
                kb.nextLine();
                flag = true; // Da sai
                System.out.println("Capacity phai la so nguyen >= 50..!");
            }
        } while (flag == true);
    }

    @Override
    public void DisplayInfo() {
        System.out.print(code + " - " + name + " - " + type + " - " + capacity + " - ");
    }
}
