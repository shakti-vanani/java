import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame_Example extends JFrame {

    public JFrame_Example() {
        // Set the title of the JFrame
        setTitle("My First JFrame");

        // Set the size of the JFrame
        setSize(400, 300);

        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a JLabel to the JFrame
        JLabel label = new JLabel("Hello, JFrame!");
        add(label);

        // Center the JFrame on the screen
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create an instance of MyFrame
        JFrame_Example myFrame = new JFrame_Example();

        // Make the JFrame visible
        myFrame.setVisible(true);
    }
}
