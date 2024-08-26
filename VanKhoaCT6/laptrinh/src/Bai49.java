import java.util.Scanner;
public class Bai49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String doc;
        System.out.print("\033[H\033[2J");
        System.out.print("Nhap so tu nhien n<=999: ");
        int n=sc.nextInt();
        while (n<0 || n>999){
            System.out.print("Nhap lai: ");
            n=sc.nextInt();
        }
        if (n<=9)
            doc=DonVi(n);
        else
            if (n<=99)
                doc=HangChuc(n);
            else
                doc=HangTram(n);
        System.out.print(doc);
    }
    public static String DonVi(int n){
        String doc="";
        switch (n){
            case 0 -> doc="Khong";
            case 1 -> doc="Mot";
            case 2 -> doc="Hai";
            case 3 -> doc="Ba";
            case 4 -> doc="Bon";
            case 5 -> doc="Nam";
            case 6 -> doc="Sau";
            case 7 -> doc="Bay";
            case 8 -> doc="Tam";
            case 9 -> doc="Chin";
        }
        return doc;
    }
    public static String HangChuc(int n){
        String doc="";
        int dv=n%10, ch=n/10;
        if (ch==1)
            doc="Muoi";
        else
            if (ch>1)
            doc=DonVi(ch)+" muoi";
        if (dv>=1)
            if (dv==5)
                doc+=" lam";
            else
                doc+=" "+DonVi(dv).toLowerCase();
        return doc;
    }
    public static String HangTram(int n){
        String doc;
        int ch=n%100, tr=n/100;
        doc=DonVi(tr)+" tram";
        if (ch>=10)
            doc+=" "+HangChuc(ch).toLowerCase();
        else
            if (ch!=0)
            doc+=" linh "+DonVi(n%10).toLowerCase();
        return doc;
    }
}