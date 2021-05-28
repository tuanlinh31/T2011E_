package Bai9;

import java.util.Scanner;

public class ManagePhoneBook {
    public static void main(String[] args) {
        int choice = 0;
        Scanner s = new Scanner(System.in);
        PhoneBook pb = new PhoneBook();
        do{
            System.out.println("----------Menu-----------");
            System.out.println("---1. Insert Phone-----------");
            System.out.println("---2. Remove Phone-----------");
            System.out.println("---3. Update Phone-----------");
            System.out.println("---4. Search Phone-----------");
            System.out.println("------5. Sort-----------");
            System.out.println("---6. Insert Phone-----------");
            System.out.println("----------End Menu-----------");

            System.out.println("Choose?");
            choice = s.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter name");
                    s.nextLine();
                    String name = s.nextLine();

                    System.out.println("Enter phone");
                    String phone = s.nextLine();

                    pb.insertPhone(name,phone);
                    break;
                case 2:
                    System.out.println("Ener name: ");
                    s.nextLine();
                    name = s.nextLine();
                    pb.removePhone(name);
                    break;
                case 3:
                    System.out.println("Enter name: ");
                    s.nextLine();
                    name = s.nextLine();

                    System.out.println("Enter phone: ");
                    String newphone = s.nextLine();
                    pb.updatePhone(name, newphone);
                    break;
                case 4:
                    System.out.println("Ener name to search: ");
                    s.nextLine();
                    name = s.nextLine();
                    pb.searchPhone(name);
                    break;
                case 5:
                    pb.sort();
                    for(int i =0;i< pb.phoneList.size();i++) {
                        Object o = pb.phoneList.get(i);
                        Phone p = (Phone) o;
                        System.out.println("Da update " +p.name + "sdt" + p.phone);
                    }
                    break;
                case 6:
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("invalid choice");

            }
        }while(choice !=6);
    }
}
