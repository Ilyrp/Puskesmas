package A;
// package View;

// import javax.swing.JButton;
// import javax.swing.JOptionPane;

// public class MenuGui extends Frame {

//     private JButton insertData, loginPasien, loginAdmin;

//     public MenuGui() {
//         super("Menu Utama", 800, 500);
//     }

//     @Override
//     protected void component() {
//         insertData = new JButton("Insert Data");
//         insertData.setBounds(100, 230, 160, 80);
//         add(insertData);

//         loginPasien = new JButton("Login Pasien");
//         loginPasien.setBounds(300, 230, 160, 80);
//         add(loginPasien);

//         loginAdmin = new JButton("Login Admin");
//         loginAdmin.setBounds(500, 230, 150, 80);
//         add(loginAdmin);

//     }

//     @Override
//     protected void event() {
//         loginAdmin.addActionListener((e) -> {
//             JOptionPane.showMessageDialog(null, "Selamat Datang", "Login Sukses", JOptionPane.INFORMATION_MESSAGE);
//             dispose();
//             new LoginGui().setVisible(true);
//         });

//         insertData.addActionListener((e) -> {
//             dispose();
//             new insertDataGui().JavaSwing();
//         });
//     }
// }