package view;
// package View;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JTextField;

// import Controller.PasienController;

// public class InsertDataGui extends Frame {
//     private JLabel nikLabel, namaLabel, alamatJLabel, jenisKelaminLabel, bpjsLabel;
//     private JButton insertData;

//     public void JavaSwing() {
//         setTitle("Insert Data");
//         setSize(800, 500);
//         setLayout(null);
//         createInsertDataMenu();
//         setVisible(true);
//     }

//     private void createInsertDataMenu() {
//         nikLabel = new JLabel("Nik");
//         nikLabel.setBounds(300, 50, 150, 30);
//         JTextField nikField = new JTextField();
//         nikField.setBounds(300, 80, 150, 30);
//         add(nikLabel);
//         add(nikField);

//         namaLabel = new JLabel("Nama ");
//         namaLabel.setBounds(300, 110, 150, 30);
//         JTextField namaField = new JTextField();
//         namaField.setBounds(300, 140, 150, 30);
//         add(namaLabel);
//         add(namaField);

//         alamatJLabel = new JLabel("Alamat");
//         alamatJLabel.setBounds(300, 170, 150, 30);
//         JTextField alamatField = new JTextField();
//         alamatField.setBounds(300, 200, 150, 30);
//         add(alamatJLabel);
//         add(alamatField);

//         jenisKelaminLabel = new JLabel("Jenis Kelamin");
//         jenisKelaminLabel.setBounds(300, 230, 150, 30);
//         JTextField jenisKelaminField = new JTextField();
//         jenisKelaminField.setBounds(300, 260, 150, 30);
//         add(jenisKelaminLabel);
//         add(jenisKelaminField);

//         bpjsLabel = new JLabel("No BPJS");
//         bpjsLabel.setBounds(300, 290, 150, 30);
//         JTextField bpjsField = new JTextField();
//         bpjsField.setBounds(300, 320, 150, 30);
//         add(bpjsLabel);
//         add(bpjsField);

//         insertData = new JButton("Insert Data");
//         insertData.setBounds(295, 360, 160, 80);
//         add(insertData);

//         insertData.addActionListener((e) -> {
//             try {
//                 JOptionPane.showMessageDialog(null, "Berhasil Input Data", "Menu Insert Data",
//                         JOptionPane.INFORMATION_MESSAGE);
//                 dispose();
//                 String nik = String.valueOf(nikField.getText());
//                 String nama = String.valueOf(namaField.getText());
//                 String alamat = String.valueOf(alamatField.getText());
//                 String jenisKelamin = String.valueOf(jenisKelaminField.getText());
//                 String bpjs = String.valueOf(bpjsField.getText());
//                 new PasienController().insertPasien(nik, nama, jenisKelamin, alamat, bpjs);
//             } catch (Exception ex) {
//                 ex.printStackTrace();
//             }
//         });
//     }

//     public static void main(String[] args) {
//         InsertDataGui insertDataGui = new InsertDataGui();
//         insertDataGui.JavaSwing();
//     }
// }
