import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Jpanel_Example extends JPanel {

    public Jpanel_Example() {
        // Add a JLabel to the JPanel
        JLabel label = new JLabel("Hello, JPanel!");
        add(label);
    }

    public static void main(String[] args) {
        // Create an instance of JFrame
        JFrame frame = new JFrame("JPanel Example");

        // Create an instance of MyPanel
        Jpanel_Example myPanel = new Jpanel_Example();

        // Add the MyPanel instance to the JFrame
        frame.add(myPanel);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the JFrame
        frame.setSize(400, 300);

        // Center the JFrame on the screen
        frame.setLocationRelativeTo(null);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
