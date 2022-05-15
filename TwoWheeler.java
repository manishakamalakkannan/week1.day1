package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 128093456L;
	boolean isPunctured = false ;
	String bikeName = "Honda";
	double runningKM = 97000 ;
	
	public static void main(String[] args) {
		TwoWheeler wheels = new TwoWheeler();
		System.out.println("Number of wheels =" +wheels.noOfWheels);
		System.out.println("Number of Mirrors =" +wheels.noOfMirrors);
		System.out.println("Chassisnumber =" +wheels.chassisNumber);
		System.out.println("Wheel status =" +wheels.isPunctured);
		System.out.println("Brand =" +wheels.bikeName);
		System.out.println("Kms =" +wheels.runningKM);
		
	}

}
 
