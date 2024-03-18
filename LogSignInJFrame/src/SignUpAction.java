import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SignUpAction implements ActionListener{
    private final JTextField userTextField;
    private final JPasswordField passwordField;
    private final JPasswordField rePasswordField;

    public SignUpAction (JTextField userTextField, JPasswordField passwordField, JPasswordField rePasswordField){
        this.userTextField = userTextField;
        this.passwordField = passwordField;
        this.rePasswordField = rePasswordField;
    }

    public void actionPerformed(ActionEvent e)  {
        char[] getPassword = passwordField.getPassword();
        String password = new String(getPassword);

        char[] getRePassword = rePasswordField.getPassword();
        String rePassword = new String(getRePassword);

        if(!(userTextField.getText().isEmpty() || password.isEmpty() || rePassword.isEmpty())){
            if(password.equals(rePassword)){
                displayWelcomeScreen();
            }else {
                JOptionPane.showMessageDialog(null, "Password is incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void displayWelcomeScreen (){
        JFrame newFrame = new JFrame("Excercise");
        newFrame.setSize(500, 200);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newFrame.setLocationRelativeTo(null);
        newFrame.setVisible(true);

        JPanel newPanel = new JPanel(new GridLayout(1, 2));

        JPanel form = new JPanel(new BorderLayout());

        JLabel titleLabel = new JLabel("Welcome to our application");
        titleLabel.setForeground(Color.green);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        form.add(titleLabel, BorderLayout.NORTH);

        ImageIcon icon = new ImageIcon("src/icons8-check-48.png");
        JLabel iconLabel = new JLabel();
        iconLabel.setIcon(icon);
        iconLabel.setHorizontalAlignment(SwingConstants.CENTER);
        form.add(iconLabel, BorderLayout.CENTER);

        newPanel.add(form);

        newFrame.add(newPanel);

        newFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                newFrame.dispose();
                new LoginForm();
            }
        });

    }
}
