package lab4;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int soLuongSinhVien = scanner.nextInt();
        String[] tenSinhVien = new String[soLuongSinhVien];
        double[] diemSinhVien = new double[soLuongSinhVien];
        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i+1) + ":");
            System.out.print("Tên sinh viên: ");
            scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số lượng sinh viên
            tenSinhVien[i] = scanner.nextLine();
            System.out.print("Điểm sinh viên: ");
            diemSinhVien[i] = scanner.nextDouble();
        }
        System.out.println("\nThông tin sinh viên:");
        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.println("Sinh viên thứ " + (i+1) + ":");
            System.out.println("Tên sinh viên: " + tenSinhVien[i]);
            System.out.println("Điểm sinh viên: " + diemSinhVien[i]);
            System.out.println("Học lực: " + xetHocLuc(diemSinhVien[i]));
            System.out.println("--------------------");
        }
        for (int i = 0; i < soLuongSinhVien - 1; i++) {
            for (int j = i + 1; j < soLuongSinhVien; j++) {
                if (diemSinhVien[i] > diemSinhVien[j]) {
                    String tempTen = tenSinhVien[i];
                    tenSinhVien[i] = tenSinhVien[j];
                    tenSinhVien[j] = tempTen;
                    double tempDiem = diemSinhVien[i];
                    diemSinhVien[i] = diemSinhVien[j];
                    diemSinhVien[j] = tempDiem;
                }
            }
        }
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp:");
        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.println("Sinh viên thứ " + (i+1) + ":");
            System.out.println("Tên sinh viên: " + tenSinhVien[i]);
            System.out.println("Điểm sinh viên: " + diemSinhVien[i]);
            System.out.println("--------------------");
        }
    }

    public static String xetHocLuc(double diem) {
        if (diem < 5) {
            return "Yếu";
        } else if (diem >= 5 && diem < 6.5) {
            return "Trung bình";
        } else if (diem >= 6.5 && diem < 7.5) {
            return "Khá";
        } else if (diem >= 7.5 && diem < 9) {
            return "Giỏi";
        } else {
            return "xuất xắc";
        }
    }
}
