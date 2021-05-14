public class BangCuuChuong {
    public static void main(String[] args) {
        int x,y;
        for( x = 2; x<=9;x++){
            System.out.println("Bang cuu chuong cua " + x);
            for(y=1;y<=10;y++){
                int sum = x*y;
                System.out.println(x + " * " +y +" = " + sum);
            }
        }
    }
}
