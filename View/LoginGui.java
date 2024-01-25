package view;
// package View;

// import java.awt.Color;
// import java.awt.Font;
// import java.util.ArrayList;

// import javax.swing.JButton;
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JPasswordField;
// import javax.swing.JTextField;

// // import com.google.gson.reflect.TypeToken;

// import Controller.LoginController;
// import Entity.AdminEntity;
// import ModelGson.GsonModel;

// public class LoginGui extends Frame {
//     private JLabel rsLabel, kartuLabel, passwordLabel;
//     private JTextField kartuField;
//     private JPasswordField passwordField;
//     private JButton loginBtn;

//     public LoginGui() {
//         super("Login", 400, 600);
//         setLocation(500, 150);
//     }

//     @Override
//     protected void component() {
//         rsLabel = new JLabel("Rumah Sakit Abal-Abal");
//         rsLabel.setFont(new Font("Arial", Font.BOLD, 24));
//         setBound(rsLabel, 65, 200, 300, 45);

//         kartuLabel = new JLabel("Usename");
//         kartuLabel.setFont(new Font("Arial", Font.BOLD, 13));
//         setBound(kartuLabel, 65, 250, 100, 18);

//         kartuField = new JTextField();
//         setBound(kartuField, 65, 270, 270, 30);

//         passwordLabel = new JLabel("Password");
//         passwordLabel.setFont(new Font("Arial", Font.BOLD, 13));
//         setBound(passwordLabel, 65, 315, 100, 18);

//         passwordField = new JPasswordField();
//         setBound(passwordField, 65, 335, 270, 30);

//         loginBtn = new JButton("Masuk");
//         loginBtn.setForeground(Color.white);
//         loginBtn.setBackground(Color.DARK_GRAY);
//         loginBtn.setFocusPainted(false);
//         setBound(loginBtn, 157, 380, 85, 30);
//     }

//     @Override
//     protected void event() {
//         LoginController objekRawat = new LoginController();

//         loginBtn.addActionListener((e) -> {
//             try {
//                 String username = String.valueOf(kartuField.getText());
//                 String password = String.valueOf(passwordField.getPassword());
//                 objekRawat.loginAdmin(password, password);

//                 ArrayList<AdminEntity> listAdmin = new GsonModel<AdminEntity>("Database/DatabaseAdmin.json")
//                         .readFromFile(new TypeToken<ArrayList<AdminEntity>>() {
//                         }.getType());
//                 if (listAdmin != null) {
//                     for (AdminEntity admin : listAdmin) {
//                         if (admin.getUsername().equalsIgnoreCase(username)
//                                 && admin.getPassword().equalsIgnoreCase(password)) {
//                         JOptionPane.showMessageDialog(null, "Login Berhasil");
//                             new MenuGui().setVisible(true);
//                             return;
//                         }
//                     }
//                 }else {
//                     JOptionPane.showMessageDialog(null, "Data Tidak Valid", "Login Sukses",
//                             JOptionPane.ERROR_MESSAGE);
//                     dispose();
//                     new LoginGui().setVisible(true);
//                 }
//             } catch (Exception ex) {
//                 JOptionPane.showMessageDialog(null, "Masukkan Inputan Yang benar", "Login Sukses",
//                         JOptionPane.ERROR_MESSAGE);
//                 dispose();
//                 new LoginGui().setVisible(true);
//             }

//         });
//     }
// }