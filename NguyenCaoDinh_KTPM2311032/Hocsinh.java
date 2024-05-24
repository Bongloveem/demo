package NguyenCaoDinh_KTPM2311032;

import java.util.HashMap;
import java.util.Scanner;

public class Hocsinh {
    private String mahocsinh;
    private String tenhocsinh;
    private Float toan;
    private Float van;
    private Float ngoaingu;


    public Hocsinh() {
    }

    public Hocsinh(String mhs, String ths, Float toan, Float van, Float ngoaingu) {
        this.mahocsinh = mhs;
        this.tenhocsinh = ths;
        this.toan = toan;
        this.van = van;
        this.ngoaingu = ngoaingu;
    }

    public String getMahocsinh() {
        return mahocsinh;
    }

    public String getTenhocsinh() {
        return tenhocsinh;
    }

    public float getToan() {
        return toan;
    }

    public float getVan() {
        return van;
    }
    public float getNgoaingu() {
        return ngoaingu;
    }
    
    public void setMahocsinh(String mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    public void setTenhocsinh(String tenhocsinh) {
        this.tenhocsinh = tenhocsinh;
    }

    public void setToan(Float toan) {
        this.toan = toan;
    }

    public void setVan(Float van) {
        this.van = van;
    }

    public void setNgoaingu(Float ngoaingu) {
        this.ngoaingu = ngoaingu;
    }

    public void Nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hoc sinh: ");
        mahocsinh = sc.nextLine();
        System.out.print("Nhap ten hoc sinh: ");
        tenhocsinh = sc.nextLine();
        System.out.print("Nhap diem toan: ");
        toan = sc.nextFloat();
        System.out.print("Nhap diem van: ");
        van = sc.nextFloat();
        System.out.print("Nhap diem ngoai ngu: ");
        ngoaingu = sc.nextFloat();


    }
    public void Inthongtin() {
        System.out.println("Ma hoc sinh: " + this.getMahocsinh());
        System.out.println("Ten san pham: " + this.getTenhocsinh());
        System.out.println("Diem Toan: " + this.getToan());
        System.out.println("Diem Van: " + this.getVan());
        System.out.println("Diem Ngoaingu: " + this.getNgoaingu());
    }
    public HashMap<String, Float> getDiem() {
        HashMap<String, Float> diem = new HashMap<>();
        diem.put("Toan", toan);
        diem.put("Van", van);
        diem.put("NgoaiNgu", ngoaingu);
        return diem;
    }
}
