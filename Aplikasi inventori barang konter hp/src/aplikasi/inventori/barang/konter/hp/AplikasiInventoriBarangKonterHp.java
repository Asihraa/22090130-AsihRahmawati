import javax.swing.*;

public class AplikasiInventoriBarangKonterHp extends javax.swing.JFrame {

    private JTextField txtNamaBarang;
    private JTextField txtJumlahBarang;
    private JButton btnTambah;

    public AplikasiInventoriBarangKonterHp() {
        initComponents();
    }

    private void initComponents() {
        txtNamaBarang = new JTextField();
        txtJumlahBarang = new JTextField();
        btnTambah = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Inventori Konter HP");

        txtNamaBarang.setToolTipText("Nama Barang");
        txtJumlahBarang.setToolTipText("Jumlah Barang");

        btnTambah.setText("Tambah Barang");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaBarang, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlahBarang, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNamaBarang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtJumlahBarang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTambah)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {
        String namaBarang = txtNamaBarang.getText();
        String jumlahBarang = txtJumlahBarang.getText();
        
        // Tambahkan kode untuk menyimpan barang ke dalam inventori
        // Misalnya, Anda bisa menggunakan basis data SQLite atau struktur data lainnya.
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiInventoriBarangKonterHp().setVisible(true);
            }
        });
    }
}
