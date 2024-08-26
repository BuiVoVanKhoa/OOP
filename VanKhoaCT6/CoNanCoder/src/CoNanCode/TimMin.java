/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoNanCode;

import java.util.Scanner;

/**
 *
 * @author B402
 */
public class TimMin {

    static Scanner sc = new Scanner(System.in);
    //b1: so phan tu cua mang
    static int n;
    // b2: gioi han so phan tu cua mang
    static final int MAX = 100;
    // b3: khai bao mang
    static int[] a = new int[MAX];

    // b4: nhap gia tri so phan tu cua mang
    public static int nhapN() {
        int x = 0;
        boolean flag = true;
        do {
            try {
                x = sc.nextInt();
                if (x < 0 || x > MAX) {
                    System.out.println(">0 va <100");
                    continue;
                }
                flag = false;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so");
                sc.nextLine();
            }

        } while (flag);
        return x;
    }

    public static void Menu() {
        System.out.println("1- Nhap so phan tu cho mang");
        System.out.println("2- Nhap gia tri cua mang");
        System.out.println("3- Xuat gia tri cho mang");
        System.out.println("4- Tim min trong mang");
        System.out.println("5- Tim vi tri min trong mang");
        System.out.println("6- Dem am, duong");
        System.out.println("0- Thoat");
    }
// phuowng thuc nhap tung phan tu vao mang
    public static void nhapPT()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap phan tu thu "+(i+1));
            a[i]=sc.nextInt();
        }
    }
//    phuong thuwc xuat phan tu trong mang
    public static void xuatPT()
    {
       for(int i=0;i<n;i++)
       {
           System.out.println("a["+i+"]="+a[i]);
       }
    }
//    phuong thuc tim min trong mang
    public static int timMin()
    {
//        giar xu phan tu dau tien nho nhat
        int min=a[0];
        for(int i=1;i<n;i++)
        {
            if(min>a[i])
            {
                // gan lai gia tri cho min
                min=a[i];
            }
        }
        return min;
    }
    // tim tat ca vi tri min
    public static void viTriMin()
    {
        int gtmin=timMin();//2
        for(int i=0;i<n;i++)
        {
            if(a[i]==gtmin)
            {
                System.out.println("Vi tri min la: "+i);
            }
        }
    }
//    dem so am va so duong trong mang
    public static void demAmDuong()
    {
        int demam=0,demduong=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                demam++;
            }
            else
            {
                demduong++;
            }
        }
        System.out.println("so am: "+demam+ "\nSo duong: "+demduong);
    }
//    phuong thuc tinh tong
    public static int tinhTong()
    {
        int tong=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                tong+=a[i];
            }
        }
        return tong;
    }
    public static void main(String[] args) {
         int chon=0;
        do {
            Menu();
            System.out.println("Moi ban chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Nhap so phan tu cua mang");
                    n = nhapN();
                    break;
                case 2:
                    System.out.println("Nhap tung phan tu vao mang: ");
                    nhapPT();
                    break;
                case 3:
                    System.out.println("Phan tu trong mang: ");
                    xuatPT();
                    break;
                case 4:
                    System.out.println("Gia tri min la: ");
                    int min=timMin();
                    System.out.println(min);
                    break;
                case 5:
                    System.out.println("Xuat vi tri min");
                    viTriMin();
                    break;
                case 6:
                    demAmDuong();
                    break;
                case 7:
                    int total=tinhTong();
                    System.out.println("Tong chan la: "+total);
            }

        } while (chon!=0);
    }
}
