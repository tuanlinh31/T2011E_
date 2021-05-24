package session10binding;

public class Application {
    public static void main(String[] args) {
        Employee e = new Employee("E001","ha",40000);
        e.calCommission(20000F);
        e.displayDetails();

        System.out.println("--------------------------");

        PartTimeEmployee p = new PartTimeEmployee("B","No.2",30000,"day");
        p.display();

    }
}
