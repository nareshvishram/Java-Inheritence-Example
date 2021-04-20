package wipro.employee;

import wipro.person.Person;

public class Employee extends Person {
    private double salary;
    private String startedToWork;
    private String nationalInsuranceNumber;

    public Employee(double salary, String startedToWork, String nationalInsuranceNumber) {
        this.salary = salary;
        this.startedToWork = startedToWork;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public Employee(String name, double salary, String startedToWork, String nationalInsuranceNumber) {
        super(name);
        this.salary = salary;
        this.startedToWork = startedToWork;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public String getStartedToWork() {
        return startedToWork;
    }

    public void setStartedToWork(String startedToWork) {
        this.startedToWork = startedToWork;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", startedToWork='" + startedToWork + '\'' +
                ", nationalInsuranceNumber='" + nationalInsuranceNumber + '\'' +
                '}';
    }
}
