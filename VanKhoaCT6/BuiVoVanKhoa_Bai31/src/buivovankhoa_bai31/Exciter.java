/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buivovankhoa_bai31;

/**
 *
 * @author FPTSHOP
 */
public class Exciter extends MyMotor{
    private int warranty;
    
    @Override
    public void InputInfo() {
        super.InputInfo();
        boolean flag;
        do {
            flag = false;
            try {
                System.out.println("Xin moi nhap Warranty: ");
                warranty = kb.nextInt();
                if (warranty < 1) {
                    throw new Exception();
                }
            } catch (Exception e) {
                kb.nextLine();
                flag = true;
                System.out.println("Warranty phai la so nguyen > 1. Vui long nhap lai..!");
            }
        } while (flag == true);
    }
        
    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("Warranty: " + warranty);
    }    
}
