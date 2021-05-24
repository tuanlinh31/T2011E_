package session10binding;

public class PartTimeEmployee extends Employee{
    String shift;

    public PartTimeEmployee(String id, String name, int sal, String shift) {
        super(id, name, sal);
        this.shift = shift;
    }

    public void display(){
        calCommission(12);
        super.display();
        System.out.println("Shift: "+ shift);
    }
}
