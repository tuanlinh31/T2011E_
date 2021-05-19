public class OneDimension {
    int [] marks;
    public void storeMarks(){
        marks = new int[4];
        marks[0] = 40;
        marks[1] = 50;
        marks[2] = 20;
        marks[3] = 60;
    }
    public void displayMarks(){
        for (int i=0;i<marks.length;i++){
            System.out.println("Mark"+i + ":" + marks[i]);
        }
    }

    public static void main(String[] args) {
        OneDimension a = new OneDimension();
        a.storeMarks();
        a.displayMarks();
    }
}
