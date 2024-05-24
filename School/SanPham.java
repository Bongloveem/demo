package School;

import java.util.Scanner;

public class SanPham {
    private String masanpham;
    private String tensanpham;
    private double gia;
    private String loai;

    public SanPham() {
    }

    public SanPham(String msp, String tsp, double gia, String loai) {
        this.masanpham = msp;
        this.tensanpham = tsp;
        this.gia = gia;
        this.loai = loai;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public double getGia() {
        return gia;
    }

    public String getLoai() {
        return loai;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void Nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("masanpham:");
        masanpham = sc.nextLine();
        System.out.print("tensanpham:");
        tensanpham = sc.nextLine();
        System.out.print("gia:");
        gia = sc.nextDouble();
        sc.nextLine();
        System.out.print("loai:");
        loai = sc.nextLine();
    }
    public void Inthongtin() {
        System.out.println("Ma san pham: " + this.getMasanpham());
        System.out.println("Ten san pham: " + this.getTensanpham());
        System.out.println("Gia san pham: " + this.getGia());
        System.out.println("Loai: " + this.getLoai());
    }
   
}