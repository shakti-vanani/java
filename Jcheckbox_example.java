import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class Jcheckbox_example {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("JCheckBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JPanel to hold the checkboxes
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create JCheckBoxes
        JCheckBox checkBox1 = new JCheckBox("Option 1");
        JCheckBox checkBox2 = new JCheckBox("Option 2");
        JCheckBox checkBox3 = new JCheckBox("Option 3");

        // Add checkboxes to the panel
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame visibility
        frame.setVisible(true);
    }
}

