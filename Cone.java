import java.lang.Math;	
// Imported the Math methods to allow for complex calculations

public class Cone extends Shapes{
	private double coneVolume;
	private double coneSurfaceArea;
	// I made these variable private to exercise proper encapsulation techniques
	
	//I elected to have all of my void methods in the superclass
	// The method computeVolume, computes the volume for the shape
	public double computeVolume(){
		coneVolume = ((1/3)*Math.PI*Math.pow(radius, 2)*height);
		return coneVolume;
	}
	// The method getVolume displays the shapes volume to the console and returns it
	public double getVolume(){
		System.out.println("The volume of the cone is:" +" " + coneVolume +" meters cubed");
		return coneVolume;
	}
	// The method computeSurfaceArea, computes the volume for the shape
	public double computeSurfaceArea(){
		coneSurfaceArea = Math.PI*radius*side;
		return coneSurfaceArea;
	}
	// The method getsurfaceArea displays the shapes surface area to the console and returns it
	public double getSurfaceArea(){
		System.out.println("The surface area of the cone is:" +" " + coneSurfaceArea +" meters squared");
		return coneSurfaceArea;
	}
	// The method toString displays the shapes volume and surface area on the console and returns it
	public String toString(){
		System.out.println("This cones surface area is: "+ coneSurfaceArea +" meters squared and this cones volume is: " + coneVolume + " meters cubed.");
		return "This cones surface area is: "+ coneSurfaceArea +" meters squared and this cones volume is: " + coneVolume + " meters cubed.";
	}
}
