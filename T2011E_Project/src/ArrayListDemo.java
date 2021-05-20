import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static int[] store(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created::");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array ::");

        for(int i=0; i<size; i++) {
            myArray[i] = sc.nextInt();
        }
        return myArray;

    }

//    public ArrayList[] arrayList(){
//        int[] arr = new ArrayList[];
//        System.out.println("nhap vao 1 mang");
//
//        return  arr;
//    }

//
        int s;
    public int sumArray(int arr[]){
        s = 0;
        for(int i = 0; i<arr.length;i++){
            s +=arr[i];
        }
        return s;
    }

    public int subArray(int arr[]){
        int dif = arr[0];
        for(int i = 1; i <arr.length;i++){
            dif -=arr[i];
        }
        return dif;
    }
    public  int mulArray(int arr[]){
        int pdt = 1;
        for(int i = 0;i<arr.length;i++){
            pdt  *=arr[i];
        }
        return pdt;
    }
    public float divArray(int arr[]){
        float qt = arr[0];
        for(int i = 1; i<arr.length;i++){
            qt = qt/arr[i];
        }
        return qt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created::");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array ::");

        for(int i=0; i<size; i++) {
            myArray[i] = sc.nextInt();
        }
        ArrayListDemo a = new ArrayListDemo();
//        int myArray[] = a.store;
//        int arr[] = a.store();

//        System.out.println("Array created is :: "+ Arrays.toString(arr));

        int sum = a.sumArray(myArray);
        System.out.println(sum);

        int dif = a.subArray(myArray);
        System.out.println(dif);

        int pdt = a.mulArray(myArray);
        System.out.println(pdt);

        float qt = a.divArray(myArray);
        System.out.println(qt);

    }
}
