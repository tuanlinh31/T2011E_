import java.util.Scanner;

public class Number_Division<i> {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap vao 1 so? ");
        int num = s.nextInt();
        //kiem tra so chan le
        int remainder = num % 2;
        if (remainder == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        //tong cac so chan tu 1 den nho hon so vua nhap
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if ((i % 2 == 0)) {
                sum = sum + i;
            }
        }
        System.out.println("Tong cac so chan nho hon "+num +" la "+sum);


        //tong cac so chia het cho 3 tu 1 den nho hon so vua nhap
        int sum1 = 0;
        for (int i = 1; i < num; i++) {
            if ((i % 3) == 0) {
                sum1 = sum1 + i;
            }
        }
        System.out.println("Tong cac so chia het cho 3 nho hon "+num + " la " +sum1);
    }
}

