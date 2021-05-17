public class AssignObject {
    public static void main(String[] args) {
//        int a = 10;
//        int b;
//        b = a ;
//        a =20;
//        System.out.println("a = " +a);
//        System.out.println("b = " +b);
        Employee e1 = new Employee();
        e1.setEmpName("Tuan LInh");

        Employee e2 = new Employee();

        e2 = e1;
        e1.setEmpName ("Tuan Linh");
        e1.empName = "Nhat Khue";
        System.out.println("e1 ten " + e1);
        System.out.println("e2 ten "+ e2);

    }
}
