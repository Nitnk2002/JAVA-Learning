package BrickBreaker;

import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePlay extends JPanel implements KeyListener, ActionListener {

    private boolean play = false;
    private int score = 0;
    private int totalBricks = 28;
    private Timer timer;
    private Timer gameTimer;
    private int delay = 8;
    private int elapseTime= 0;
    private int playerX =310;
    private int ballPosX =180;
    private int ballPosY =380;
    private int ballXDir =-1;
    private int ballYDir =-2;
    private MapGenerator map;

    public GamePlay() {
        map = new MapGenerator(5,7);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();

    }
    public void setElapseTime(){
        gameTimer= new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(play) {
                    elapseTime++;
                }
            }
        });
        gameTimer.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(1, 1, 692, 592);
        map.draw((Graphics2D) g);
        g.setColor(Color.black);
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,3);
        g.fillRect(691,0,3,592);
        g.setColor(Color.BLUE);
        g.setFont(new Font("serif",Font.BOLD,20));
        g.drawString("Score: "+score,590,30);
        g.setColor(Color.lightGray);
        g.setFont(new Font("serif",Font.ITALIC,20));
        g.drawString("Time: "+elapseTime+" S",10,30);
        g.setColor(Color.black);
        g.fillRect(playerX,550,100,8);
        g.setColor(Color.green);
        g.fillOval(ballPosX,ballPosY,20,20);

        if(ballPosY>570){
            play = false;
            ballXDir = 0;
            ballYDir = 0;
            g.setColor(Color.red);
            g.setFont(new Font("serif",Font.BOLD,30));
            g.drawString("Game Over !",190,280);
            g.setFont(new Font("serif",Font.BOLD,30));
            g.setColor(Color.blue);
            g.drawString("Score: "+score,190,310);
            g.setColor(Color.lightGray);
            g.setFont(new Font("serif",Font.BOLD,15));
            g.drawString("Press Enter to Restart",190,325);
            g.setColor(Color.darkGray);
            g.setFont(new Font("serif",Font.ITALIC,20));
            g.drawString("Time: "+elapseTime+" S",190,345);
        }
        if(totalBricks==0){
            play =false;
            ballXDir = -1;
            ballYDir = -2;
            g.setColor(Color.green);
            g.setFont(new Font("serif",Font.BOLD,30));
            g.drawString("Winner!",190,300);
            g.setColor(Color.blue);
            g.setFont(new Font("serif",Font.BOLD,30));
            g.drawString("Score: "+score,190,300);
            g.setColor(Color.lightGray);
            g.setFont(new Font("serif",Font.BOLD,30));
            g.drawString("Press Enter to Restart",190,340);
            g.setColor(Color.darkGray);
            g.setFont(new Font("serif",Font.ITALIC,20));
            g.drawString("Time: "+elapseTime+" S",190,380);
        }
        g.dispose();
    }
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if(play){

            if(new Rectangle(ballPosX,ballPosY,20,20).intersects(new Rectangle(playerX,550,100,8))){
                ballYDir = -ballYDir;
            }
            A:
            for(int i=0;i<map.map.length;i++){
                for(int j=0;j<map.map[0].length;j++){
                    if(map.map[i][j]==1){
                        int brickX = j*map.brickWidth+60;
                        int brickY = i*map.brickHeight+40;
                        int brickWidth = map.brickWidth;
                        int brickHeight = map.brickHeight;

                        Rectangle brickrect = new Rectangle(brickX,brickY,brickWidth,brickHeight);
                        Rectangle ballrect = new Rectangle(ballPosX,ballPosY,20,20);
                        if(ballrect.intersects(brickrect)){
                            map.setBrickValue(0,i,j);
                            totalBricks--;
                            score+=5;
                            if(ballPosX+19 <= brickrect.x || ballPosX+1 >= brickrect.x + brickrect.width){
                                ballXDir = -ballXDir;
                            }else {
                                ballYDir = -ballYDir;
                            }
                            break A;
                        }
                    }
                }
            }
            ballPosX += ballXDir;
            ballPosY += ballYDir;
            if(ballPosX<0){
                ballXDir = -ballXDir;
            }
            if(ballPosY<0){
                ballYDir = -ballYDir;
            }
            if(ballPosX>=670){
                ballXDir = -ballXDir;
            }
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            if(playerX>=600){
                playerX=600;
            }else{
                moveRight();
            }
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            if(playerX<10){
                playerX=10;
            }else{
                moveLeft();
            }
        }
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            if(!play){
                ballPosX =180;
                ballPosY =380;
                ballXDir =-1;
                ballYDir =-2;
                score =0;
                playerX =310;
                totalBricks = 21;
                elapseTime=0;
                map = new MapGenerator(5,7);
                repaint();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    public  void moveRight(){
        play = true;
        playerX += 20;
    }
    public void moveLeft(){
        play = true;
        playerX -= 20;
    }

}
