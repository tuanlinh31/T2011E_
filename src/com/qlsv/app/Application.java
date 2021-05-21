package com.qlsv.app;

import com.qlsv.thongtinsinhvien.SinhVien;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int choice = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Co bao nhieu sinh vien can nhap?");
        int size = s.nextInt();
        SinhVien[] sinhviens =new SinhVien[size];
        int count  = 0;

        do {
            System.out.println("----Main Menu----");
            System.out.println("----1. Them----");
            System.out.println("----2. hien thi----");
            System.out.println("----3. hien thi danh sach sinh vien co tuoi >1993, in ho ten va nam sinh----");
            System.out.println("----4. Tim sinh vien theo ten");
            System.out.println("----End Menu----");

            System.out.println(" Nhap lua chon");
            choice = s.nextInt();
            SinhVien sv =new SinhVien();
            switch (choice){
                case 1:
                    if(count <size) {
                        sv.input();
                        sinhviens[count] = sv;
                        count++;
                    }else {
                        System.out.println("da nhap du so luong sinh vien");
                    }
                    break;
                case 2:
                    for(int i = 0; i<sinhviens.length && i<count; i++){
                        SinhVien _sv = sinhviens[i];
                        _sv.output();
                    }
                    break;
                case 3:
                    for(int i = 0; i<sinhviens.length && i<count;i++){
                        SinhVien _sv  = sinhviens[i];
                        if(_sv.getbYear() < 1993){
                            System.out.println("Ho va ten: " + _sv.getFullName());
                            System.out.println("Nam sinh: " + _sv.getbYear());
                        }
                    }
                case 4:
                    s.nextLine();
                    System.out.println("Nhap ten sinh vien muon tim");
                    String fn = s.nextLine();
                    for(int i = 0; i<sinhviens.length && i<count;i++){
                        SinhVien _sv = sinhviens[i];
                        if(_sv.getFullName().equals(fn)){
                            _sv.output();
                        }
                    }

            }

        }while(choice != 5);
    }
}
