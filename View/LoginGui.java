package View;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.google.gson.reflect.TypeToken;
import Entity.AdminEntity;
import ModelGson.GsonModel;

public class LoginGui extends JFrame {
    AdminView adminView;
    JLabel usernameLabel, passwordLabel;
    JButton loginBtn;

    public void JavaSwing() {
        setTitle("lOGIN");
        setSize(800, 500);
        setLayout(null);
        JLabel();
        setVisible(true);
    }

    public void JLabel() {
        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(100, 50, 150, 30);
        add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(100, 80, 150, 30);
        add(usernameField);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(100, 100, 150, 30);
        add(passwordLabel);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(100, 130, 150, 30);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(100, 160, 150, 30);
        add(loginBtn);
        add(passwordField);
        loginBtn.addActionListener((e) -> {

            String username = String.valueOf(usernameField.getText());
            String password = String.valueOf(passwordField.getText());
            ArrayList<AdminEntity> listAdmin = new GsonModel<AdminEntity>("Database/DatabaseAdmin.json")
                    .readFromFile(new TypeToken<ArrayList<AdminEntity>>() {
                    }.getType());
            if (listAdmin != null) {
                for (AdminEntity admin : listAdmin) {
                    if (admin.getUsername().equalsIgnoreCase(username)
                            && admin.getPassword().equalsIgnoreCase(password)) {
                        // adminView.MenuAdmin();
                        JOptionPane.showMessageDialog(null, "Selamat Datang", "Login Sukses",
                                JOptionPane.INFORMATION_MESSAGE);
                        // dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Email atau Password Salah");
                    }
                }

            }
        });
    }

    public static void main(String[] args) {
        LoginGui Password = new LoginGui();
        Password.JavaSwing();
    }
}
