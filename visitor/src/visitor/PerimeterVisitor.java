package visitor;

public class PerimeterVisitor  implements Visitor{
	 public void visit(Circle circle) {
	        double perimeter = 2 * 3.14 * circle.getRadius();
	        System.out.println("Circle - Radius: " + circle.getRadius() + ", Perimeter: " + perimeter);
	    }
	    
	    public void visit(Rectangle rectangle) {
	        double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
	        System.out.println("Rectangle - Width: " + rectangle.getWidth() + ", Height: " + rectangle.getHeight() + ", Perimeter: " + perimeter);
	    }
}
