
import java.awt.Color;
import java.awt.Graphics;

public class Cell{
	//Defines two colors: white for "on/alive" and black for "off/dead."
	
	public static final Color[] COLORS = {Color.WHITE, Color.BLACK};
	public static final Color VERY_LIGHT_RED = new Color(255,102,102);
	//x and y: Position of the cell in the grid.
	//size: The size (width and height) of the cell.
	//state: 0 for "on/alive" and 1 for "off/dead."
	private final int x;
	private final int y;
	private final int size;
	private int state;
	
	Cell(int x,int y,int size){
		//Constructor initializes the position, size, and state of a cell.
		this.x=x;
		this.y= y;
		this.size = size;
		this.state= 0;//// Default state: alive (0)
	}
	//Draws the cell using the Graphics object with a slight margin to form a grid-like appearance.
	public void draw(Graphics g){
		g.setColor(COLORS[state]);		//// Set color based on state
		g.fillRect(x+1,y+1,size-1,size-1);// Fill the cell
		g.setColor(VERY_LIGHT_RED);// Light gray border
		g.drawRect(x,y,size,size); // Draw the border
	}
	public boolean isOn(){
		return state==0;// Checks if the cell is alive
	}
	public boolean isOff(){
		return state==1;// Checks if the cell is dead
	}
	public void turnOff(){
		state=0;// Turns the cell alive
	}
	public void turnOn(){
		state=1;// Turns the cell dead
	}
}