import java.awt.*;
import java.awt.event.*;

public class AWTEventPackage_Example {
    private Frame frame;
    private Button button;

    public AWTEventPackage_Example() {
        frame = new Frame("AWT Event Example");
        button = new Button("Click Me");

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        // Add WindowListener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Add the button to the frame
        frame.add(button, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTEventPackage_Example();
    }
}