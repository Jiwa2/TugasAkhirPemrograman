public class FormKomplain extends javax.swing.JFrame {

    // 1. BIKIN VARIABEL GLOBAL DI SINI UNTUK MENAMPUNG DATA NYA
    private String namaUser;
    private String noKamar;
    private String hargaSewa;

    // 2. UBAH CONSTRUCTOR UTAMA AGAR MENERIMA PARAMETER
    public FormKomplain(String nama, String kamar, String harga) {
        initComponents();
        this.namaUser = nama;
        this.noKamar = kamar;
        this.hargaSewa = harga;

        // Contoh setup teks otomatis ke komponen (sesuaikan dengan nama komponen di GUI lu nanti)
        // txtNamaPenghuni.setText(namaUser);
        // txtNomerKamar.setText(noKamar);
        // txtNamaPenghuni.setEditable(false);
        // txtNomerKamar.setEditable(false);
    }
    
    // Ini constructor kosong opsional biar NetBeans Design Mode gak bingung
    public FormKomplain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNomorKamar = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDeskripsi = new javax.swing.JTextField();
        btnKomplain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("Form Komplain");

        jLabel4.setText("Sampaikan Kendala Fasilitas Anda. Kami akan segera Menindaklanjutin dalam 1x24 jam.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Nomor Kamar");

        txtNomorKamar.addActionListener(this::txtNomorKamarActionPerformed);

        txtUsername.addActionListener(this::txtUsernameActionPerformed);

        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Username");

        txtJudul.setForeground(new java.awt.Color(204, 204, 204));
        txtJudul.setText("Contoh: AC Kamar Tidak Dingin ");
        txtJudul.addActionListener(this::txtJudulActionPerformed);

        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Subjek/Judul");

        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Deskripsi Keluhan");

        txtDeskripsi.setBackground(new java.awt.Color(204, 255, 204));
        txtDeskripsi.setForeground(new java.awt.Color(204, 204, 204));
        txtDeskripsi.setText("Jelaskan secara detail kendala yang Anda alami...");
        txtDeskripsi.addActionListener(this::txtDeskripsiActionPerformed);

        btnKomplain.setBackground(new java.awt.Color(0, 102, 0));
        btnKomplain.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKomplain.setForeground(new java.awt.Color(255, 255, 255));
        btnKomplain.setText("Kirim Komplain");
        btnKomplain.addActionListener(this::btnKomplainActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDeskripsi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomorKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnKomplain)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomorKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDeskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnKomplain))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtNomorKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomorKamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomorKamarActionPerformed

    private void txtJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulActionPerformed

    private void txtDeskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeskripsiActionPerformed
    String user = txtUsername.getText().trim();
    String kamar = txtNomorKamar.getText().trim();
    String judul = txtJudul.getText().trim();
    
    // Ini kode untuk mengambil isi JTextArea deskripsi keluhan lu
    String deskripsi = txtDeskripsi.getText().trim(); 
    
    String tanggal = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm").format(new java.util.Date());
    String status = "Pending";

    // Validasi kosong
    if (judul.isEmpty() || deskripsi.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, 
                "Subjek/Judul dan Deskripsi komplain tidak boleh kosong!", 
                "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Logika simpan ke file teks
    try {
        java.io.FileWriter fw = new java.io.FileWriter("data_komplain.txt", true);
        java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);

        // Format simpan: Tanggal#Username#NoKamar#Judul#Deskripsi#Status
        String dataKomplain = tanggal + "#" + user + "#" + kamar + "#" + judul + "#" + deskripsi + "#" + status;
        
        bw.write(dataKomplain);
        bw.newLine();
        bw.close();

        javax.swing.JOptionPane.showMessageDialog(this, 
                "Komplain Anda berhasil dikirim!\nAdmin akan segera memeriksa laporan.", 
                "Sukses", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        // Reset inputan setelah kirim
        txtJudul.setText("");
        txtDeskripsi.setText(""); // Menghapus isi JTextArea setelah sukses

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Gagal mengirim komplain: " + e.getMessage());
    }

    }//GEN-LAST:event_txtDeskripsiActionPerformed

    private void btnKomplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomplainActionPerformed
                                         
    String user = txtUsername.getText().trim();
    String kamar = txtNomorKamar.getText().trim();
    String judul = txtJudul.getText().trim();
    String deskripsi = txtDeskripsi.getText().trim(); 
    
    String tanggal = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm").format(new java.util.Date());
    String status = "Pending"; 

    if (judul.isEmpty() || deskripsi.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, 
                "Subjek/Judul dan Deskripsi komplain tidak boleh kosong!", 
                "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        java.io.FileWriter fw = new java.io.FileWriter("data_komplain.txt", true);
        java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);

        String dataKomplain = tanggal + "#" + user + "#" + kamar + "#" + judul + "#" + deskripsi + "#" + status;
        
        bw.write(dataKomplain);
        bw.newLine(); 
        bw.close();   

        javax.swing.JOptionPane.showMessageDialog(this, 
                "Komplain Anda berhasil dikirim!\nAdmin akan segera memeriksa laporan.", 
                "Sukses", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        txtJudul.setText("");
        txtDeskripsi.setText("");

        HomePage halamanHome = new HomePage(user, kamar, "");
        halamanHome.setVisible(true);
        halamanHome.setLocationRelativeTo(null);
        this.dispose();

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, 
                "Gagal menyimpan komplain: " + e.getMessage(), 
                "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_btnKomplainActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
        new FormKomplain("Nama", "Kamar -", "0").setVisible(true); // Kasih parameter dummy
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKomplain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDeskripsi;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtNomorKamar;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
