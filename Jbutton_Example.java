import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Jbutton_Example {

    public static void main(String[] args) {
        // Create an instance of JFrame
        JFrame frame = new JFrame("JButton Example");

        // Create an instance of JButton with text
        JButton button = new JButton("Click Me");

        // Add an ActionListener to the JButton
        button.addActionListener(e -> {
            // This code will be executed when the button is clicked
            JOptionPane.showMessageDialog(frame, "Button Clicked!");
        });

        // Add the JButton to the JFrame
        frame.add(button);

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
