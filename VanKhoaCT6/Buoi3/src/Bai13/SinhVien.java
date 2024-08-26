package Bai13;


class SinhVien {
// Khai báo thuộc tính
    private int MaSo;
    private String HoTen;
    private double DiemLT, DiemTH;
// Contructor
    // Contructor mặc định
    public SinhVien() {
        this.MaSo = 0;
        this.HoTen = "";
        this.DiemLT = 0;
        this.DiemTH = 0;
    }
// Contructor đầy đủ thông tin = đầy đủ thuộc tính = đầy đủ tham số
    public SinhVien(int MaSo, String HoTen, double DiemLT, double DiemTH) {
        this.MaSo = MaSo;
        this.HoTen = HoTen;
        this.DiemLT = DiemLT;
        this.DiemTH = DiemTH;
    }
// Phương thức setter
    public void setMaSo(int MaSo) {
        this.MaSo = MaSo;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setDiemLT(double DiemLT) {
        this.DiemLT = DiemLT;
    }

    public void setDiemTH(double DiemTH) {
        this.DiemTH = DiemTH;
    }
// Phương thức getter
    // getter: lấy giá trị cho thuộc tính và xuất ra màn hình
    // String /int /double : kiểu giá trị trả về
    public int getMaSo() {
        return MaSo;
    }

    public String getHoTen() {
        return HoTen;
    }

    public double getDiemLT() {
        return DiemLT;
    }

    public double getDiemTH() {
        return DiemTH;
    }
// Tính điểm trung bình
    double TinhDTB() {
        return (this.DiemLT + this.DiemTH) / 2;
    }
// Phương thức xuất
    void Xuat() {
        System.out.println(this.MaSo + "_" + this.HoTen + "_" + TinhDTB());
    }
}
