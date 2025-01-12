
import javax.swing.BorderFactory; 
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BrickBreaker{
	
	public static void main(String[] args){
		
		JFrame frame= new JFrame("Brick Breaker Game ");
		Wall wall= new Wall(10,15,40);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(wall);
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setBounds(50, 100, 300, 50); 
        slider.setMajorTickSpacing(20);    
        slider.setMinorTickSpacing(5);     
        slider.setPaintTicks(true);        
        slider.setPaintLabels(true);
		JLabel valueLabel = new JLabel("Value: 50");
        valueLabel.setBounds(170, 160, 100, 30);
		        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue(); // Get the slider's value
                valueLabel.setText("Value: " + value); // Update the label
            }
        });
		frame.add(slider);
        frame.add(valueLabel);
		frame.add(panel);
		frame.setResizable(false);
		frame.setBounds(10,10,700,600);
		frame.setVisible(true);
		
	}
}