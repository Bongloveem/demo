package NguyenCaoDinh_KTPM2311032;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class HS {
    public static ArrayList<Hocsinh> dshs = new ArrayList<Hocsinh>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Menu();

    }

    public static void Menu() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║    CHUONG TRINH QUAN LY HOC SINH   ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 1. Them hoc sinh                   ║");
        System.out.println("║ 2. Xoa hoc sinh                    ║");
        System.out.println("║ 3. Xem danh sach hoc sinh          ║");
        System.out.println("║ 4. Xem diem cao nhat tung mon      ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.print("Nhap chuc nang: ");
        int i = sc.nextInt();

        switch (i) {
            case 1:
                Themhs();
                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.print("Ban co muon ve menu khong? (c/k): ");
                    String temp = sc.next();
                    if (temp.equals("c")) {
                        Menu();
                    } else {
                        System.out.println("Cam on! Chao tam biet!");
                        System.exit(0);
                    }
                }
            case 2:
                Inds();
                Xoahs();
                System.out.println("Xóa hoc sinh thanh cong! ");
                Inds();
                Scanner sc1 = new Scanner(System.in);
                while (true) {
                    System.out.print("Ban co muon ve menu khong? (c/k): ");
                    String temp = sc1.next();
                    if (temp.equals("c")) {
                        Menu();
                    } else {
                        System.out.println("Cam on! Chao tam biet!");
                        System.exit(0);
                    }
                }

            case 3:
                Inds();
                Scanner sc3 = new Scanner(System.in);
                while (true) {
                    System.out.print("Ban co muon ve menu khong? (c/k): ");
                    String temp = sc3.next();
                    if (temp.equals("c")) {
                        Menu();
                    } else {
                        System.out.println("Cam on! Chao tam biet!");
                        System.exit(0);
                    }
                }
            case 4:
                HienThiDiemCaoNhat();
                ;
                Scanner sc4 = new Scanner(System.in);
                while (true) {
                    System.out.print("Ban co muon ve menu khong? (c/k): ");
                    String temp = sc4.next();
                    if (temp.equals("c")) {
                        Menu();
                    } else {
                        System.out.println("Cam on! Chao tam biet!");
                        System.exit(0);
                    }
                }
            default:
                System.out.println("Chon sai chuc nang roi !!!");
        }
    }

    public static void Themhs() {
        Scanner sc = new Scanner(System.in);
        String choice = "c";
        while (choice.equals("c")) {
            Hocsinh hs = new Hocsinh();
            hs.Nhapthongtin();
            dshs.add(hs);
            System.out.println("Them thanh cong!");
            System.out.print("Ban co muon them tiep khong? (c/k): ");
            choice = sc.next();
        }
    }

    public static void Xoahs() {
        System.out.println("Nhap vi tri can xoa: ");
        int i = sc.nextInt();
        dshs.remove(i - 1);
    }

    public static void Inds() {
        for (int i = 0; i < dshs.size(); i++) {
            System.out.print((i + 1) + "- ");
            dshs.get(i).Inthongtin();
        }
    }

public static void HienThiDiemCaoNhat() {
    if (dshs.isEmpty()) {
        System.out.println("Danh sach hoc sinh rong!");
        return;
    }

    HashMap<String, Float> diemCaoNhat = new HashMap<>();
    for (Hocsinh hs : dshs) {
        HashMap<String, Float> diem = hs.getDiem();
        for (String mon : diem.keySet()) {
            float diemMon = diem.get(mon);
            if (!diemCaoNhat.containsKey(mon) || diemMon > diemCaoNhat.get(mon)) {
                diemCaoNhat.put(mon, diemMon);
            }
        }
    }
    System.out.println("Diem cao nhat cua tung mon:");
    for (String mon : diemCaoNhat.keySet()) {
        float diemCaoNhatMon = diemCaoNhat.get(mon);
        System.out.println(mon + ": " + diemCaoNhatMon);
    }
}
}