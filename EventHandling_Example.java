import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling_Example {
    public static void main(String[] args) {
        // Creating JFrame
        JFrame frame = new JFrame("Event Handling Example");

        // Creating JButton
        JButton button = new JButton("Click Me");

        // Registering ActionListener for the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action to perform when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Adding the button to the JFrame
        frame.getContentPane().add(button);

        // Setting JFrame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
