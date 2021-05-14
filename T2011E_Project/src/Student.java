public class Student {

        String code;
        String name;
        String adr;
        String tel;
        String email;
        int birthYear;
        int joinYear;
        void init(){
            code = "TH001";
            name = "A";
            adr = "Lang";
            tel = "0134285";
            email = "th222@fpt.edu.vn";
            birthYear = 2000;
            joinYear = 2021;
        }
        void display(){
            System.out.println("Code: "+code);
            System.out.println("Name: "+name);
            System.out.println("Adr: "+adr);
            System.out.println("Tel: "+tel);
            System.out.println("Email: "+email);
            System.out.println("Birth Year: "+birthYear);
            System.out.println("Join Year: "+joinYear);
        }

    public static void main(String[] args) {
        Student sv01 = new Student();
        sv01.init();
        sv01.display();
    }


}
