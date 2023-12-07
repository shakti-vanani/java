import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaAWTExample {
    public static void main(String[] args) {
        // Create a Frame (window)
        Frame frame = new Frame("Simple AWT Example");

        // Create a Button
        Button button = new Button("Click me");

        // Create an ActionListener for the Button
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        };

        // Add the ActionListener to the Button
        button.addActionListener(actionListener);

        // Add the Button to the Frame
        frame.add(button);

        // Set the size of the Frame
        frame.setSize(300, 200);

        // Make the Frame visible
        frame.setVisible(true);
    }
}