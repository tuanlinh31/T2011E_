package com.qlsv.thongtinsinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList sinhviens = new ArrayList();
        int choice = 0;
        do{
            System.out.println("----Main Menu----");
            System.out.println("----1. Them----");
            System.out.println("----2. hien thi----");
            System.out.println("----3. hien thi danh sach sinh vien co tuoi >1993, in ho ten va nam sinh----");
            System.out.println("----4. Tim sinh vien theo ten");
            System.out.println("----End Menu----");

            System.out.println("nhap lua chon");
            choice = s.nextInt();
            SinhVien sv = new SinhVien();
            switch (choice){
                case 1:
                    sv.input();
                    sinhviens.add(sv);
                    break;
                case 2:
                    for (int  i = 0; i<sinhviens.size();i++){
                        Object o = sinhviens.get(i);
                        SinhVien _sv = (SinhVien) o;
                        _sv.output();
                    }
                case 3:
                    for(int i = 0; i<sinhviens.size();i++){
                        Object o  = sinhviens.get(i);
                        SinhVien _sv = (SinhVien) o;
                        if(_sv.getbYear() < 1993){
                            System.out.println("Ho va ten: " + _sv.getFullName());
                            System.out.println("Nam sinh: " + _sv.getbYear());
                        }
                    }
                case 4:
                    s.nextLine();
                    System.out.println("Nhap ten sinh vien muon tim");
                    String fn = s.nextLine();
                    for(int i = 0; i<sinhviens.size() ;i++){
                        Object o = sinhviens.get(i);
                        SinhVien _sv = (SinhVien) o;
                        if(_sv.getFullName().equals(fn)){
                            _sv.output();
                        }
                    }

            }
        }while(choice != 5);
    }
}
