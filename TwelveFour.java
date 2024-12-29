import java.awt.Color;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

class TwelveFour extends Canvas {
    private Image[][] images;
    private int cardWidth, cardHeight;
    private int scaledWidth = 120; // Scaled card width
    private int scaledHeight = 180; // Scaled card height

    public TwelveFour() {
        setBackground(new Color(0x088A4B));
        images = new Image[14][4];
        String cardSet = "card_set"; // Ensure this folder exists in your working directory
        String card = "CDHS";

        for (int suit = 0; suit < 4; suit++) {
            char c = card.charAt(suit);
            for (int rank = 1; rank < 14; rank++) {
                String s = String.format("D:/Java/%s/%d%c.png", cardSet, rank, c);
                images[rank][suit] = new ImageIcon(s).getImage();
                if (images[rank][suit].getWidth(null) == -1) {
                    System.out.println("Image not found: " + s);
                }
            }
        }
    }

    public void drawCard(Graphics g, int rank, int suit, int x, int y) {
        Image image = images[rank][suit];
        if (image == null) {
            // Placeholder for missing images
            g.setColor(Color.RED);
            g.fillRect(x, y, scaledWidth, scaledHeight);
            g.setColor(Color.BLACK);
            g.drawRect(x, y, scaledWidth, scaledHeight);
            g.drawString(rank + "" + suit, x + 10, y + 20);
        } else {
            g.drawImage(image, x, y, scaledWidth, scaledHeight, null);
        }
    }

    public void paint(Graphics g) {
        for (int rank = 1; rank <= 13; rank++) {
            for (int suit = 0; suit <= 3; suit++) {
                int x = (rank - 1) * (scaledWidth + 10); // 10px spacing
                int y = suit * (scaledHeight + 10);
                drawCard(g, rank, suit, x, y);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Card Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the CardTable
        Canvas canvas = new TwelveFour();
        frame.getContentPane().add(canvas);

        // Show the frame
        frame.pack();
        frame.setSize(800, 600); // Adjust frame size as needed
        frame.setVisible(true);
    }
}
