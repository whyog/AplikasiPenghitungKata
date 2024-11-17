/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasipenghitungkata;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.event.*;
import java.util.regex.*;
/**
 *
 * @author USER
 */
public class AplikasiPenghitungKataForm extends javax.swing.JFrame {
      private JTextArea textArea;
    private JLabel labelKata, labelKarakter, labelKalimat, labelParagraf, labelPencarian, labelHasilPencarian;
    private JButton buttonHitung, buttonSimpan;
    private JTextField textFieldCari;
    private JScrollPane scrollPane;

    /**
     * Creates new form AplikasiPenghitungKataForm
     */
    public AplikasiPenghitungKataForm() {
        initComponents();
         setListeners();
    }
  private void setListeners() {
    jButtonhitung.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            hitung();
        }
    });

    jButtoncari.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            cariKata();
        }
    });

    jButtonclear.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            jTextAreainput.setText("");
            jTextAreahasil.setText("");
            jTextFieldcari.setText("");
        }
    });

    jButtonexport.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            exportToFile();
        }
    });

    jTextAreainput.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) { hitung(); }
        @Override
        public void removeUpdate(DocumentEvent e) { hitung(); }
        @Override
        public void changedUpdate(DocumentEvent e) { hitung(); }
    });
}


    // Metode untuk menghitung jumlah kata, karakter, kalimat, dan paragraf
    private void hitung() {
        String teks = jTextAreainput.getText();

        // Menghitung jumlah karakter
        int jumlahKarakter = teks.length();

        // Menghitung jumlah kata
        String[] kataArray = teks.trim().split("\\s+");
        int jumlahKata = (teks.isBlank()) ? 0 : kataArray.length;

        // Menghitung jumlah kalimat (dipisahkan oleh '.', '!', atau '?')
        String[] kalimatArray = teks.split("[.!?]");
        int jumlahKalimat = (teks.isBlank()) ? 0 : kalimatArray.length;

        // Menghitung jumlah paragraf (dipisahkan oleh '\n')
        String[] paragrafArray = teks.split("\\n+");
        int jumlahParagraf = (teks.isBlank()) ? 0 : paragrafArray.length;

        // Menampilkan hasil di JTextArea hasil
        jTextAreahasil.setText("Jumlah Kata: " + jumlahKata +
                "\nJumlah Karakter: " + jumlahKarakter +
                "\nJumlah Kalimat: " + jumlahKalimat +
                "\nJumlah Paragraf: " + jumlahParagraf);
    }

    // Metode untuk mencari kata dalam teks
    private void cariKata() {
        String teks = jTextAreainput.getText();
        String kataCari = jTextFieldcari.getText();

        if (!kataCari.isBlank()) {
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(kataCari) + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(teks);

            int jumlahKemunculan = 0;
            while (matcher.find()) {
                jumlahKemunculan++;
            }

            jTextAreahasil.append("\nKata '" + kataCari + "' ditemukan sebanyak: " + jumlahKemunculan + " kali.");
        } else {
            jTextAreahasil.append("\nTidak ada kata yang dimasukkan untuk dicari.");
        }
    }

  // Metode untuk mengekspor teks dari JTextArea ke file .txt
// Method to export the text from JTextArea (result) to a .txt file
private void exportToFile() {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Save as text file");

    // Open dialog to save the file
    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();

        // Ensure the file has a .txt extension
        if (!fileToSave.getName().endsWith(".txt")) {
            fileToSave = new File(fileToSave.getAbsolutePath() + ".txt");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave))) {
            // Write the content of jTextAreahasil (result area) to the file
            writer.write(jTextAreahasil.getText());
            JOptionPane.showMessageDialog(this, "File saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving file!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreainput = new javax.swing.JTextArea();
        jTextFieldcari = new javax.swing.JTextField();
        jButtoncari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreahasil = new javax.swing.JTextArea();
        jButtonhitung = new javax.swing.JButton();
        jButtonexport = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextAreainput.setColumns(20);
        jTextAreainput.setRows(5);
        jScrollPane1.setViewportView(jTextAreainput);

        jTextFieldcari.setBackground(new java.awt.Color(204, 204, 204));

        jButtoncari.setText("Cari Kata ");

        jTextAreahasil.setBackground(new java.awt.Color(204, 204, 204));
        jTextAreahasil.setColumns(20);
        jTextAreahasil.setRows(5);
        jScrollPane2.setViewportView(jTextAreahasil);

        jButtonhitung.setText("Hitung");

        jButtonexport.setText("Export");

        jButtonclear.setText("Clear");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Maukan text ke dalam kolom di bawah  :");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("APLIKASI PENGHITUNG KATA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jButtonhitung, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonexport, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextFieldcari, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtoncari))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtoncari)
                    .addComponent(jTextFieldcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonhitung)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonclear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonexport))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPenghitungKataForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncari;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtonexport;
    private javax.swing.JButton jButtonhitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreahasil;
    private javax.swing.JTextArea jTextAreainput;
    private javax.swing.JTextField jTextFieldcari;
    // End of variables declaration//GEN-END:variables
}
