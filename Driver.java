
public class Driver {

	public static void main(String[] args) {
		Cube Cube1 = new Cube();
		Cube1.toString();
		Cube1.setSide(7);
		Cube1.getSide();
		Cube1.computeVolume();
		Cube1.computeSurfaceArea();
		Cube1.toString();
		Sphere Sphere1 = new Sphere();
		Sphere1.toString();
		Sphere1.setRadius(2);
		Sphere1.getRadius();
		Sphere1.computeSurfaceArea();
		Sphere1.computeVolume();
		Sphere1.toString();
		Cone Cone1 = new Cone();
		Cone1.setRadius(3.5);
		Cone1.getRadius();
		Cone1.setSide(6);
		Cone1.getSide();
		Cone1.setHeight(4);
		Cone1.getHeight();
		Cone1.computeSurfaceArea();
		Cone1.computeVolume();
		Cone1.getVolume();
		Cone1.toString();
		Torus Torus1 = new Torus();
		Torus1.toString();
		Torus1.setRadius(2);
		Torus1.setRadius2(3);
		Torus1.computeSurfaceArea();
		Torus1.computeVolume();
		Torus1.toString();
		}
}
