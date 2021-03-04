
package baitap01;

import java.util.ArrayList;

public class studentcontroller {
    private student student;
    private ArrayList<student> students;
    private studentview view;

    public studentcontroller() {
        this.students = new ArrayList<>();
    }

    public studentcontroller(studentview view) {
        this.view = view;
    }
    

    public studentcontroller(student student) {
        this.student = student;
    }

    public studentcontroller(ArrayList<student> students) {
        this.students = students;
    }
    
    
    
//    public void nhap_du_lieu_sinh_vien(StudentView view){
//        this.student = view.them_du_lieu_sinh_vien();
//    }
    
    public void nhap_du_lieu_sinh_vien(){
        this.student = this.view.them_du_lieu_sinh_vien();
    }
    
    public void nhap_danh_sach_sinh_vien(){
        this.students = this.view.nhap_du_lieu_nhieu_sinh_vien();
    }
    
    public void hien_thi_sinh_vien(){
        this.view.hien_thi_mot_sinh_vien(this.student);
    }
    
    public void hien_thi_danh_sach_sinh_vien(){
        this.view.hien_thi_danh_sach_sinh_vien(this.students);
    }
    

    private ArrayList<student> tim_sv_theo_sdt(ArrayList<student> students, String sdt){
        ArrayList<student> result = new ArrayList<>(); //empty =khong tim thay
     
        for(student sv: students){
            if (sv.getPhone().contains(sdt)){
                result.add(sv);
            }
             
        }
        return result;
    }
    public void tim_kiem_sv_theo_sdt(){
        String sdt = this.view.nhap_sdt_can_tim();
        ArrayList<student> kq = tim_sv_theo_sdt(students, sdt);
        this.view.ket_qua_tim_kiem_sdt(kq);
    }
}