
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win7
 */
public class tablepesanan extends javax.swing.JInternalFrame {

    /**
     * Creates new form tablepesanan
     */
    public tablepesanan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        panel1 = new javax.swing.JPanel();
        txtfilter = new javax.swing.JTextField();
        btnhapus1 = new javax.swing.JButton();
        btntampil1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        txtfilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfilterActionPerformed(evt);
            }
        });
        txtfilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfilterKeyReleased(evt);
            }
        });

        btnhapus1.setBackground(new java.awt.Color(255, 0, 51));
        btnhapus1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnhapus1.setText("HAPUS");
        btnhapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapus1ActionPerformed(evt);
            }
        });

        btntampil1.setBackground(new java.awt.Color(255, 204, 204));
        btntampil1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btntampil1.setText("TAMPIL SEMUA");
        btntampil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntampil1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("CARI");

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(table3);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtfilter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btntampil1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnhapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(732, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfilter, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(btntampil1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu6.setText("BACK");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon("D:\\pemrograman\\cancel-512.png")); // NOI18N
        jMenuItem1.setText("EXIT");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuBar3.add(jMenu6);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfilterActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Nama Pengunjung");
        model.addColumn("Asal");
        model.addColumn("Tujuan");
         model.addColumn("Tanggal");
         model.addColumn("Jumlah Pengunjung");
        model.addColumn("Jam");
        String filter = txtfilter.getText();

        try{

            String sql = ("SELECT * FROM goship2 where tujuan  like '%"+filter+"%'") ;
            java.sql.Connection con = (com.mysql.jdbc.Connection)koneksidb.configDB();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while(res.next()){

                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),
                    res.getString(5), res.getString(6)});

            }

            table3.setModel(model);

        }catch(SQLException e){
            System.out.println("error" + e.getMessage());
        }
    }//GEN-LAST:event_txtfilterActionPerformed

    private void txtfilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfilterKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Nama Pengunjung");
        model.addColumn("Asal");
        model.addColumn("Tujuan");
         model.addColumn("Tanggal");
        model.addColumn("Jam");
        String filter = txtfilter.getText();

        try{

            String sql = ("SELECT * FROM goship2 where tujuan  like '%"+filter+"%'") ;
            java.sql.Connection con = (com.mysql.jdbc.Connection)koneksidb.configDB();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while(res.next()){

                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});

            }

            table3.setModel(model);

        }catch(SQLException e){
            System.out.println("error" + e.getMessage());
        }
    }//GEN-LAST:event_txtfilterKeyReleased

    private void btntampil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntampil1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Nama Pengunjung");
        model.addColumn("Asal");
        model.addColumn("Tujuan");
        model.addColumn("Jumlah Pengunjung");
        model.addColumn("Tanggal");
        model.addColumn("Jam");

        try{

            String sql = "SELECT * FROM goship2" ;
            java.sql.Connection con = (com.mysql.jdbc.Connection)koneksidb.configDB();
            java.sql.Statement stm = con.createStatement();
            
            java.sql.ResultSet res = stm.executeQuery(sql);

            while(res.next()){

                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});

            }

            table3.setModel(model);

        }catch(SQLException e){
            System.out.println("error" + e.getMessage());
        }
    }//GEN-LAST:event_btntampil1ActionPerformed

    private void btnhapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapus1ActionPerformed
        // TODO add your handling code here:
        try{

            String sql = "DELETE FROM goship2 ";
            java.sql.Connection conn = (Connection)koneksidb.configDB();
            java.sql.PreparedStatement Pstm = conn.prepareStatement(sql);
            Pstm.execute();

        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnhapus1ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ADMIN n = new ADMIN();
        n.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhapus1;
    private javax.swing.JButton btntampil1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable table3;
    private javax.swing.JTextField txtfilter;
    // End of variables declaration//GEN-END:variables
}
