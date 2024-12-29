
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Drawing extends Canvas{
	
	private ArrayList<DrawablePolygon> list;
	
	public Drawing(int width,int height){
		setSize(width, height);
		setBackground(Color.WHITE);
		list = new ArrayList<DrawablePolygon>();
	}
	public void add(DrawablePolygon cp){
		list.add(cp);
	}
	public void paint(Graphics g){
		for(DrawablePolygon dp: list){
			dp.draw(g);
		}
	}
	public static void main(String[] args){
		
		DrawablePolygon p1= new RegularPolygon(3,50,Color.GREEN);
		DrawablePolygon p2= new RegularPolygon(6,50,Color.ORANGE);
		DrawablePolygon p3= new RegularPolygon(360,50,Color.BLUE);
		
		p1.translate(100,80);
		p2.translate(250,120);
		p3.translate(400,160);
		
		Drawing drawing = new Drawing(500,250);
		drawing.add(p1);
		drawing.add(p2);
		drawing.add(p3);
		
		JFrame frame= new JFrame("Drawing");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(drawing);
		frame.pack();
		frame.setVisible(true);
	}
}