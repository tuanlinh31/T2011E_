package com.qlsv.thongtinsinhvien;

import java.util.Scanner;

public class SinhVien {
    private String fullName;
    private int age;
    private String address;
    private int bYear;

    public int getbYear() {
        return bYear;
    }

    public void setbYear(int bYear) {
        this.bYear = bYear;
    }

    private String gender;
    private String tel;
    private String facebookUrl;

    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten Sinh vien: ");
        fullName = s.nextLine();

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
        facebookUrl = s.nextLine();
    }

    public void output(){
        System.out.println("Ten: " + fullName);
        System.out.println("Tuoi: " + age );
        System.out.println("Dia chi: " + address);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("So dien thoai: " + tel);
        System.out.println("Link facebook: " + facebookUrl);
    }

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public String getTel() {

        return tel;
    }

    public void setTel(String tel) {

        this.tel = tel;
    }

    public String getFacebookUrl() {

        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {

        this.facebookUrl = facebookUrl;
    }
}
