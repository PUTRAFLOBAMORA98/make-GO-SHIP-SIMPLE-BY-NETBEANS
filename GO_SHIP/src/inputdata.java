
import java.sql.SQLException;
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
public class inputdata extends javax.swing.JInternalFrame {

    /**
     * Creates new form inputdata
     */
    public inputdata() {
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

        dekstop1 = new javax.swing.JDesktopPane();
        txtnama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        txtnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnamaKeyReleased(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MASUKAN NAMA ANDA");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        dekstop1.setLayer(txtnama, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dekstop1Layout = new javax.swing.GroupLayout(dekstop1);
        dekstop1.setLayout(dekstop1Layout);
        dekstop1Layout.setHorizontalGroup(
            dekstop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dekstop1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dekstop1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dekstop1Layout.setVerticalGroup(
            dekstop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dekstop1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(dekstop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(459, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dekstop1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dekstop1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Nama Pengunjung");
        model.addColumn("Asal");
        model.addColumn("Tujuan");
         model.addColumn("Tanggal");
        model.addColumn("Jam");
        String nama = txtnama.getText();

        try{

            String sql = ("SELECT * FROM goship2 where nama_pengunjung like '%"+nama+"%'") ;
            java.sql.Connection con = (com.mysql.jdbc.Connection)koneksidb.configDB();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while(res.next()){

                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),
                    res.getString(5)});

            }

            table.setModel(model);

        }catch(SQLException e){
            System.out.println("error" + e.getMessage());
        }
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtnamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamaKeyReleased
        // TODO add your handling code here:
         DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Nama Pengunjung");
        model.addColumn("Asal");
        model.addColumn("Tujuan");
         model.addColumn("Tanggal");
        model.addColumn("Jam");
        String nama = txtnama.getText();

        try{

            String sql = ("SELECT * FROM goship2 where nama_pengunjung like '%"+nama+"%'") ;
            java.sql.Connection con = (com.mysql.jdbc.Connection)koneksidb.configDB();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while(res.next()){

                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),
                    res.getString(5)});

            }

            table.setModel(model);

        }catch(SQLException e){
            System.out.println("error" + e.getMessage());
        }
    }//GEN-LAST:event_txtnamaKeyReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
         int baris = table.rowAtPoint(evt.getPoint());
        if(baris>-1){
              String nama = table.getValueAt(baris, 0).toString();
           makanan order = new makanan();
             order.setVisible(true);
              this.setVisible(false);
               String asal = table.getValueAt(baris, 1).toString();
                String tujuan = table.getValueAt(baris, 2).toString();
        }
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dekstop1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
