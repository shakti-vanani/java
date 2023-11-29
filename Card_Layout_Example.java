import javax.swing.*;
import java.awt.*;

public class Card_Layout_Example {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("CardLayout Example");

        // Create JPanel with CardLayout
        JPanel cardPanel = new JPanel(new CardLayout());

        // Create Cards (Components)
        JButton card1Button = new JButton("Card 1");
        JButton card2Button = new JButton("Card 2");

        // Add Cards to CardLayout Panel
        cardPanel.add(card1Button, "Card 1");
        cardPanel.add(card2Button, "Card 2");

        // Get CardLayout Reference
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();

        // Handle Card Switching (Optional)
        card1Button.addActionListener(e -> cardLayout.show(cardPanel, "Card 2"));
        card2Button.addActionListener(e -> cardLayout.show(cardPanel, "Card 1"));

        // Add CardLayout Panel to JFrame
        frame.getContentPane().add(cardPanel);

        // Set Frame Properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
