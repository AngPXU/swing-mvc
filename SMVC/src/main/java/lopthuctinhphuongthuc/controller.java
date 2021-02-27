
package lopthuctinhphuongthuc;

public class controller {

    public static void main(String[] args) {
        // TODO code application logic here
        circle htron = new circle(3, 6, 9);
        System.out.println("Chu vi cua hinh tron la: " + htron.calcPerimeter());
        System.out.println("Dien tich cua hinh tron la: " + htron.calcArea());
        
        rectangle hcn = new rectangle(3, 6, 9, 7);
        System.out.println("Chu vi cua hinh chu nhat la: " + hcn.calcPerimeter());
        System.out.println("Dien tich cua hinh chu nhat la: " + hcn.calcArea());
    }
    
}
