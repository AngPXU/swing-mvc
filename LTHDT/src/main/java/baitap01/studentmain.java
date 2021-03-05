
package baitap01;

public class studentmain {

    public static void main(String[] args) {
        // TODO code application logic here
        kich_ban_3();
    }
    
    public static void kich_ban_3(){
        menucontroller menu = new menucontroller(new studentcontroller(new studentview()), new menuview());
        menu.lua_chon_menu();
    }
    
    public static void kich_ban_1(){
        studentcontroller sc = new studentcontroller(new studentview());
        sc.nhap_du_lieu_sinh_vien();
        sc.hien_thi_sinh_vien();
    }
    
    public static void kich_ban_2(){
        studentcontroller sc = new studentcontroller(new studentview());
        sc.nhap_danh_sach_sinh_vien();
        sc.hien_thi_danh_sach_sinh_vien();
        sc.tim_kiem_sv_theo_sdt();
    }
}