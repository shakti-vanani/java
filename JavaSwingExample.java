import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaSwingExample {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Swing Example");

        // Create a JLabel
        JLabel label = new JLabel("Hello, This is Swing Example!");

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        // Create a JPanel and add components to it
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button);

        // Add the JPanel to the JFrame
        frame.add(panel);

        // Set frame properties
        frame.setSize(300, 200); // Set the size of the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the program when the JFrame is closed
        frame.setVisible(true); // Make the JFrame visible
    }
}
