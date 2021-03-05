
package baitap01;

public class menucontroller {
    private studentcontroller st_contrl;
    private menuview mnview;

    public menucontroller() {
    }

    public menucontroller(studentcontroller st_contrl) {
        this.st_contrl = st_contrl;
    }

    public menucontroller(studentcontroller st_contrl, menuview mnview) {
        this.st_contrl = st_contrl;
        this.mnview = mnview;
    }
    
    public void lua_chon_menu(){
        int kq = mnview.hien_thi_menu();
        switch(kq){
            case 1: 
                st_contrl.nhap_danh_sach_sinh_vien();
                break;
            case 2:
                st_contrl.tim_kiem_sv_theo_sdt();
                break;
                
        }
    }
    
    
}