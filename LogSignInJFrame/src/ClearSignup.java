import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearSignup implements ActionListener {

    private final JTextField userTextField;
    private final JPasswordField passwordField;
    private final JPasswordField rePasswordField;

    public ClearSignup(JTextField userTextField, JPasswordField passwordField, JPasswordField rePasswordField){
        this.userTextField = userTextField;
        this.passwordField = passwordField;
        this.rePasswordField = rePasswordField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        userTextField.setText("");
        passwordField.setText("");
        rePasswordField.setText("");
    }
}
