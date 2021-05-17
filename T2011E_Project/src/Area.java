public class Area {
    public final float PI =  3.14F;
    private float rad;

    public float area(){
        float a = PI * rad * rad;
        return a;
    }

    public  void setRad(float rad){
        this.rad = rad;
    }

    public static void main(String[] args) {
        Area c = new Area();
        c.setRad(3.89F);
        float a = c.area();
        System.out.printf("Dien tich cua hinh tron ban kinh %f la %f %n",c.rad,a);
    }
}
