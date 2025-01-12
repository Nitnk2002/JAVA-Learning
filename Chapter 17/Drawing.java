
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Drawing extends Canvas{
	
	private ArrayList<Actor> list;
	
	public Drawing(int width,int height){
		setSize(width, height);
		setBackground(Color.WHITE);
		list = new ArrayList<Actor>();
	}
	public void add(Actor cp){
		list.add(cp);
	}
	 public Object[] getActors() {
		return list.toArray();
    }
	public void paint(Graphics g){
		for(Actor dp: list){
			dp.draw(g);
		}
	}
	    public void step() {
        for (Actor actor : list) {
            actor.step();
        }
        repaint();
    }

	public void add(Sprite sprite) {
		list.add(sprite);
	}

//	public void add(DrawablePolygon p1) {
//		list.add(p1);
//	}
}