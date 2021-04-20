package wipro;

import wipro.employee.Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee=new Employee("Snehal",60000,"Aug-2021","121212");
        System.out.println(employee.getName());
        System.out.println(employee);

    }
}
