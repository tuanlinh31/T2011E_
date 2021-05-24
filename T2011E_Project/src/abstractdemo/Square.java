package abstractdemo;

public class Square extends Calculator{
    private float w;


    public  Square(float w){
        this.w = w;
    }
    @Override
    public void Calculate() {
        float area = w*w;
        System.out.println("Are: " + area);
    }
}
