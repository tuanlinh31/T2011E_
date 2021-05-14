import java.util.Scanner;

public class TestNumericOperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("input num1: ");
        int num1 = s.nextInt();
        System.out.println("input num2: ");
        int num2 = s.nextInt();
        int index = 0;
        while (index<10){
            System.out.println("Looping...");
            System.out.println("==== MENU ====");
            System.out.println("**** 1. ADD");
            System.out.println("**** 2. SUB");
            System.out.println("**** 3. MUL");
            System.out.println("**** 4. DIV");
            System.out.println("****    ****");

            System.out.println("Enter your choice: ");
            int choice = s.nextInt();
            switch (choice){
                case 1:
                    int sum = num1 + num2;
                    System.out.println("Sum of " + num1 +" and " + num2 +" = " +sum);
                    break;
                case 2:
                    int dif = num1 - num2;
                    System.out.println("Difference of " + num1 +" and " + num2 +" = " +dif);
                    break;
                case 3:
                    float product = num1 * num2;
                    System.out.println("Multiplication of" + num1 +" and " + num2 +" = " +product);
                    break;
                case 4:
                    float quotient = ((float)num1)/num2;
                    System.out.println("Division of " + num1 +" and " + num2 +" = " +quotient);
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
            index++ ;
        }

        System.out.println("---- END ----");
    }
}
