import java.awt.Point;
import java.awt.Rectangle;
class TenThree{
	public static void main(String[] args) {

		Rectangle box1 = new Rectangle(2, 4, 7, 9);
		Point p1 = findCenter(box1);
		printPoint(p1);
		box1.grow(1, 1);
		Point p2 = findCenter(box1);
		printPoint(p2);

	}
	
		public static Point findCenter(Rectangle coordinates){
		
		int x=coordinates.x+coordinates.width/2;
		int y=coordinates.y+coordinates.height/2;
		return new Point(x,y);
		}
		public static void printPoint (Point p){
			
			System.out.println("Center: ( "+p.x+", "+p.y+")");
		}
}