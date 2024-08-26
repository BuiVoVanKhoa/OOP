import java.util.Scanner;
public class Bai18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.print("Nhap so nguyen co 3 chu so: ");
        int a = in.nextInt(),
            tram=a/100,
            chuc=a/10%10,
            donvi=a%10;
        if ((tram>=chuc) && (tram>=donvi)) {
            System.out.print("Chu so lon nhat o hang tram: " + tram);}
        else {
            if ((chuc>=tram) && (chuc>=donvi)) {
                System.out.print("Chu so lon nhat o hang chuc: " +chuc);}
            else {
                System.out.print("Chu so lon nhat o hang don vi " + donvi);}}
    }
}