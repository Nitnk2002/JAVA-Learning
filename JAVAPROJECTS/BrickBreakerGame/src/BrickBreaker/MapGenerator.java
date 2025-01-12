package BrickBreaker;

import java.awt.*;

public class MapGenerator {
    public int[][] map;
    public int brickWidth;
    public int brickHeight;
    public MapGenerator(int row,int col){
        map = new int[row][col];
        for(int []map1 : map){
            for(int j=0; j<map[0].length; j++){
                map1[j]=1;
            }
        }
        brickWidth = 540/col;
        brickHeight = 120/row;
    }
    public void draw(Graphics2D g){
        for(int i=0; i<map.length;i++){
            for(int j=0; j<map[0].length; j++){
                if(map[i][j]>0){
                    g.setColor(Color.green);
                    g.fillRect(j*brickWidth+60,i*brickHeight+40,brickWidth,brickHeight);
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.darkGray);
                    g.drawRect(j*brickWidth+60,i*brickHeight+40,brickWidth,brickHeight);
                }
            }
        }
    }

    public void setBrickValue(int value,int row,int col){
        map[row][col]=value;
    }
}
