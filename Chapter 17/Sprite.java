
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
public class Sprite implements Actor, KeyListener{
	
	private int xpos;
	private int ypos;
	private int dx;
	private int dy;
	private Image image;
	
	public Sprite(String path, int xpos){
		
		this.xpos = xpos;
		this.ypos = ypos;
		try{
			this.image = ImageIO.read(new File(path));
		
		}
		catch (IOException exc){
			exc.printStackTrace();
		}
	}

	public void draw(Graphics g){
		g.drawImage(image,xpos,ypos,null);
		
	}
	public void step(){
		xpos += dx;
		ypos += dy;
	}


	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()){
			case KeyEvent.VK_UP :
				dy = -5;
				break;
			case KeyEvent.VK_DOWN:
				dy =+5;
				break;
			case KeyEvent.VK_LEFT:
				dx =-5;
				break;
			case KeyEvent.VK_RIGHT:
				dx =+5;
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()){
			case KeyEvent.VK_UP:
			case KeyEvent.VK_DOWN:
				dy= 0;
				break;
			case KeyEvent.VK_LEFT:
			case KeyEvent.VK_RIGHT:
				dx =0;
				break;
		}
	}
}