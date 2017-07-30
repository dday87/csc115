import java.lang.Math;	
//Imported the Math methods to allow for complex calculations
public class Sphere extends Shapes {
	private double sphereVolume;
	private double sphereSurfaceArea;
	// I made these variable private to exercise proper encapsulation techniques
	
	//I elected to have all of my void methods in the superclass
	// The method computeVolume, computes the volume for the shape
	public double computeVolume(){
		sphereVolume = (4/3)*Math.PI*Math.pow(radius, 3);
		return sphereVolume;
	}
	// The method getVolume displays the shapes volume to the console and returns it
	public double getVolume(){
		System.out.println("The volume of the sphere is:" +" " + sphereVolume +" meters sphered");
		return sphereVolume;
	}
	// The method computeSurfaceArea, computes the volume for the shape
	public double computeSurfaceArea(){
		sphereSurfaceArea = 4*Math.PI*Math.pow(radius, 2);
		return sphereSurfaceArea;
	}
	// The method getsurfaceArea displays the shapes surface area to the console and returns it
	public double getSurfaceArea(){
		System.out.println("The surface area of the sphere is:" +" " + sphereSurfaceArea +" meters squared");
		return sphereSurfaceArea;
	}
	// The method toString displays the shapes volume and surface area on the console and returns it
	public String toString(){
		System.out.println("This spheres surface area is: "+ sphereSurfaceArea +" meters squared and this spheres volume is: " + sphereVolume + " meters cubed.");
		return "This spheres surface area is: "+ sphereSurfaceArea +" meters squared and this spheres volume is: " + sphereVolume + " meters cubed.";
	}
}
