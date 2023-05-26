package data;

import java.util.Scanner;

public class Sach1 {
    String ma;
    String ten;
    String tg;
    int trang;
    int tap;
    int gia;
    String loai;
    String nxb;
    
    public void nhapSach() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nhập mã sách: ");
        ma = scan.nextLine();
        System.out.print("Nhập tên sách: ");
        ten = scan.nextLine();
        System.out.print("Nhập tác giả: ");
        tg = scan.nextLine();
        
        System.out.print("Nhập số trang: ");
        trang = Integer.parseInt(scan.nextLine());
        
        System.out.print("Nhập số tập: ");
        tap = Integer.parseInt(scan.nextLine());
        System.out.print("Nhập giá tiền: ");
        gia = Integer.parseInt(scan.nextLine());
        System.out.print("Nhập loại sách: ");
        loai = scan.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        nxb = scan.nextLine();
    }
    
    public void inSach() {
        System.out.println("Mã sách: " + ma);
        System.out.println("Tên sách: " + ten);
        System.out.println("Tên tác giả: " + tg);
        System.out.println("Số trang: " + trang);
        System.out.println("Số tập: " + tap);
        System.out.println("Giá sách: " + gia);
        System.out.println("Loại sách: " + loai);
        System.out.println("Nhà xuất bản: " + nxb);
    }
}
