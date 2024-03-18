import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearLogin implements ActionListener {
    private final JTextField userText;
    private final JPasswordField passwordText;

    public ClearLogin (JTextField userText, JPasswordField passwordText){
        this.userText = userText;
        this.passwordText = passwordText;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        userText.setText("");
        passwordText.setText("");
    }
}
