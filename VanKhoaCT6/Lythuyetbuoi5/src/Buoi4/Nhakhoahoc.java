package Buoi4;
public class Nhakhoahoc extends Nhaquanly {
    private int Sobaibao;
    
    public Nhakhoahoc(int Sobaibao){
        this.Sobaibao = Sobaibao;
    }

    public void setSobaibao(int Sobaibao) {
        this.Sobaibao = Sobaibao;
    }
    
    public int getSobaibao() {
        return Sobaibao;
    }
    void Nhap(){
        super.Nhap();
        System.out.println("Nhap so bai bao : ");
        this.setSobaibao(kb.nextInt()); 
    }
    void Xuat(){
        System.out.println(this.getSobaibao());
    }
}