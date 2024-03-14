package ra.entity;

import java.util.Date;

// Lớp nhân viên
public class Employee {
    // fields
    // biến instance - thể hiện
    public int id;
    private String fullName;
    private Date birthday;
    private String address;
    private String phone;
    private float salary;
    private float rate;


    // Constructor methods - dùng để khởi tạo đối tượng - dùng từ khóa new để goi
    public Employee() {
    }

    public Employee(int id, String fullName, Date birthday, String address, String phone, float salary, float rate) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.rate = rate;
    }

    // các phương thức khác
    // tính bao đong , cac phương thức  getter / setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", rate=" + rate +
                '}';
    }

    // các phương thức tự định nghĩa
    // tính lương
    public float calActualSalary(){
        return salary*rate;
    }

}
