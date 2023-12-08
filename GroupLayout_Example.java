import javax.swing.*;

public class GroupLayout_Example {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("GroupLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        // Create a JPanel with GroupLayout
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        // Create the horizontal group
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(usernameLabel)
                .addComponent(okButton));
        hGroup.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);
        hGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(usernameField)
                .addComponent(cancelButton));
        layout.setHorizontalGroup(hGroup);

        // Create the vertical group
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(usernameLabel)
                .addComponent(usernameField));
        vGroup.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED);
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(okButton)
                .addComponent(cancelButton));
        layout.setVerticalGroup(vGroup);

        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Set the size of the JFrame
        frame.setSize(300, 150);

        // Make the frame visible
        frame.setVisible(true);
    }
}
