import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

class CardTest extends Canvas {
    private Image cardImage;
    private int cardWidth, cardHeight;

    public CardTest() {
        setBackground(new Color(0x088A4B));
        String cardPath = "D:/Java/card_set/1C.png"; // Update path as needed
        cardImage = new ImageIcon(cardPath).getImage();

        if (cardImage.getWidth(null) == -1) {
            System.out.println("Card image not found: " + cardPath);
        } else {
            cardWidth = cardImage.getWidth(null);
            cardHeight = cardImage.getHeight(null);
        }
    }

    @Override
    public void paint(Graphics g) {
        if (cardImage.getWidth(null) != -1) {
            g.drawImage(cardImage, 50, 50, null);
        } else {
            g.setColor(Color.RED);
            g.fillRect(50, 50, 100, 150);
            g.setColor(Color.BLACK);
            g.drawString("Image Missing", 60, 120);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Card Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new CardTest();
        frame.add(canvas);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
