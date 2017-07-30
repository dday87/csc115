public class Shapes {
	/* All of the methods and variables in this
	 * super class are meant to be shared amongst
	 * the subclasses. They are all relevant
	 * in some way to each of the children.
	*/
	protected double shapeRadius;
	protected double shapeSide;
	protected double shapeHeight;
	protected double radius;
	protected double radius2;
	protected double side;
	protected double height;
	
	/* The following getter and setter methods
	 * allow the user to set and get(display to the console) the variables radius, radius2,
	 * side & height, respectively.
	 */
	
	public void setRadius(double shapeRadius){
		radius = shapeRadius; 
	}
	public double getRadius(){
		System.out.println("The radius is " + radius + " meters");
		return radius;
	}
	public void setRadius2(double shapeRadius){
		radius2 = shapeRadius; 
	}
	public double getRadius2(){
		System.out.println("The radius is " + radius2 + " meters");
		return radius;
	}
	public void setSide(double shapeSide){
		side = shapeSide; 
	}
	public double getSide(){
		System.out.println("The side is " + side + " meters");
		return side;
	}
	public void setHeight(double shapeHeight){
		height = shapeHeight; 
	}
	public double getHeight(){
		System.out.println("The height is " + height + " meters");
		return height;
	}
}
