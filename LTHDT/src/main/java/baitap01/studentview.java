
package baitap01;

import java.util.ArrayList;
import java.util.Scanner;

public class studentview {

    public studentview() {
    }
    
    public void hien_thi_mot_sinh_vien(student x){
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("++++ " + x.toString() + " ++++");
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
    
    public student them_du_lieu_sinh_vien(){
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("Fullname: ");
        Scanner sc = new Scanner(System.in);
        String fullname = sc.nextLine();
        System.out.println("Age: ");
        float age = Float.parseFloat(sc.nextLine());
        System.out.println("Phone: ");
        String phone = sc.nextLine();
        student sv = new student(fullname, age, phone);
        System.out.println("Finished");
        System.out.println("++++++++++++++++++++++++++++++++++");
        return sv;
    }
    
    public ArrayList<student> nhap_du_lieu_nhieu_sinh_vien(){
        ArrayList<student> result = new ArrayList<>();
        boolean flag = true;
        while(flag){
            System.out.println("Ban co muon nhap du lieu khong? (y/n)");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if ("n".equals(answer) || "N".equals(answer)){
                flag = false;
            }else{
                student sv = them_du_lieu_sinh_vien();
                result.add(sv);
            }
        }
        return result;
    }
    
    public void hien_thi_danh_sach_sinh_vien(ArrayList<student> students){
        
        System.out.println("++++++++++++++++++++++++++++++++++");
        for(student sv: students){
            System.out.println("++++ " + sv.toString() + " ++++");
        }    
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
    
    
    
    //view nhap thong tin can tim
    public String nhap_sdt_can_tim(){
        System.out.println("+++++++++++++++++++++++");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien thoai can tim kiem: ");
        String sdt = sc.nextLine();
        System.out.println("+++++++++++++++++++++++");
        return sdt;
    }
    
    //view in ket qua tim kiem
    public void ket_qua_tim_kiem_sdt(ArrayList<student> students){
        System.out.println("+++++++++++++++++++++++");
        if (students.isEmpty()){
            System.out.println("Khong tim thay");
        }else{
            for(student sv: students){
                System.out.println(sv.toString());
            }
        }
        System.out.println("+++++++++++++++++++++++");
    }
}