
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
public class Beranda extends javax.swing.JFrame {
public String dateChooser;
    /**
     * Creates new form Beranda
     */
    public Beranda() {
        initComponents();
        jam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dekstop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        txtnama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtasal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbtujuan = new javax.swing.JComboBox<>();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jmlpengunjung = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        pesanmkn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NAMA PENGUNJUNG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ASAL");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("TUJUAN");

        cbtujuan.setBackground(new java.awt.Color(204, 204, 0));
        cbtujuan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbtujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TRIP 3D2N", "=Pulau Komodo", "=Pink Beach+Snorkling", "=Taka Makasar", "=Pulau Padar+Snorkling", "=Pulau Kelor", "TRIP 4D3N", "=Pulau Rinca", "=Pulau Komodo", "=Pulau Kelor", "=Pulau Padar+Snorkling", "=Pink Beach+Snorkling", "=Pulau Kalong", "TRIP 5D4N", "=Pulau Rinca", "=Pulau Padar+snorkling", "=Pulau Kalong", "=Pink Beach+Snorkling", "=Pulau Kalong", " ", " " }));
        cbtujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtujuanActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("JUMLAH PENGUNJUNG");

        jmlpengunjung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlpengunjungActionPerformed(evt);
            }
        });
        jmlpengunjung.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jmlpengunjungKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbtujuan, 0, 191, Short.MAX_VALUE)
                    .addComponent(txtasal)
                    .addComponent(txtnama)
                    .addComponent(jmlpengunjung))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtasal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbtujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmlpengunjung, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        tabel.setBackground(new java.awt.Color(153, 255, 255));
        tabel.setForeground(new java.awt.Color(51, 51, 51));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jPanel6.setBackground(new java.awt.Color(51, 51, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABLE KETERANGAN KAPAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(table2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CETAK TIKET", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane2.setViewportView(textarea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GO-SHIP LABUAN BAJO");

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Logopit_1574971329845.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        dekstop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dekstop.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dekstopLayout = new javax.swing.GroupLayout(dekstop);
        dekstop.setLayout(dekstopLayout);
        dekstopLayout.setHorizontalGroup(
            dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dekstopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dekstopLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dekstopLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dekstopLayout.setVerticalGroup(
            dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dekstopLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dekstopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(dekstopLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jMenu2.setForeground(new java.awt.Color(0, 0, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon("D:\\pemrograman\\Logopit_1575482471541.png")); // NOI18N
        jMenu2.setText("MENU");

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon("D:\\pemrograman\\Logopit_1575621597506.png")); // NOI18N
        jMenuItem1.setText("LOGIN");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        pesanmkn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pesanmkn.setIcon(new javax.swing.ImageIcon("C:\\Users\\win7\\Documents\\Logopit_1576024638386.png")); // NOI18N
        pesanmkn.setText("ORDER MAKANAN");
        pesanmkn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanmknActionPerformed(evt);
            }
        });
        jMenu2.add(pesanmkn);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dekstop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dekstop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       LOGIN tampil= new LOGIN();
        dekstop.add(tampil);
        tampil.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cbtujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtujuanActionPerformed
        // TODO add your handling code here:
        if(cbtujuan.getSelectedItem().toString().equals("TRIP 3D2N")){
           
            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Nomor Kapal");
            model.addColumn("Nama Kapal");
            model.addColumn("Nama Kapten");
            model.addColumn("Tujuan");
            model.addColumn("Harga");
            model.addColumn("Fasilitas");
            model.addColumn("BoBot Kapal");
            model.addColumn("Keterangan");

            String tujuan = cbtujuan.getSelectedItem().toString();
            try{

                String sql = ("select * from goship Where tujuan like '%"+tujuan+"%'");

                java.sql.Connection con = (com.mysql.jdbc.Connection)koneksidb.configDB();
                java.sql.Statement stm = con.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),
                        res.getString(6),res.getString(7),res.getString(8)});

                }

                tabel.setModel(model);

            }catch(SQLException e){
                System.out.println("error" + e.getMessage());

            }
        }
        else if(cbtujuan.getSelectedItem().toString().equals("TRIP 4D3N")){
            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Nomor Kapal");
            model.addColumn("Nama Kapal");
            model.addColumn("Nama Kapten");
            model.addColumn("Tujuan");
            model.addColumn("Harga");
            model.addColumn("Fasilitas");
            model.addColumn("BoBot Kapal");
            model.addColumn("Keterangan");

            String tujuan = cbtujuan.getSelectedItem().toString();
            try{

                String sql = ("select * from goship Where tujuan like '%"+tujuan+"%'");

                java.sql.Connection con = (com.mysql.jdbc.Connection)koneksidb.configDB();
                java.sql.Statement stm = con.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),
                        res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8)});

                }

                tabel.setModel(model);

            }catch(SQLException e){
                System.out.println("error" + e.getMessage());

            }
        }
        else if(cbtujuan.getSelectedItem().toString().equals("TRIP 5D4N")){
            DefaultTableModel model = new DefaultTableModel();

            model.addColumn("Nomor Kapal");
            model.addColumn("Nama Kapal");
            model.addColumn("Nama Kapten");
            model.addColumn("Tujuan");
            model.addColumn("Harga");
            model.addColumn("Fasilitas");
            model.addColumn("BoBot Kapal");
            model.addColumn("Keterangan");

            String tujuan = cbtujuan.getSelectedItem().toString();
            try{

                String sql = ("select * from goship Where tujuan like '%"+tujuan+"%'");

                java.sql.Connection con = (com.mysql.jdbc.Connection)koneksidb.configDB();
                java.sql.Statement stm = con.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);

                while(res.next()){
                    model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),
                        res.getString(5),res.getString(6),res.getString(7),res.getString(8)});

                }

                tabel.setModel(model);

            }catch(SQLException e){
                System.out.println("error" + e.getMessage());

            }
        }
       
    }//GEN-LAST:event_cbtujuanActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        try{

            int baris = tabel.rowAtPoint(evt.getPoint());
             if(baris>-1){
                  String nmr_kapal = tabel.getValueAt(baris, 0).toString();
                   if(txtnama.getText().equals("")){
        JOptionPane.showMessageDialog(null, "NAMA ANDA KOSONG","Kesalahan",JOptionPane.ERROR_MESSAGE);
        return;
        }
        else{
        txtnama.setText(txtnama.getText());
        }
                   if(txtasal.getText().equals("")){
        JOptionPane.showMessageDialog(null, "ALAMAT ANDA KOSONG.!","Kesalahan",JOptionPane.ERROR_MESSAGE);
        return;
        }
        else{
        txtasal.setText(txtasal.getText());
        }
                    if(jmlpengunjung.getText().equals("")){
        JOptionPane.showMessageDialog(null, "ANDA HARUS MENGISI JUMLAH PENGUNJUNG.!","Kesalahan",JOptionPane.ERROR_MESSAGE);
        return;
        }
        else{
        jmlpengunjung.setText(jmlpengunjung.getText());
        }
                   
            int answer= JOptionPane.showConfirmDialog(null, "Pemesanan Kapal sukses.","Konfirmasi",JOptionPane.OK_OPTION);
            if(answer==JOptionPane.OK_OPTION){
                try {

                    String sql = "INSERT INTO goship2 VALUES ('" + txtnama.getText()+"' , '" + txtasal.getText()+"' , '" + cbtujuan.getSelectedItem()+"' , '"+
                            jmlpengunjung.getText()+"','"+label1.getText()+"','"+
                            label2.getText()+","+ "')";
                    java.sql.Connection conn = (Connection)koneksidb.configDB();
                    java.sql.PreparedStatement p= conn.prepareStatement(sql);
                    
                    //  ResultSet rs = st.executeQuery(sql);

                    p.execute();
                   jam();

                    // TODO add your handling code here:

                } catch(HeadlessException | SQLException e){
                    System.out.println("error"+e.getMessage());

                }

              

                String nama_kapal= tabel.getValueAt(baris, 1).toString();

                String nama_kapten= tabel.getValueAt(baris, 2).toString();

                String tujuan = tabel.getValueAt(baris, 3).toString();
                
                   
                DefaultTableModel model = new DefaultTableModel();

                model.addColumn("Nomor Kapal");
                model.addColumn("Nama Kapal");
                model.addColumn("Nama Kapten");
                model.addColumn("Tujuan");
                model.addColumn("Harga");
                model.addColumn("Fasilitas");
                model.addColumn("BoBot Kapal");
                model.addColumn("Keterangan");
                
                String nama_kpl= tabel.getValueAt(baris, 1).toString();
                try{

                    String sql = ("select * from goship3 Where nama_kapal like '%"+nama_kpl+"%'");
                    java.sql.Connection con = (com.mysql.jdbc.Connection)koneksidb.configDB();
                    java.sql.Statement stm = con.createStatement();
                    java.sql.ResultSet res = stm.executeQuery(sql);

                    try{

                        sql = "DELETE  FROM goship Where nama_kapal like '%"+nama_kpl+"%'";
                        java.sql.Connection conn = (Connection)koneksidb.configDB();
                        java.sql.PreparedStatement Pstm = conn.prepareStatement(sql);
                        Pstm.execute();
                        JOptionPane.showMessageDialog(null, "SELAMAT MENIKMATI KEINDAHAN LABUAN BAJO"+"\n"
                        +"KAPAL AKAN MENJEMPUT ANDA DI PELABUHAN");

                    }catch (HeadlessException | SQLException e){
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }

                    while(res.next()){
                        model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),
                            res.getString(7),res.getString(8)});

                    }

                    table2.setModel(model);

                }catch(SQLException e){
                    System.out.println("error" + e.getMessage());

                }
             String harga = tabel.getValueAt(baris, 4).toString();
            
                textarea.setText("\t\t "+"Bukti pemesanan GOSHIP Labuan Bajo"+"\n\t\t"
                    + "---------------------------------------------------------------------"+
                    "\n\t"+"Nama Pengunjung :"+txtnama.getText()+"\n\t"+"ASAL :"+txtasal.getText()+"\n\t"+"Tujuan :"+cbtujuan.getSelectedItem()+"\n\t"+"Jumlah Pengunjung :"+jmlpengunjung.getText()+
                    "\n"+"Memesan Kapal :"+"\n"+"Nomor Kapal :"+nmr_kapal+"\n"+"Nama Kapal :"+nama_kapal+"\n"+"Nama Kapten :"+nama_kapten+"\n"+"Tujuan :"+tujuan+"\n"+"Harga :"+harga+"\n"+"Pada Tanggal"
                        +label1.getText()+"\n"
                );
                 String fasilitas = tabel.getValueAt(baris, 5).toString();
                  String pengunjung  = tabel.getValueAt(baris, 6).toString();
                   String Keterangan = tabel.getValueAt(baris, 7).toString();
            }
            }
        }catch(Exception e){
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void pesanmknActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanmknActionPerformed
        // TODO add your handling code here:
       inputdata input= new inputdata();
        dekstop.add(input);
        input.setVisible(true);
        
    }//GEN-LAST:event_pesanmknActionPerformed

    private void jmlpengunjungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlpengunjungActionPerformed
        // TODO add your handling code here:ry
       
       
               
      int jumlah =Integer.parseInt(jmlpengunjung.getText());
        
        if(jumlah >= 40){
                      
            int answer= JOptionPane.showConfirmDialog(null, "Bobot Kapal Hanya sampai 30 orang."+"\n\n"+"Ganti Jumlah.?"+"Konfirmasi"+JOptionPane.OK_OPTION);
            if(answer==JOptionPane.OK_OPTION){
            jmlpengunjung.setText("");
            }
          
                
        }
       
    }//GEN-LAST:event_jmlpengunjungActionPerformed

    private void jmlpengunjungKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmlpengunjungKeyReleased
        // TODO add your handling code here:
        int jumlah = Integer.parseInt(jmlpengunjung.getText());
        
        if(jumlah >= 40){
            JOptionPane.showMessageDialog(null, "Bobot Kapal Hanya Sampai 30org");
        }
       
         
    }//GEN-LAST:event_jmlpengunjungKeyReleased

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtnamaActionPerformed

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
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beranda().setVisible(true);
            }
        });
    }
          public void jam(){
        new Thread(){
        public void run(){
            while (true){
            Calendar kal= new GregorianCalendar();
            int tahun = kal.get(Calendar.YEAR);
             int bulan = kal.get(Calendar.MONTH);
             int hari = kal.get(Calendar.DAY_OF_MONTH);
             int jam = kal.get(Calendar.HOUR_OF_DAY);
             int menit = kal.get(Calendar.MINUTE);
             int detik = kal.get(Calendar.SECOND);
            String tanggal = hari+"_"+(bulan+1)+"_"+tahun;
            String waktu1= jam+":"+menit+":"+detik;
            String waktu2 = jam+" _ "+menit+" - "+detik;
            label1.setText(tanggal);
            label2.setText(waktu1);
           
            }
        }
                }.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbtujuan;
    private javax.swing.JDesktopPane dekstop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jmlpengunjung;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JMenuItem pesanmkn;
    private javax.swing.JTable tabel;
    private javax.swing.JTable table2;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextField txtasal;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}