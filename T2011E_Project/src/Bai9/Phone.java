package Bai9;

import java.util.Scanner;

public abstract class Phone {
    public String name;
    public String phone;


    public abstract void insertPhone(String name, String phone);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String newphone);
    public abstract void searchPhone(String name);
    public abstract void sort();

}
