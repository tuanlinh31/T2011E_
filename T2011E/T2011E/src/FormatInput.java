import java.util.Scanner;

public class FormatInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age?");
        int age = s.nextInt();
        System.out.println("Enter your name?");
        s.nextLine();
        String name = s.nextLine();

        System.out.println("Hello " + name + "," + age + "yo");

        System.out.println("Enter num1");
        int num1 = s.nextInt();
        System.out.println("Enter num2");
        int num2 = s.nextInt();
        int sum = num1 + num2;
        System.out.printf("Sum of %d and %d is %d %n",num1,num2,sum);
    }
}
