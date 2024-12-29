import java.awt.Canvas;
import java.awt.Graphics;
public class GridCanvas extends Canvas{
	//2D array that stores all the cells.
	private Cell[][] array;
	
	public GridCanvas(int rows,int cols, int size){
		array= new Cell[rows][cols];// Initialize the grid
		for(int r=0;r<rows;r++){
			int y= r*size;// Calculate Y position
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
	
	public int numRows(){
		return array.length;
	}
	public int numCols(){
		return array[0].length;
	}
	public Cell getCell(int r,int c){
		return array[r][c];
	}
	public void turnOn(int r,int c){
		array[r][c].turnOn();
	}
	public int test(int r,int c){
		try{
			if(array[r][c].isOn()){
				return 1;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		return 0;
	}
	public void update(Graphics g){
		draw(g);
	}
}