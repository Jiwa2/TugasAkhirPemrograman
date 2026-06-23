public class PesanKamar extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PesanKamar.class.getName());

    public PesanKamar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblHargaSewaPesan = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTotalBayarPesan = new javax.swing.JLabel();
        btnKonfirmasiBayar = new javax.swing.JButton();
        txtNamaUser = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbPilihKamar = new javax.swing.JComboBox<>();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2026-06-13 at 12.11.56.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kost Nuansa");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot 2026-06-13 101822.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ringkasan Pesanan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga Sewa/bln");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Durasi (1 Bulan)");

        lblHargaSewaPesan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHargaSewaPesan.setForeground(new java.awt.Color(255, 255, 255));
        lblHargaSewaPesan.setText("Rp. 3.500.000");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Biaya Layanan");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rp. 50.000");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("x1");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("-----------------------------------------");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TOTAL PEMBAYARAN");

        lblTotalBayarPesan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotalBayarPesan.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalBayarPesan.setText("Rp.3.550.000");

        btnKonfirmasiBayar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnKonfirmasiBayar.setForeground(new java.awt.Color(0, 102, 102));
        btnKonfirmasiBayar.setText("Konfirmasi & Bayar");
        btnKonfirmasiBayar.addActionListener(this::btnKonfirmasiBayarActionPerformed);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama mu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTotalBayarPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addComponent(btnKonfirmasiBayar, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(147, 147, 147)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHargaSewaPesan)
                            .addComponent(txtNamaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNamaUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHargaSewaPesan)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalBayarPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnKonfirmasiBayar)
                .addGap(58, 58, 58))
        );

        cmbPilihKamar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbPilihKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kamar 1 ", "Kamar 2", "Kamar 3", "Kamar 4" }));
        cmbPilihKamar.addActionListener(this::cmbPilihKamarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbPilihKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPilihKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonfirmasiBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonfirmasiBayarActionPerformed
        String namaUserBaru = txtNamaUser.getText().trim();
        String passwordDefault = "kost123";
        
        if (namaUserBaru.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Nama harus diisi terlebih dahulu!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String kamarDipilih = cmbPilihKamar.getSelectedItem().toString().trim(); // Tambah .trim() biar spasi hilang
        String totalBayar = lblTotalBayarPesan.getText(); 
        String hargaSewa = lblHargaSewaPesan.getText().replace("Rp. ", "").trim(); // Ambil angka harganya saja

        // GABUNGAN NOTIFIKASI
        String pesanNotif = "--- INSTRUKSI PEMBAYARAN ---\n"
                          + "Total yang harus dibayar: " + totalBayar + "\n"
                          + "Silakan transfer ke rekening berikut:\n"
                          + "Bank BCA : 1234-5678-90 a.n PT Kost Mahal Jaya\n\n"
                          + "--------------------------------------------------------\n"
                          + "--- INFORMASI AKUN LOGIN ANDA ---\n"
                          + "Silakan use akun ini untuk masuk setelah transfer:\n"
                          + "User : " + namaUserBaru + "\n"
                          + "Pw   : " + passwordDefault + "\n\n"
                          + "*Catatan: Harap simpan/screenshot username dan password Anda!";
        
        javax.swing.JOptionPane.showMessageDialog(this, pesanNotif, "Konfirmasi & Informasi Akun", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        // Ambil tanggal hari ini secara otomatis untuk data_booking.txt
        String tanggalSekarang = new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm").format(new java.util.Date());
        String statusBayarAwal = "Belum Lunas";
        String statusPenghuniAwal = "Penghuni Baru";

        // Proses simpan ke file text
        try {
            // 1. TETAP SIMPAN KE DATA_LOGIN.TXT (Untuk Hak Akses Login & Profile)
            java.io.FileWriter fwLogin = new java.io.FileWriter("data_login.txt", true); 
            java.io.BufferedWriter bwLogin = new java.io.BufferedWriter(fwLogin);
            
            // Format disesuaikan agar bisa dibaca halaman Login: user,pass,kamar,harga
            bwLogin.write(namaUserBaru + "," + passwordDefault + "," + kamarDipilih + "," + hargaSewa);
            bwLogin.newLine();
            bwLogin.close();
            
            // 2. TAMBAHAN: SIMPAN JUGA KE DATA_BOOKING.TXT (Untuk Tabel Dashboard Admin)
            java.io.FileWriter fwBooking = new java.io.FileWriter("data_booking.txt", true);
            java.io.BufferedWriter bwBooking = new java.io.BufferedWriter(fwBooking);
            
            // Format disesuaikan kolom tabel admin: Nama,Kamar,Tanggal,StatusBayar,StatusPenghuni
            bwBooking.write(namaUserBaru + "," + kamarDipilih + "," + tanggalSekarang + "," + statusBayarAwal + "," + statusPenghuniAwal);
            bwBooking.newLine();
            bwBooking.close();
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Gagal menyimpan data: " + e.getMessage());
        }

        // Pindah ke halaman Login
        Login halamanLogin = new Login();
        halamanLogin.setVisible(true);
        halamanLogin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnKonfirmasiBayarActionPerformed

    private void cmbPilihKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPilihKamarActionPerformed
        String kamarDipilih = cmbPilihKamar.getSelectedItem().toString().trim(); // .trim() mengantisipasi spasi liar di NetBeans
        String hargaBaru = "0";
        String totalBaru = "0";

        if (kamarDipilih.equals("Kamar 1")) {
            hargaBaru = "Rp. 3.500.000";
            totalBaru = "Rp. 3.550.000";
        } else if (kamarDipilih.equals("Kamar 2")) {
            hargaBaru = "Rp. 4.000.000";
            totalBaru = "Rp. 4.050.000";
        } else if (kamarDipilih.equals("Kamar 3")) {
            hargaBaru = "Rp. 4.500.000";
            totalBaru = "Rp. 4.550.000"; // Diperbaiki dari 4.050.000
        } else {
            hargaBaru = "Rp. 2.500.000";
            totalBaru = "Rp. 2.550.000";
        }

        lblHargaSewaPesan.setText(hargaBaru);
        lblTotalBayarPesan.setText(totalBaru);
    
    }//GEN-LAST:event_cmbPilihKamarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PesanKamar().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKonfirmasiBayar;
    private javax.swing.JComboBox<String> cmbPilihKamar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JLabel lblHargaSewaPesan;
    private javax.swing.JLabel lblTotalBayarPesan;
    private javax.swing.JTextField txtNamaUser;
    // End of variables declaration//GEN-END:variables
}
