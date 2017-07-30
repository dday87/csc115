import java.lang.Math;
//Imported the Math methods to allow for complex calculations
public class Torus extends Shapes {
	private double torusVolume;
	private double torusSurfaceArea;
	// I made these variable private to exercise proper encapsulation techniques
	
	//I elected to have all of my void methods in the superclass
	// The method computeVolume, computes the volume for the shape
	public double computeVolume(){
		torusVolume = (2*Math.PI*radius)*(2*Math.PI*radius2);
		return torusVolume;
	}
	// The method getVolume displays the shapes volume to the console and returns it
	public double getVolume(){
		System.out.println("The volume of the torus is:" +" " + torusVolume +" meters torusd");
		return torusVolume;
	}
	// The method computeSurfaceArea, computes the volume for the shape
	public double computeSurfaceArea(){
		torusSurfaceArea = ((Math.PI*Math.pow(radius, 2))*(2*Math.PI*radius2));
		return torusSurfaceArea;
	}
	// The method getsurfaceArea displays the shapes surface area to the console and returns it
	public double getSurfaceArea(){
		System.out.println("The surface area of the torus is:" +" " + torusSurfaceArea +" meters squared");
		return torusSurfaceArea;
	}
	// The method toString displays the shapes volume and surface area on the console and returns it
	public String toString(){
		System.out.println("This torus surface area is: "+ torusSurfaceArea +" meters squared and this torus volume is: " + torusVolume + " meters cubed.");
		return "This torus surface area is: "+ torusSurfaceArea +" meters squared and this torus volume is: " + torusVolume + " meters cubed.";
	}
}
