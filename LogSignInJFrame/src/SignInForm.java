import javax.swing.*;
import java.awt.*;

public class SignInForm extends JFrame {
    public SignInForm() {

        setTitle("Exercise");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        
        JPanel panel = new JPanel(new BorderLayout());

        JLabel signUpLabel = new JLabel("Sign Up");
        signUpLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(signUpLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new GridLayout(0, 2));

        JLabel usernameLable = new JLabel("Username");
        formPanel.add(usernameLable);
        JTextField usernameField = new JTextField();
        formPanel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password");
        formPanel.add(passwordLabel);
        JPasswordField passwordField = new JPasswordField();
        formPanel.add(passwordField);

        JLabel rePasswordLabel = new JLabel("Re-Password");
        formPanel.add(rePasswordLabel);
        JPasswordField rePasswordField = new JPasswordField();
        formPanel.add(rePasswordField);

        JButton signUpButton = new JButton("Sign Up");
        formPanel.add(signUpButton);
        SignUpAction signUpAction = new SignUpAction(usernameField, passwordField, rePasswordField);
        signUpButton.addActionListener(signUpAction);

        JButton clearButton = new JButton("Clear");
        formPanel.add(clearButton);
        ClearSignup clearForm = new ClearSignup(usernameField, passwordField, rePasswordField);
        clearButton.addActionListener(clearForm);

        panel.add(formPanel, BorderLayout.CENTER);

        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
