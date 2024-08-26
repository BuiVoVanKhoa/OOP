package buoi4va5;

import java.util.*;

public class Quanlyxe {

    ArrayList<Xe> mang = new ArrayList<>();
    Scanner kb = new Scanner(System.in);

    void Menu() {
        int chon;
        do {
            System.out.println("0. Thoat");
            System.out.println("1. Nhap xe noi thanh");
            System.out.println("2. Nhap xe ngoai thanh");
            System.out.println("3. Xuat xe noi thanh");
            System.out.println("4. Xuat xe ngoai thanh");
            System.out.println("5. Xuat tat ca chuyen xe");
            System.out.println("6. Tinh tong doanh thu cho tung loai xe");
            System.out.println("7. Sap xep cac chuyen xe tang dan theo doanh thu");
            System.out.println("8. Sap xep cac chuyen xe ngoai thanh giam dan theo doanh thu");
            System.out.println("9. Xoa xe noi thanh co doanh thu it nhat");
            System.out.println("10. Sap xep cac chuyen xe noi thanh giam dan theo ho ten tai xe");
            System.out.println("Moi ban chon : ");
            chon = kb.nextInt();
            switch (chon) {
                case 0:
                    break;
                case 1:
                    Noithanh noithanh = new Noithanh();
                    noithanh.Nhap();
                    mang.add(noithanh);
                    break;
                case 2:
                    Ngoaithanh ngoaithanh = new Ngoaithanh();
                    ngoaithanh.Nhap();
                    mang.add(ngoaithanh);
                    break;
                case 3:
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof Noithanh) {
                            mang.get(i).Xuat();
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof Ngoaithanh) {
                            mang.get(i).Xuat();
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < mang.size(); i++) {
                        mang.get(i).Xuat();
                    }
                    break;
                case 6:
                    double DT_nt = 0,
                     DT_ngt = 0;
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof Noithanh) {
                            DT_nt += mang.get(i).getDoanhthu();
                        } else {
                            DT_ngt += mang.get(i).getDoanhthu();
                        }
                    }
                    System.out.println("Tong doanh thu xe noi thanh : " + DT_nt);
                    System.out.println("Tong doanh thu xe ngoai thanh : " + DT_ngt);
                    break;
                case 7:
                    for (int i = 0; i < mang.size() - 1; i++) {
                        for (int j = i + 1; j < mang.size(); j++) {
                            if (mang.get(i).getDoanhthu() > mang.get(j).getDoanhthu()) {
                                Xe tam = new Xe();
                                tam = mang.get(i);
                                mang.set(i, mang.get(j));
                                mang.set(j, tam);
                            }
                        }
                    }
                    for (int i = 0; i < mang.size(); i++) {
                        mang.get(i).Xuat();
                    }
                    break;
                case 8:
                    for (int i = 0; i < mang.size() - 1; i++) {
                        for (int j = i + 1; j < mang.size(); j++) {
                            if (mang.get(i).getDoanhthu() < mang.get(j).getDoanhthu() && (mang.get(i) instanceof Ngoaithanh && mang.get(j) instanceof Ngoaithanh)) {
                                Xe tam = new Xe();
                                tam = mang.get(i);
                                mang.set(i, mang.get(j));
                                mang.set(j, tam);
                            }
                        }
                    }
                    for (int i = 0; i < mang.size(); i++) {
                        if (mang.get(i) instanceof Ngoaithanh) {
                            mang.get(i).Xuat();
                        }
                    }
                    break;
                case 9:
//                    for (int i = 0; i < mang.size() - 1; i++) {
//                        for (int j = i + 1; j < mang.size(); j++) {
//                            if (mang.get(i).getDoanhthu() > mang.get(j).getDoanhthu() && (mang.get(i) instanceof Noithanh && mang.get(j) instanceof Noithanh)) {
//                                Xe tam = new Xe();
//                                tam = mang.get(i);
//                                mang.set(i, mang.get(j));
//                                mang.set(j, tam);
//                            }
//                        }
//                    }
//                    mang.remove(mang.get(0));
//                    for (int i = 0; i < mang.size(); i++) {
//                        if (mang.get(i) instanceof Noithanh) {
//                            mang.get(i).Xuat();
//                        }
//                    }
//                    break;
                     double min = -1;
                       for(int i=0;i<mang.size();i++){
                           if(mang.get(i) instanceof Noithanh ){
                               min=mang.get(i).getDoanhthu();
                               break;
                           }
                       }
                       if(min !=-1){
                           for(int i=0; i<mang.size();i++){
                               if(min >mang.get(i).getDoanhthu() 
                                       && mang.get(i) instanceof Noithanh) {
                                  min= mang.get(i).getDoanhthu();
                           }
                           }
                           for (int i=0;i<mang.size();i++){
                               if(min == mang.get(i).getDoanhthu()
                                       && mang.get(i) instanceof Noithanh){
                                   mang.remove(i);
                                   i--;
                               }
                           }
                       }else {
                           System.out.println("Khong co xe noi thanh");
                       }
                       break;

                case 10:
                    Collections.sort(mang, new Comparator<Xe>() {
                        public int compare(Xe chuyenXe1, Xe chuyenXe2) {
                            // So sánh theo họ tên tài xế giảm dần
                            return chuyenXe2.Hoten.compareTo(chuyenXe1.Hoten);
                        }
                    });
                    for (Xe chuyenXe : mang) {
                        if (chuyenXe instanceof Noithanh) {
                            System.out.println(chuyenXe.Hoten);
                        }
                    }
                    break;
                default:
                    System.out.println("Sai. Vui long nhap lai..!");
            }
        } while (chon != 0);
    }
}
