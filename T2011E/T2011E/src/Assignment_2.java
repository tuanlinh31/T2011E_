import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Moi ban nhap so thu nhat: ");
        int num1 = s.nextInt();
        System.out.println("Moi ban nhap so thu hai: ");
        int num2 = s.nextInt();
        System.out.println("Ket qua cua ban nhu sau: ");
        int sum = num1 +num2;
        System.out.println("Ket qua phep cong: "+sum);
        int dif = num1 -num2;
        System.out.println("Ket qua phep tru: " +dif);
        int product = num1*num2;
        System.out.println("Ket qua phep nhan: " + product);
        float quotient = ((float)num1)/num2;
        System.out.println("Ket qua phep chia: " + quotient);
    }
}
