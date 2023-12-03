import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("No Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout manager to null
        frame.setLayout(null);

        // Create components
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Manually set position and size
        button1.setBounds(10, 10, 100, 30);
        button2.setBounds(120, 10, 100, 30);
        button3.setBounds(230, 10, 100, 30);

        // Add components to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // Set frame properties
        frame.setSize(350, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}