import javax.net.ssl.SNIHostName;
import java.util.Scanner;

public class Customer {
    int customerId;
    String customerName;
    String customerAdr;
    int customerAge;
    public Customer(){

    }
    public Customer(int id){
        customerId = id;
    }
    void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap id khach hang: ");
        customerId = s.nextInt();

        s.nextLine();
        System.out.println("Nhap ten khach hang: ");
        customerName = s.nextLine();

        System.out.println("Nhap dia chi khach hang: ");
        customerAdr = s.nextLine();

        System.out.println("Nhap tuoi khach hang: ");
        customerAge = s.nextInt();

    }
    void displayCustomerInformation(){
        System.out.println("id: " + customerId);
        System.out.println("Adr: " + customerAdr);
        System.out.println("Name: " + customerName);
        System.out.println("Age: " + customerAge);
    }

    void changeAdr(String newAdr){
        customerAdr = newAdr;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Customer cus1;
        cus1 = new Customer();
        cus1.input();

        cus1.displayCustomerInformation();
        cus1.changeAdr("HCM");
        System.out.println("========");
        cus1.displayCustomerInformation();

        Customer cus2;
        cus2 = new Customer(1);
        cus2.displayCustomerInformation();


//        System.out.println("Customer 1 id: " + cus1.customerId);
//        System.out.println("Customer 1 Adr: " + cus1.customerAdr);
//        System.out.println("Customer 1 Name: " + cus1.customerName);
//        System.out.println("Customer 1 Age: " + cus1.customerAge;
//        System.out.println("Customer 2 id: " + cus2.customerId);
    }

}
