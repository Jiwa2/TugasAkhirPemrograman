public class FormBayar extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormBayar.class.getName());

    String namaUser, nomorKamar, hargaKamarAsli;

    public FormBayar(String nama, String kamar, String harga) {
        initComponents();
        this.namaUser = nama;
        this.nomorKamar = kamar;
        this.hargaKamarAsli = harga;

        txtNamaPenghuni.setText(namaUser);
        txtNomorKamar.setText(nomorKamar);
        txtNamaPenghuni.setEditable(false);
        txtNomorKamar.setEditable(false);

        lblHargaBayar.setText(hargaKamarAsli);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnKomplain = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNamaPenghuni = new javax.swing.JTextField();
        txtNomorKamar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbPilihanBayar = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnBayarSekarang = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblHargaBayar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kost Nuansa");

        jLabel2.setText("-----------------------------");

        btnDashboard.setText("Dashboard");
        btnDashboard.addActionListener(this::btnDashboardActionPerformed);

        btnKomplain.setText("Komplain Fasilitas");
        btnKomplain.addActionListener(this::btnKomplainActionPerformed);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot 2026-06-13 101822.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKomplain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDashboard)
                .addGap(18, 18, 18)
                .addComponent(btnKomplain)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("FORMULIR PEMBAYARAN KOST DAN IURAN");

        jLabel5.setText("Detail Pembayaran");

        txtNamaPenghuni.addActionListener(this::txtNamaPenghuniActionPerformed);

        txtNomorKamar.addActionListener(this::txtNomorKamarActionPerformed);

        jLabel6.setText("Nama Penghuni");

        jLabel7.setText("Nomor Kamar");

        cmbPilihanBayar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bayar Kamar", "Bayar iuran" }));
        cmbPilihanBayar.setToolTipText("");
        cmbPilihanBayar.addActionListener(this::cmbPilihanBayarActionPerformed);

        jLabel8.setText("Pilihan Bayar");

        btnBayarSekarang.setBackground(new java.awt.Color(153, 255, 153));
        btnBayarSekarang.setText("Bayar Sekarang");
        btnBayarSekarang.addActionListener(this::btnBayarSekarangActionPerformed);

        jLabel10.setText("Harga");

        lblHargaBayar.setText("harga bayar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBayarSekarang)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(145, 145, 145)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNomorKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamaPenghuni, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbPilihanBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHargaBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaPenghuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNomorKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbPilihanBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(lblHargaBayar))
                .addGap(27, 27, 27)
                .addComponent(btnBayarSekarang)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBayarSekarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarSekarangActionPerformed
        try {
    String jenisBayar = cmbPilihanBayar.getSelectedItem().toString();
    String totalBayar = lblHargaBayar.getText();
    
    java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String tanggalSkarang = java.time.LocalDate.now().format(dtf);
    
    // 1. TETAP TULIS KE RIWAYAT TRANSAKSI USER
    String barisRiwayat = namaUser + "," + jenisBayar + "," + totalBayar + "," + tanggalSkarang + "\n";
    java.io.FileWriter fw = new java.io.FileWriter("riwayat_transaksi.txt", true);
    fw.write(barisRiwayat);
    fw.close();
    
    // 2. PROSES UPDATE STATUS DI DATA_BOOKING.TXT JADI "Lunas" UNTUK DASHBOARD ADMIN
    java.io.File fileBooking = new java.io.File("data_booking.txt");
    java.util.ArrayList<String> semuaBarisBooking = new java.util.ArrayList<>();
    
    if (fileBooking.exists()) {
        // Baca semua data lama terlebih dahulu
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(fileBooking));
        String baris;
        while ((baris = reader.readLine()) != null) {
            String[] data = baris.split(",");
            // Jika baris data tersebut milik user yang sedang bayar ini, dan statusnya masih "Belum Lunas"
            if (data.length == 5 && data[0].equals(namaUser) && data[3].equalsIgnoreCase("Belum Lunas")) {
                data[3] = "Lunas"; // Ubah status pembayarannya menjadi Lunas
                baris = String.join(",", data); // Gabungkan kembali datanya memakai koma
            }
            semuaBarisBooking.add(baris);
        }
        reader.close();
        
        // Tulis ulang semua data yang sudah di-update kembali ke file data_booking.txt
        java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(fileBooking, false)); // false = timpa file lama
        for (String barisBaru : semuaBarisBooking) {
            writer.write(barisBaru);
            writer.newLine();
        }
        writer.close();
    }
    
    // 3. TAMPILKAN NOTIFIKASI SUKSES
    String pesanNotif = "=== FORMULIR PEMBAYARAN ===\n\n"
                      + "Silahkan transfer pembayaran ke:\n"
                      + "Bank BCA: 1234567890 a/n Pemilik Kost Mahal\n"
                      + "Nominal: " + totalBayar + "\n\n"
                      + "Pembayaran Anda berhasil dicatat dan status di Dashboard Admin otomatis berubah menjadi LUNAS.";
                      
    javax.swing.JOptionPane.showMessageDialog(this, pesanNotif);
    
    // Kembali ke HomePage
    HomePage halamanHome = new HomePage(namaUser, nomorKamar, hargaKamarAsli);
    halamanHome.setVisible(true);
    halamanHome.setLocationRelativeTo(null);
    this.dispose();

} catch (Exception e) {
    javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
}
    }//GEN-LAST:event_btnBayarSekarangActionPerformed

    private void txtNomorKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomorKamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomorKamarActionPerformed

    private void txtNamaPenghuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPenghuniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaPenghuniActionPerformed

    private void btnKomplainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomplainActionPerformed

    String nama = txtNamaPenghuni.getText(); 
    String kamar = txtNomorKamar.getText();
    String harga = "0"; 


    FormKomplain halamanKomplain = new FormKomplain(nama, kamar, harga);
    halamanKomplain.setVisible(true);
    halamanKomplain.setLocationRelativeTo(null);

    this.dispose();
    }//GEN-LAST:event_btnKomplainActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        HomePage halamanHome = new HomePage(namaUser, nomorKamar, hargaKamarAsli);
        halamanHome.setVisible(true);
        halamanHome.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void cmbPilihanBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPilihanBayarActionPerformed
        String jenisBayar = cmbPilihanBayar.getSelectedItem().toString();

        if (jenisBayar.equals("Bayar Kamar")) {
            lblHargaBayar.setText(hargaKamarAsli);
        } else if (jenisBayar.equals("Bayar iuran")) { // Ubah jadi 'i' kecil sesuai isi model combobox
            lblHargaBayar.setText("Rp. 20.000");
        }
    
    }//GEN-LAST:event_cmbPilihanBayarActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            // Berikan nilai dummy ("") agar main method tidak error
            new FormBayar("", "", "").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayarSekarang;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnKomplain;
    private javax.swing.JComboBox<String> cmbPilihanBayar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHargaBayar;
    private javax.swing.JTextField txtNamaPenghuni;
    private javax.swing.JTextField txtNomorKamar;
    // End of variables declaration//GEN-END:variables
}
