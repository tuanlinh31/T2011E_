package session10binding;

public class Employee {
    String empId;
    String empName;
    int salary;
    float commission;

    public Employee(){

    }

    public Employee(String id, String name, int sal){
        empId = id;
        empName = name;
        salary = sal;

    }


    public void calCommission(float sales){
        if(sales > 10000) {
            commission = salary * 20 / 100;
        }else {
            commission = 0;
        }
    }

    public void displayDetails(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Commision: " + commission);
    }

    public void display(){
        System.out.println("emp ID "+ empId);
        System.out.println("emp Name "+ empName);
        System.out.println("emp sal "+ salary);
    }

}
