package School;

import java.util.Scanner;
import java.util.ArrayList;

public class Sp {
    public static ArrayList<SanPham> dssp = new ArrayList<SanPham>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║    CHUONG TRINH QUAN LY SAN PHAM   ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 1. Them san pham                   ║");
        System.out.println("║ 2. Xoa san pham                    ║");
        System.out.println("║ 3. Sua san pham                    ║");
        System.out.println("║ 4. Xem danh sach san pham          ║");
        System.out.println("║ 5. Tim san pham                    ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.print("Nhap chuc nang: ");
        int i = sc.nextInt();

        switch (i) {
            case 1:
                Themsp();
                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.print("Ban co muon ve menu khong? (c/k): ");
                    String temp = sc.next();
                    if (temp.equals("c")) {
                        menu();
                    } else {
                        System.out.println("Cam on! Chao tam biet!");
                        System.exit(0);
                    }
                }
            case 2:
                Inds();
                Xoasp();
                System.out.println("Xóa danh sách thanh cong! ");
                Inds();
                Scanner sc1 = new Scanner(System.in);
                while (true) {
                    System.out.print("Ban co muon ve menu khong? (c/k): ");
                    String temp = sc1.next();
                    if (temp.equals("c")) {
                        menu();
                    } else {
                        System.out.println("Cam on! Chao tam biet!");
                        System.exit(0);
                    }
                }
            case 3:
                System.out.println("Danh sach san pham: ");
                Inds();
                Suasp();
                Inds();
                Scanner sc2 = new Scanner(System.in);
                while (true) {
                    System.out.print("Ban co muon ve menu khong? (c/k): ");
                    String temp = sc2.next();
                    if (temp.equals("c")) {
                        menu();
                    } else {
                        System.out.println("Cam on! Chao tam biet!");
                        System.exit(0);
                    }
                }
            case 4:
                Inds();
                Scanner sc3 = new Scanner(System.in);
                while (true) {
                    System.out.print("Ban co muon ve menu khong? (c/k): ");
                    String temp = sc3.next();
                    if (temp.equals("c")) {
                        menu();
                    } else {
                        System.out.println("Cam on! Chao tam biet!");
                        System.exit(0);
                    }
                }
            case 5:
                Timsp();
                Scanner sc4 = new Scanner(System.in);
                while (true) {
                    System.out.print("Ban co muon ve menu khong? (c/k): ");
                    String temp = sc4.next();
                    if (temp.equals("c")) {
                        menu();
                    } else {
                        System.out.println("Cam on! Chao tam biet!");
                        System.exit(0);
                    }
                }
            default:
                System.out.println("Chon sai chuc nang roi !!!");
        }
    }

    public static void Themsp() {
        Scanner sc = new Scanner(System.in);
        String choice = "c";
        while (choice.equals("c")) {
            SanPham sp = new SanPham();
            sp.Nhapthongtin();
            dssp.add(sp);
            System.out.println("Them san pham thanh cong!");
            System.out.print("Ban co muon them tiep khong? (c/k): ");
            choice = sc.next();
        }
    }

    public static void Xoasp() {
        System.out.println("Nhap vi tri can xoa: ");
        int i = sc.nextInt();
        dssp.remove(i - 1);
    }

    public static void Inds() {
        for (int i = 0; i < dssp.size(); i++) {
            System.out.print((i + 1) + "- ");
            dssp.get(i).Inthongtin();
        }
    }

    public static void Suasp() {
        System.out.println("Nhap vi tri can sua: ");
        int i = sc.nextInt();
        sc.nextLine();

        if (i >= 1 && i <= dssp.size()) {
            SanPham sp1 = dssp.get(i - 1);
            System.out.println("Nhap thong tin can sua:");
            System.out.println("1- Ma san pham");
            System.out.println("2- Ten san pham");
            System.out.println("3- Gia san pham");
            System.out.println("4- Loai");
            System.out.print("Chon vi tri can sua: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Nhap ma san pham: ");
                    String masp = sc.nextLine();
                    sp1.setMasanpham(masp);
                    break;
                case 2:
                    System.out.print("Nhap ten san pham: ");
                    String tensp = sc.nextLine();
                    sp1.setTensanpham(tensp);
                    break;
                case 3:
                    System.out.print("Nhap gia san pham: ");
                    double gia = sc.nextDouble();
                    sp1.setGia(gia);
                    break;
                case 4:
                    System.out.print("Nhap loai: ");
                    String loai = sc.nextLine();
                    sp1.setLoai(loai);
                    break;
                default:
                    System.out.println("Chon sai vi tri can sua!");
                    break;
            }

            System.out.println("Sua san pham thanh cong!");
        } else {
            System.out.println("Vi tri khong hop le!");

        }
    }

    public static void Timsp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Tim san pham theo ten ");
        System.out.println("2. Tim san pham theo gia cao nhat và gia thap nhat ");
        System.out.print("Moi ban chon: ");
        int option = sc.nextInt();
        sc.nextLine();
    
        switch (option) {
            case 1:
                System.out.print("Nhap ten san pham can tim: ");
                String ten = sc.nextLine();
    
                boolean found = false;
                for (SanPham sp : dssp) {
                    if (sp.getTensanpham().equalsIgnoreCase(ten)) {
                        sp.Inthongtin();
                        found = true;
                    }
                }
    
                if (!found) {
                    System.out.println("Khong tim thay san pham !");
                }
                break;
            case 2:
                if (dssp.isEmpty()) {
                    System.out.println("Danh sach san pham rong!");
                } else {
                    double maxsp = Double.MIN_VALUE;
                    double minsp = Double.MAX_VALUE;
                    SanPham maxPriceProduct = null;
                    SanPham minPriceProduct = null;
    
                    for (SanPham sp : dssp) {
                        double price = sp.getGia();
                        if (price > maxsp) {
                            maxsp = price;
                            maxPriceProduct = sp;
                        }
                        if (price < minsp) {
                            minsp = price;
                            minPriceProduct = sp;
                        }
                    }
    
                    System.out.println("San pham gia cao nhat:");
                    if (maxPriceProduct != null) {
                        maxPriceProduct.Inthongtin();
                    }
    
                    System.out.println("San pham gia thap nhat:");
                    if (minPriceProduct != null) {
                        minPriceProduct.Inthongtin();
                    }
                }
                break;
            default:
                System.out.println("Tuy chon ban nhap khong hop le !!!");
                break;
        }
    }
}