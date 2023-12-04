import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEventPackage_Example {
    private JFrame frame;
    private JButton button;

    public SwingEventPackage_Example() {
        frame = new JFrame("Swing Event Example");
        button = new JButton("Click Me");

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Set layout manager
        frame.setLayout(new java.awt.FlowLayout());

        // Add the button to the frame
        frame.add(button);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingEventPackage_Example();
            }
        });
    }
}
