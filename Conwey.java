
import javax.swing.JFrame;

public class Conwey extends Automaton{
	private GridCanvas grid;
	
	public Conwey(){
		this.grid= new GridCanvas(5,15,25);
		grid.turnOn(10,1);
		grid.turnOn(10,2);
		grid.turnOn(10,3);
		grid.turnOn(1,25);
		grid.turnOn(2,25);
		grid.turnOn(3,25);
	} 
	private void mainloop(){
		while(true){
			this.update();
			grid.repaint();
			try{
			Thread.sleep(500);
			}catch(InterruptedException e){
				//exception handler
			}
		}
	}
	private int countAlive(int r,int c){
		int count=0;
		count += grid.test(r-1,c-1);
		count += grid.test(r-1,c);
		count += grid.test(r-1,c+1);
		count += grid.test(r,c-1);
		count += grid.test(r,c+1);
		count += grid.test(r+1,c-1);
		count += grid.test(r+1,c);
		count += grid.test(r+1,c+1);
		return count;
	}
	public void update(){
		int[][] counts= countNeighbors();
		updateGrid(counts);
	}
	private int[][] countNeighbors(){
		int rows= grid.numRows();
		int cols= grid.numCols();
		
		int[][] counts =new int[rows][cols];
		for(int r=0;r<rows;r++){
			for(int c=0;c<cols;c++){
				counts[r][c]= countAlive(r,c);
			}
		}
		return counts;
	}
		private void updateGrid(int[][] count){
		int rows= grid.numRows();
		int cols= grid.numCols();
		
		int[][] counts =new int[rows][cols];
		for(int r=0;r<rows;r++){
			for(int c=0;c<cols;c++){
				Cell cell = grid.getCell(r,c);
				updateCell(cell,count[r][c]);
			}
		}
	}
	private  static void updateCell(Cell cell, int count){
		if(cell.isOn()){
			if(count<2 || count>3){
				cell.turnOff();
			}
		}else{
			if(count==3){
				cell.turnOn();
			}
		}
	}
	public static void main(String[] args){
		String title="Conwey's Game of Life";
		Conwey game= new Conwey();
		game.run(title, 2);
	}
}