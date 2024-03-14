package ra.run;

import ra.entity.Employee;

import java.util.Date;

public class Main {
    // ko thể dùng đc các thuộc tính instance trong các phương thức static

    public static void main(String[] args) { // cấp phát vùng nhớ tĩnh
        System.out.println("Hello world!");
        // bài tập quản li nhan vien
        Employee e = new Employee(); // cấp phát động
        Employee employee = new Employee(1,"hung",new Date(),"HN","0948386745",200000,2.3f); // cú pháp khởi tạo đối tượng
        Employee employee1 = new Employee(2,"hung",new Date(),"HN","0948386745",200000,2.3f); // cú pháp khởi tạo đối tượng
        // khói tạo dối tương
        Employee employee2 = new Employee();
        System.out.println(employee.id);
        // truy cập các phương thức và thuộc tính có quyền
        System.out.println(employee.calActualSalary());
    }

//    public void getIdFromEmployee(){
//        System.out.println(this.id);
//    }
}