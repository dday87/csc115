import java.lang.Math;	
//Imported the Math methods to allow for complex calculations
public class Cube extends Shapes{
	private double cubeVolume;
	private double cubeSurfaceArea;
	// I made these variable private to exercise proper encapsulation techniques
	
	//I elected to have all of my void methods in the superclass
	// The method computeVolume, computes the volume for the shape
	public double computeVolume(){
		cubeVolume = Math.pow(side, 3);
		return cubeVolume;
	}
	// The method getVolume displays the shapes volume to the console and returns it
	public double getVolume(){
		System.out.println("The volume of the cube is:" +" " + cubeVolume +" meters cubed");
		return cubeVolume;
	}
	// The method computeSurfaceArea, computes the volume for the shape
	public double computeSurfaceArea(){
		cubeSurfaceArea = 6*Math.pow(side, 2);
		return cubeSurfaceArea;
	}
	// The method getsurfaceArea displays the shapes surface area to the console and returns it
	public double getSurfaceArea(){
		System.out.println("The surface area of the cube is:" +" " + cubeSurfaceArea +" meters squared");
		return cubeSurfaceArea;
	}
	// The method toString displays the shapes volume and surface area on the console and returns it
	public String toString(){
		System.out.println("This cubes surface area is: "+ cubeSurfaceArea +" meters squared and this cubes volume is: " + cubeVolume + " meters cubed.");
		return "This cubes surface area is: "+ cubeSurfaceArea +" meters squared and this cubes volume is: " + cubeVolume + " meters cubed.";
	}
}
