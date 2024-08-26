import java.util.Scanner;
public class Bai21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so km: ");
        float km=sc.nextFloat(),
                cuoc;
        if (km<=1)
            cuoc=16;
        else
            if (km<=30)
                cuoc=16+15*(km-1);
            else
                cuoc=16+15*29+12*(km-30);
        System.out.print("Cuoc phi: "+cuoc+".000d");
    }
}
