import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInAction implements ActionListener {

    private final JTextField usernameInput;
    private final JPasswordField passwordInput;
    private final JTextField username;
    private final JPasswordField password;

    public LogInAction (JTextField usernameInput, JPasswordField passwordInput, JTextField username, JPasswordField password){
        this.usernameInput = usernameInput;
        this.passwordInput = passwordInput;
        this.username = username;
        this.password = password;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
