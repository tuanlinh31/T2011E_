package abstractdemo;

public class Circle extends Calculator{
    private float area;
    private float rad;

    public Circle(float r){
        rad = r;
    }

    @Override
    public void Calculate() {
        area = getPi()* rad;
        System.out.println("Area: "+ area);
    }
}
