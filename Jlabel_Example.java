import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Jlabel_Example {

    public static void main(String[] args) {
        // Create an instance of JFrame
        JFrame frame = new JFrame("Styled JLabel Example");

        // Create an instance of JLabel with styled text
        JLabel label = new JLabel("<html><h1><font color='blue'>Hello, JLabel!</font></h1></html>");

        // Set font and background color
        label.setFont(new Font("Serif", Font.BOLD, 20));
        label.setBackground(Color.BLACK);

        // Enable background color to be visible
        label.setOpaque(true);

        // Add the JLabel to the JFrame
        frame.add(label);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the JFrame
        frame.setSize(300, 200);

        // Center the JFrame on the screen
        frame.setLocationRelativeTo(null);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
