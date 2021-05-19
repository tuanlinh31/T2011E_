import java.util.Scanner;

public class SinhVien {
    private String ten;
    private int tuoi;
    private String diachi;
    private int namsinh;
    private String gioitinh;
    private String sdt;
    private String linkfb;
    public String getFullName(){
        return ten;
    }
    public void nhapSinhvien(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten Sinh vien: ");
        ten = s.nextLine();

        System.out.println("Nhap tuoi Sinh vien: ");
        tuoi = s.nextInt();

        s.nextLine();
        System.out.println("Nhap dia chi Sinh vien: ");
        diachi = s.nextLine();

        System.out.println("Nhap nam sinh Sinh vien: ");
        namsinh = s.nextInt();

        s.nextLine();
        System.out.println("Nhap gioi tinh Sinh vien: ");
        gioitinh = s.nextLine();

        System.out.println("Nhap so dien thoai Sinh vien: ");
        sdt = s.nextLine();

        System.out.println("Nhap link facebook Sinh vien: ");
        linkfb = s.nextLine();

    }

    public void hienThiSinhVien(){
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi );
        System.out.println("Dia chi: " + diachi);
        System.out.println("Nam Sinh: " + namsinh);
        System.out.println("Gioi tinh: " + gioitinh);
        System.out.println("So dien thoai: " + sdt);
        System.out.println("Link facebook: " + linkfb);
    }
    public  void  thayDoiSDT(String sdt){
        this.sdt = sdt;
    }


    public static void main(String[] args) {

        int choice = 0;
        SinhVien sv = new SinhVien();
        
        do{
            System.out.println("==== MENU ====");
            System.out.println("**** 1. Nhap Sinh Vien");
            System.out.println("**** 2. Hien thi Sinh Vien");
            System.out.println("**** 3. Thay doi so dien thoai");
            System.out.println("**** 4. Thoat khoi chuong trinh");
            System.out.println("****    ****");

            System.out.println("Enter your choice: ");
            Scanner s = new Scanner(System.in);
            choice = s.nextInt();


            switch (choice) {
                case 1:
                    sv= new SinhVien();
                    sv.nhapSinhvien();
                    break;
                case 2:
                    sv.hienThiSinhVien();
                    break;
                case 3:
                    Scanner t = new Scanner(System.in);
                    System.out.println("Nhap vao so dien thoai moi: ");
                    String td = t.nextLine();
                    sv.thayDoiSDT(td);
                    sv.hienThiSinhVien();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }
        while(choice !=4);

    }
}
