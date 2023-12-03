import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDelegationModal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Delegation Modal Example");
        JButton openModalButton = new JButton("Open Modal");

        // Registering ActionListener for the open modal button
        openModalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Event handling code for opening the modal
                JOptionPane.showMessageDialog(frame, "This is a simple modal dialog!");
            }
        });

        frame.getContentPane().add(openModalButton);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
