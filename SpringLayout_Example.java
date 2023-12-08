import javax.swing.*;
import javax.swing.SpringLayout;

public class SpringLayout_Example {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("SpringLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Create a container with SpringLayout
        JPanel panel = new JPanel(new SpringLayout());

        // Add components to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Set constraints using the SpringLayout
        SpringLayout layout = (SpringLayout) panel.getLayout();
        layout.putConstraint(SpringLayout.WEST, button1, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, button1, 5, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, button2, 5, SpringLayout.EAST, button1);
        layout.putConstraint(SpringLayout.NORTH, button2, 5, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, button3, 5, SpringLayout.EAST, button2);
        layout.putConstraint(SpringLayout.NORTH, button3, 5, SpringLayout.NORTH, panel);

        // Set the size of the JFrame
        frame.setSize(300, 100);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
