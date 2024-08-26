/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai31;

/**
 *
 * @author FPTSHOP
 */
public class Sirius extends MyMotor{
    private String color;

    @Override
    public void InputInfo() {
        super.InputInfo();
        do {
            kb.nextLine();
            System.out.println("Moi nhap color: ");
            color = kb.nextLine();
            if (color.equalsIgnoreCase("xanh") == false
                    && color.equalsIgnoreCase("vang") == false
                    && color.equalsIgnoreCase("trang") == false) {
                System.out.println("Sai! Vui long nhap lai..!");
            }
        } while (color.equalsIgnoreCase("xanh") == false
                && color.equalsIgnoreCase("vang") == false
                && color.equalsIgnoreCase("trang") == false);
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println(color);
    }
}
