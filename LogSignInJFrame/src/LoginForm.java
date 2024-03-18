import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
    public LoginForm(){

        setTitle("Exercise");
        setSize(500, 200);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel titleLabel = new JLabel("Log In");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        JPanel form = new JPanel(new GridLayout(0, 2));

        JLabel usernameLabel = new JLabel("Username");
        form.add(usernameLabel);
        JTextField usernameText = new JTextField();
        form.add(usernameText);

        JLabel passwordLabel = new JLabel("Password");
        form.add(passwordLabel);
        JPasswordField passwordText = new JPasswordField();
        form.add(passwordText);

        JButton loginButton = new JButton("Log In");
        form.add(loginButton);

        JButton clearButton = new JButton("Clear");
        form.add(clearButton);
        ClearLogin clearLogin = new ClearLogin(usernameText, passwordText);
        clearButton.addActionListener(clearLogin);

        panel.add(form, BorderLayout.CENTER);

        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
