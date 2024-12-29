
import java.awt.Point;
import java.awt.Rectangle;
class TenTwo{
	public static void main(String[] args) {
		Point blank = new Point(5, 8);
		Rectangle rect = new Rectangle(0, 2, 4, 4);
		Point center = findCenter(rect);
		double dist = distance(center, blank);
		System.out.println(dist);
}

	public static Point findCenter(Rectangle coordinates){
		
		int x=coordinates.x+coordinates.width/2;
		int y=coordinates.y+coordinates.height/2;
		return new Point(x,y);
	}
	public static double distance(Point center,Point blank){
		
		double x= center.x-blank.x;
		double y= center.y-blank.y;
		
		return Math.sqrt(x*x+y*y);
	}
}