import javax.swing.*;
import java.awt.*;

public class Border_Layout_Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating buttons for each region
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");

        // Creating a panel with BorderLayout
        JPanel panel = new JPanel(new BorderLayout());

        // Adding buttons to specific regions
        panel.add(northButton, BorderLayout.NORTH);
        panel.add(southButton, BorderLayout.SOUTH);
        panel.add(eastButton, BorderLayout.EAST);
        panel.add(westButton, BorderLayout.WEST);
        panel.add(centerButton, BorderLayout.CENTER);

        // Adding the panel to the frame
        frame.getContentPane().add(panel);

        // Setting frame properties
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
