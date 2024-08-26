/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitest1;

/**
 *
 * @author FPTSHOP
 */
public class Laodongthoivu extends Laodong {

    private int Songaycong, Dongiangaycong;

    public Laodongthoivu() {

    }

    public int getSongaycong() {
        return Songaycong;
    }

    public void setSongaycong(int Songaycong) {
        this.Songaycong = Songaycong;
    }

    public int getDongiangaycong() {
        return Dongiangaycong;
    }

    public void setDongiangaycong(int Dongiangaycong) {
        this.Dongiangaycong = Dongiangaycong;
    }

    protected double Thuong() {
        if (Songaycong > 24) {
            return 2350000;
        } else {
            return 0;
        }
    }

    protected double TinhLuong() {
        return Songaycong * Dongiangaycong + Thuong();
    }

    protected void Nhap() {
        super.Nhap();
        System.out.println("Nhap so ngay cong : ");
        setSongaycong(kb.nextInt());
        System.out.println("Nhap don gia ngay cong : ");
        setDongiangaycong(kb.nextInt());
    }

    protected void Xuat() {
        super.Xuat();
        System.out.println(TinhLuong());
    }
}
