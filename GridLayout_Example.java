import javax.swing.*;
import java.awt.*;

public class GridLayout_Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel with GridLayout (3 rows, 2 columns)
        GridLayout gridLayout = new GridLayout(3, 2);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);

        JPanel panel = new JPanel(gridLayout);

        // Add components (e.g., buttons) to the panel
        for (int i = 1; i <= 6; i++) {
            JButton button = new JButton("Button " + i);
            panel.add(button);
        }

        // Set the layout manager of the content pane to the created panel
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
