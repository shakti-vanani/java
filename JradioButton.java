import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;

public class JradioButton {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("JRadioButton Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JPanel to hold the radio buttons
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create JRadioButtons
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JRadioButton radioButton3 = new JRadioButton("Option 3");

        // Create a ButtonGroup to ensure only one radio button is selected at a time
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        // Add radio buttons to the panel
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame visibility
        frame.setVisible(true);
    }
}
