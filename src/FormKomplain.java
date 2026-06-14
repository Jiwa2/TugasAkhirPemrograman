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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
        new FormKomplain("Nama", "Kamar -", "0").setVisible(true); // Kasih parameter dummy
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
