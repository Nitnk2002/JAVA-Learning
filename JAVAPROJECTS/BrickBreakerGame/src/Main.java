import BrickBreaker.GamePlay;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GamePlay game =new GamePlay();
        frame.setBounds(10,10,700,600);
        frame.setTitle("BrickBreaker Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(game);
        game.setElapseTime();
    }
}
