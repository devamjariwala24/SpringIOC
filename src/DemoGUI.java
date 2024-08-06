import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoGUI {

    public static void createGUI() {
        // Create the Window Frame to add components to.
        JFrame frame = new JFrame("SwingIOC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null); // Center the window on the screen

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding around components
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Add the GUI components
        JLabel label = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        frame.getContentPane().add(label, gbc);

        JTextField text = new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0; // Allow the text field to expand horizontally
        frame.getContentPane().add(text, gbc);

        JButton button = new JButton("Submit");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // Span both columns
        gbc.weightx = 0; // Reset weightx
        gbc.anchor = GridBagConstraints.CENTER;
        frame.getContentPane().add(button, gbc);

        JButton buttonExit = new JButton("Exit");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // Span both columns
        frame.getContentPane().add(buttonExit, gbc);

        JLabel labelOut = new JLabel();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2; // Span both columns
        frame.getContentPane().add(labelOut, gbc);

        buttonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Set a custom font and color for better aesthetics
        label.setFont(new Font("Arial", Font.BOLD, 14));
        text.setFont(new Font("Arial", Font.PLAIN, 14));
        button.setFont(new Font("Arial", Font.BOLD, 12));
        buttonExit.setFont(new Font("Arial", Font.BOLD, 12));
        labelOut.setFont(new Font("Arial", Font.PLAIN, 12));
        button.setBackground(new Color(0, 122, 204));
        button.setForeground(Color.WHITE);
        buttonExit.setBackground(new Color(255, 69, 58));
        buttonExit.setForeground(Color.WHITE);

        // Display the window.
        frame.setVisible(true);
    }

    }
