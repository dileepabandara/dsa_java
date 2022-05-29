package EventHandling;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UserInteraction extends Frame implements ActionListener {

    private final TextField textField;

    public UserInteraction() {

        // Create components
        textField = new TextField();
        textField.setBounds(60, 50, 200, 30);
        Button button = new Button("Click to print the secret code");
        button.setBounds(60, 120, 200, 30);

        // Register listener
        button.addActionListener(this);

        // Add components and set size, layout and visibility
        add(button);
        add(textField);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("Welcome to the UserInteraction");
    }

    public static void main(String[] args) {
        new UserInteraction();
    }

}
