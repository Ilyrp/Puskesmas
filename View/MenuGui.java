package View;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

public class MenuGui extends JFrame {

    JButton inserData, loginPasien, loginAdmin;

    public void JavaSwing() {
        setTitle("lOGIN");
        setSize(800, 500);
        setLayout(null);
        Menu();
        setVisible(true);
    }

    public void Menu() {

        inserData = new JButton("Insert Data");
        inserData.setBounds(100, 230, 160, 80);
        add(inserData);

        loginPasien = new JButton("Login Pasien");
        loginPasien.setBounds(300, 230, 160, 80);
        add(loginPasien);

        loginAdmin = new JButton("Login Admin");
        loginAdmin.setBounds(500, 230, 150, 80);
        add(loginAdmin);

        loginAdmin.addActionListener((e) -> {
            JOptionPane.showMessageDialog(null, "Selamat Datang", "Login Sukses",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
            new LoginGui().JavaSwing();
        });

        inserData.addActionListener((e) -> {
            JOptionPane.showMessageDialog(null, "Masuk data", "Menu Insert Data",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
            new insertDataGui().JavaSwing();
        });

        
    }

    public static void main(String[] args) {
        MenuGui Password = new MenuGui();
        Password.JavaSwing();
    }
}
