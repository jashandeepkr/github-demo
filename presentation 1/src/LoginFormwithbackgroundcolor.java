import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFormwithbackgroundcolor extends JFrame implements ActionListener {
    private JLabel emailLabel, passwordLabel;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginFormwithbackgroundcolor() {
        createComponents();
        setLayout(new GridBagLayout());
        addComponents();
        setTitle("Login Form");
        setSize(450, 225);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void setBackgroundColor() {
        getContentPane().setBackground(Color.darkGray);
    }
    private void createComponents() {
        emailLabel = new JLabel("Email:");
        passwordLabel = new JLabel("Password:");
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        messageLabel = new JLabel("");
    }

    private void addComponents() {
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        add(emailLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        add(emailField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(passwordLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        add(passwordField, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        add(loginButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        add(messageLabel, constraints);

        loginButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        // Replace this with your own validation logic
        if ("jashandeepkaur@gmail.com".equals(email) && ("jass2031").equals(password)) {
            messageLabel.setText("Login successful!");
            messageLabel.setForeground(Color.green);
        } else {
            messageLabel.setText("Invalid email or password.");
            messageLabel.setForeground(Color.red);
        }
    }

    public static void main(String[] args) {
        new LoginFormwithbackgroundcolor();
    }
}
