
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class DrawablePolygon extends Polygon implements Actor {
	
	protected Color color;
	
	public DrawablePolygon(){
		super();
		color =Color.GRAY;
	}
	public void draw(Graphics g){
		g.setColor(color);
		g.fillPolygon(this);
	}

	@Override
	public void step() {

	}

	public static void main(String[] args){
		JFrame frame = new JFrame("Polygon");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		JPanel panel= new JPanel(){
			
		DrawablePolygon p = new DrawablePolygon();
		{
		p.addPoint(57,110);
		p.addPoint(100,35);
		p.addPoint(143, 110);
		//p.color = Color.GREEN;
		}
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			p.draw(g);
			
		}
		};
		frame.add(panel);
		frame.setResizable(true);
		frame.setVisible(true);
	}
}