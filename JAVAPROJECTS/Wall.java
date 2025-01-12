
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

class Cell{
	
	public static final Color[] COLORS = {Color.WHITE, Color.BLACK};
	public static final Color VERY_LIGHT_RED = new Color(255,102,102);
	//x and y: Position of the cell in the grid.
	//size: The size (width and height) of the cell.
	//state: 0 for "on/alive" and 1 for "off/dead."
	private final int x;
	private final int y;
	private final int size;
	
	Cell(int x,int y,int size){
		//Constructor initializes the position, size, and state of a cell.
		this.x=x;
		this.y= y;
		this.size = size;
	}
		public void draw(Graphics g){
		g.setColor(Color.BLUE);		//// Set color based on state
		g.fillRect(x,y,size,size);// Fill the cell
		g.setColor(VERY_LIGHT_RED);// Light gray border
		g.drawRect(x,y,size,size); // Draw the border
	}
}
public class Wall extends Canvas{
	//2D array that stores all the cells.
	private Cell[][] array;
	
	public Wall(int rows,int cols, int size){
		array= new Cell[rows][cols];// Initialize the grid
		for(int r=0;r<rows;r++){
			int y= r*size/2;// Calculate Y position
			for(int c=0;c<cols;c++){
				int x=c*size;// Calculate x position
				array[r][c] = new Cell(x,y,size);
			}
		}
		setSize(cols*size, rows*size);// Set the canvas size

	}
	//Loops through the grid and calls the draw method of each cell.

	public void draw(Graphics g){
		for(Cell[] row: array){
			for(Cell cell: row){
				cell.draw(g);
			}
		}
	}
	//Utility methods to get grid dimensions, access a specific cell, or turn a cell alive.

	public void paint(Graphics g){
		draw(g);
	}
}