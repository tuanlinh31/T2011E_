package Session10;


public class FourWheeler extends Vehicle{
    private boolean powerSteer;

    public FourWheeler(){

    }
    public FourWheeler(String vId, String vName, int numWheels, boolean pSteer){
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
        powerSteer = pSteer;
    }


    public  void showDetails(){
        System.out.println("Vehicle no :" + vehicleNo);
        System.out.println("Vehicle name :" + vehicleName);
        System.out.println("Number of wheels :" + wheels);

        if(powerSteer){
            System.out.println("Power Steering: yes");
        }
        else {
            System.out.println("Power Steering: no");
        }

    }
    public void accelerate(int speed){
        super.accelerate(speed);
        System.out.println("Maximum Accelerating: " +speed + "kmph");
    }



}
