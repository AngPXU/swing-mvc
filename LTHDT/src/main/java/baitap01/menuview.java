
package baitap01;

import java.util.Scanner;

public class menuview {

    public menuview() {
    }
    
    public int hien_thi_menu(){
        System.out.println("+++++++++++++++++++++++");
        System.out.println("1. Nhap du lieu");
        System.out.println("2. Tim kiem ");
        System.out.println("3. Thoat chung trinh");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Ban chon chuc nang nao?");
        Scanner sc = new Scanner(System.in);
        int kq = Integer.parseInt(sc.nextLine());
        return kq;
    }
}