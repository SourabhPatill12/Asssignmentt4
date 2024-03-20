package in.juhu.cdac;

public class Vehicle {
    public void VehicleInfo(String name) {
    	System.out.println("Vehicle is being Driven by : "+name);
    }
    public void VehicleInfo( String name, int speed){
    	 System.out.println("Vehicle is being Driven by "+name+" at speed of "+speed+"Km/hr");
    }
    public void VehicleInfo( String Source, String Destination) {
    	System.out.println("From "+Source+" to "+Destination);
    }
    public static void main(String[] args) {
       Vehicle car=new Vehicle();
       car.VehicleInfo("Siddhant.");
       car.VehicleInfo("Siddhant", 20);
       car.VehicleInfo("His hometown ","Cdac Mumbai");
    }
}
 
