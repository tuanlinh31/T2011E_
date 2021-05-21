public class StaticMember {
    private int instanceCounter = 0;
    private static int staticCounter = 0;

    static{
        System.out.println("Block init");
    }
    public void instanceMethod(){
        instanceCounter++;
        staticCounter++;
    }
    public void instanceDisplay(){
        System.out.println("instanceCounter: " + instanceCounter);
        System.out.println("StaticCounter: " + staticCounter);
    }

    public static void staticDisplay(){
        System.out.println("StaticCounter: " + staticCounter);
    }

    public static void main(String[] args) {
        StaticMember s1 = new StaticMember();
        System.out.println("----S1----");
        s1.instanceMethod();
        s1.instanceDisplay();
        StaticMember.staticDisplay();


        StaticMember s2 = new StaticMember();
        System.out.println("----S2----");
        s2.instanceMethod();
        s2.instanceDisplay();
        StaticMember.staticDisplay();
    }
}
