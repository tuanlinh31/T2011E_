package Session10;

public class Vehicle {
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;

//    public Vehicle(String vId, String vName, int numWheels){
//        vehicleName = vName;
//        vehicleNo = vId;
//        wheels = numWheels;
//    }

    public void accelerate(int speed){
        System.out.println("Accelerating: " +speed + "kmph");
    }
}
