public class TwoDimensions {
    int [] [] marks;
    public void storeMarks(){
        marks = new int [5] [3];

        marks [0] [0] = 10;
        marks [0] [1] = 20;
        marks [0] [2] = 50;

        marks [1] [0] = 23;
        marks [1] [1] = 22;
        marks [1] [2] = 55;

        marks [2] [0] = 78;
        marks [2] [1] = 67;
        marks [2] [2] = 50;

        marks [3] [0] = 10;
        marks [3] [1] = 20;
        marks [3] [2] = 50;

        marks [4] [0] = 10;
        marks [4] [1] = 20;
        marks [4] [2] = 50;
    }
    public  void displayMarks(){
//        System.out.println("mark 0  :" +marks[0][0]);
//        System.out.println("Roll 1, mark 1 :" +marks[0][1]);
//        System.out.println("Roll 1, mark 1 :" +marks[0][2]);
//        for (int i=0;i<marks.length;i++){
//            for(int j = 0; j<marks[i].length;j++){
//                System.out.printf("Roll %d, mark %d: %d %n",i+1,j+1,marks[i][j]);
//            }
//        }
        for(int[] _marks :marks){
            for(int k: _marks){
                System.out.printf("Rol : %d %n",k);
            }
        }
    }

    public static void main(String[] args) {
        TwoDimensions o = new TwoDimensions();
        o.storeMarks();
        o.displayMarks();
    }
}
