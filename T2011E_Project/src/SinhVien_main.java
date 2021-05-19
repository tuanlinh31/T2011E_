import java.util.Scanner;

public class SinhVien_main {
    public static void main(String[] args) {
        int choice = 0;
        Scanner s = new Scanner(System.in);
        SinhVien[] sinhviens = new SinhVien[30];
        int count = 0;
        do {
            System.out.println("----Main Menu----");
            System.out.println("----1. Them----");
            System.out.println("----2. hien thi----");
            System.out.println("----3. Thay doi SDT----");
            System.out.println("----4. Thoat----");
            System.out.println("----End Menu----");

            System.out.println(" Nhap lua chon");
            choice = s.nextInt();
            SinhVien sv = new SinhVien();
            switch (choice){
                case 1:
                    sv.nhapSinhvien();
                    sinhviens[count] = sv;
                    count++;
                    break;
                case 2:
                    for(int i = 0; i <sinhviens.length && i<count;i++){
                        SinhVien _sv = sinhviens[i];
                        _sv.hienThiSinhVien();
                    }
//                    for(SinhVien _sv :sinhviens){
//                        _sv.hienThiSinhVien();
//                    }
                    break;
                case 3:
                    System.out.println("Muon thay doi sdt cua sinh vien ten la gi");
                    s.nextLine();
                    String fn = s.nextLine();
                    for(int i = 0; i<sinhviens.length &&  i<count;i++){
                        SinhVien _sv = sinhviens[i];
                        if(_sv.getFullName().equals(fn)){
                            System.out.println("SDT moi la gi");
                            String newTel = s.nextLine();
                            sv.thayDoiSDT(newTel);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Bye bye ....");
                    break;
            }
        }while (choice != 4);
    }
}
