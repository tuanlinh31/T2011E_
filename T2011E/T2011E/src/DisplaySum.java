public class DisplaySum {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int sum = num1 +num2;
        System.out.print("Sum of ");
        System.out.print(num1);
        System.out.print(" and ");
        System.out.print( num2);
        System.out.print(" is: ");
        System.out.println(sum);

        System.out.printf("Sum of %d and %d is %d %n",num1,num2,sum);
    }
}
