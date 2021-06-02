package Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook extends Bai9.Phone {
    ArrayList phoneList = new ArrayList();

    @Override
    public void insertPhone(String name, String phone) {
        boolean trung = false;
        for(int i =0;i<phoneList.size();i++){
            Object o = phoneList.get(i);
            Bai9.Phone p = (Bai9.Phone) o;
            if(p.name.equals(name)){
                //trung ten
                trung = true;
                if(p.phone.contains(phone)){

                }else{
                    p.phone = p.phone + ":" + phone;
                }

                break;
            }else{
                //khong trung cua nguoi thu i

            }
        }
        if(!trung){
            //khong ton tai "name" trong phoneList
            Bai9.Phone p = new PhoneBook();
            p.name = name;
            p.phone = phone;
            phoneList.add(p);
        }
    }

    @Override
    public void removePhone(String name) {
        boolean trung = false;

        for(int i =0;i<phoneList.size();i++) {
            Object o = phoneList.get(i);
            Bai9.Phone p = (Bai9.Phone) o;
            if(p.name.equals(name)){
                trung = true;
                phoneList.remove(p);
                System.out.println("Da remove" +name);
                break;
            }
        }
        if(!trung){
            System.out.println("Khong tim thay trong danh ba: " + name);
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        boolean trung = false;

        for(int i =0;i<phoneList.size();i++) {
            Object o = phoneList.get(i);
            Phone p = (Phone) o;
            if(p.name.equals(name)){
                trung = true;
                p.phone = newphone;
                System.out.println("Da update" +name);
                break;
            }
        }
        if(!trung){
            System.out.println("Khong tim thay trong danh ba: " + name);
        }
    }

    @Override
    public void searchPhone(String name) {
        boolean trung = false;

        for(int i =0;i<phoneList.size();i++) {
            Object o = phoneList.get(i);
            Phone p = (Phone) o;
            if(p.name.equals(name)){
                trung = true;
                System.out.println("name: " +name + "sdt" + phone);
                break;
            }
        }
        if(!trung){
            System.out.println("Khong tim thay trong danh ba: " + name);
        }
    }

    @Override
    public void sort() {

    }
}
