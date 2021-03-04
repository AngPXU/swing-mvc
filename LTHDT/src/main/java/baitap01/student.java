    
package baitap01;

public class student {
    private String fullname;
    private float age;
    private String phone;

    public student() {
    }

    public student(String fullname, float age, String phone) {
        this.fullname = fullname;
        this.age = age;
        this.phone = phone;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "student{" + "fullname=" + fullname + ", age=" + age + ", phone=" + phone + '}';
    }
 
}
