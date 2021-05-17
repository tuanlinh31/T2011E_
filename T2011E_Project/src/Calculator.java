public class Calculator {
    public int add(int a, int b){
        int s = a + b;
        return s;
    }
    public int sub(int a, int b){
        int sub = a - b;
        return sub;
    }

    public float qt(int a, int b){
        float qt = ((float)a)/b;
        return  qt;
    }

    public static int pdt(int a, int b){
        int pdt = a*b;
        return pdt;
    }

    public int thaydoigiatri(Employee e){
        e.setEmpName("Ten moi");
        System.out.println("ten: " + e.getEmpName());
        return 0;
    }
    public static void main(String[] args) {
        Calculator a = new Calculator();
        int tich = a.pdt(5,2);
        int tong = a.pdt(5,2);
        int hieu = a.pdt(5,2);
        int thuong = a.pdt(5,2);

        Employee e1 = new Employee();
        e1.setEmpName("Ten 1");
        System.out.println("ten 1 = " +e1.getEmpName());
        a.thaydoigiatri(e1);
        System.out.println("ten 1 - " +e1.getEmpName());

    }
}
