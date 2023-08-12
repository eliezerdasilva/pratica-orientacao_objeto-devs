package visitor;

public class AreaVisitor implements Visitor {
	
	public void visit(Circle circle) {
		
        double area = 3.14 * circle.getRadius() * circle.getRadius();
        System.out.println("Circle - Radius: " + circle.getRadius() + ", Area: " + area);
    }
    
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle - Width: " + rectangle.getWidth() + ", Height: " + rectangle.getHeight() + ", Area: " + area);
    }
}
