package visitor;

public class Main {

	public static void main(String[] args) {
		 Shape[] shapes = { new Circle(5), new Rectangle(3, 4)};
	        
	        Visitor areaVisitor = new AreaVisitor();
	        Visitor perimeterVisitor = new PerimeterVisitor();
	        
	        for (Shape shape : shapes) {
	            shape.accept(areaVisitor);
	            shape.accept(perimeterVisitor);
	        }

}}
