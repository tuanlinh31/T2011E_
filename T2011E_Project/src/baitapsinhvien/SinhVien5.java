package baitapsinhvien;

import java.util.Scanner;

public class SinhVien5 {
    private String fullname;
    private int age;
    private String address;
    private int bYear;
    private String gender;
    private String tel;
    private String linkFB;

    public String getFullName(){
        return fullname;
    }

    public int getbyear(){
        return bYear;
    }
    public  String getGender(){
        return gender;
    }
    public void nhapSinhvien(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten Sinh vien: ");
        fullname = s.nextLine();

        System.out.println("Nhap tuoi Sinh vien: ");
        age = s.nextInt();

        s.nextLine();
        System.out.println("Nhap dia chi Sinh vien: ");
        address = s.nextLine();

        System.out.println("Nhap nam sinh Sinh vien: ");
        bYear = s.nextInt();

        s.nextLine();
        System.out.println("Nhap gioi tinh Sinh vien: ");
        gender = s.nextLine();

        System.out.println("Nhap so dien thoai Sinh vien: ");
        tel = s.nextLine();

        System.out.println("Nhap link facebook Sinh vien: ");
        linkFB = s.nextLine();

    }

    public void hienThiSinhVien0(){
        System.out.println("Ten: " + fullname);
        System.out.println("Tuoi: " + age );
        System.out.println("Dia chi: " + address);
        System.out.println("Nam Sinh: " + bYear);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("So dien thoai: " + tel);
        System.out.println("Link facebook: " + linkFB);
    }

    public void hienThiSinhVien(){
        System.out.println("Ten: " + fullname);
        System.out.println("So dien thoai: " + tel);
    }

    public void hienThiSinhVien1(){
        System.out.println("Ten: " + fullname);
        System.out.println("Nam Sinh: " + bYear);
    }
    public  void  thayDoiSDT(String sdt){
        this.tel = sdt;
    }


        public static void main(String[] args) {
            int choice = 0;
            Scanner s = new Scanner(System.in);
            SinhVien5[] sinhviens = new SinhVien5[30];
            int count = 0;
            do {
                System.out.println("----Main Menu----");
                System.out.println("----1. Them----");
                System.out.println("----2. hien thi----");
                System.out.println("----3. Tim sinh vien co tuoi>1993----");
                System.out.println("----4. in ra sinh vien la nam sinh nam, co tuoi >=1995");
                System.out.println("----End Menu----");

                System.out.println(" Nhap lua chon");
                choice = s.nextInt();
                SinhVien5 sv = new SinhVien5();
                switch (choice) {
                    case 1:
                        sv.nhapSinhvien();
                        sinhviens[count] = sv;
                        count++;
                        break;
                    case 2:
                        for (int i = 0; i < sinhviens.length && i < count; i++) {
                            SinhVien5 _sv = sinhviens[i];
                            _sv.hienThiSinhVien();
                        }
//                    for(baitapsinhvien.SinhVien _sv :sinhviens){
//                        _sv.hienThiSinhVien();
//                    }
                        break;
                    case 3:
                        for (int i = 0; i < sinhviens.length && i < count; i++) {
                            SinhVien5 _sv = sinhviens[i];
                            if (_sv.getbyear() < 1993 ) {
                                _sv.hienThiSinhVien1();
                            }
                        }

                    case 4:
                        for (int i = 0; i < sinhviens.length && i < count; i++) {
                            SinhVien5 _sv1 = sinhviens[i];
                            if (_sv1.getbyear() <= 1995 && _sv1.getFullName().equals("nam")) {
                                _sv1.hienThiSinhVien0();
                            }
                        }
                }
            } while (choice != 5);
        }

}
