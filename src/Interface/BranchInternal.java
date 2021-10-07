
package Interface;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class BranchInternal extends javax.swing.JInternalFrame {
    Connection c;
    String query,query2;
    int track;
    public BranchInternal() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui= (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=RiotComputer;user=b;password=1234");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HomeInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        builderTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tqp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mp = new javax.swing.JTextField();
        mxp = new javax.swing.JTextField();
        st = new javax.swing.JLabel();
        stPrice = new javax.swing.JLabel();
        ram = new javax.swing.JLabel();
        gpu = new javax.swing.JLabel();
        chooseStorage = new javax.swing.JButton();
        mb = new javax.swing.JLabel();
        chooseProcessor1 = new javax.swing.JButton();
        chooseRam = new javax.swing.JButton();
        chooseGPU = new javax.swing.JButton();
        chooseMB = new javax.swing.JButton();
        Processor = new javax.swing.JLabel();
        total2 = new javax.swing.JLabel();
        ramPrice = new javax.swing.JLabel();
        gpuPrice = new javax.swing.JLabel();
        mbPrice = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cpuPrice = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        ra = new javax.swing.JLabel();
        pa = new javax.swing.JLabel();
        sa = new javax.swing.JLabel();
        ma = new javax.swing.JLabel();
        ga = new javax.swing.JLabel();
        budget = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        builderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        builderTable.getTableHeader().setReorderingAllowed(false);
        builderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                builderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(builderTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Total");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Quantity");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Price");

        tqp.setEditable(false);
        tqp.setBackground(new java.awt.Color(0, 0, 0));
        tqp.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        tqp.setForeground(new java.awt.Color(255, 255, 255));
        tqp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tqpActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Min Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Max Price");

        mp.setBackground(new java.awt.Color(0, 0, 0));
        mp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mp.setForeground(new java.awt.Color(255, 255, 255));

        mxp.setBackground(new java.awt.Color(0, 0, 0));
        mxp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mxp.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tqp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mxp, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tqp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addComponent(mxp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 270));

        st.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        st.setText("5) Select a Storage");
        getContentPane().add(st, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 420, 30));

        stPrice.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        stPrice.setText("0");
        getContentPane().add(stPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 210, 30));

        ram.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        ram.setText("2) Select a Ram");
        getContentPane().add(ram, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 410, 30));

        gpu.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        gpu.setText("3) Select a Graphics Card");
        getContentPane().add(gpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 420, 30));

        chooseStorage.setText("Choose");
        chooseStorage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseStorageActionPerformed(evt);
            }
        });
        getContentPane().add(chooseStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, -1));

        mb.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        mb.setText("4) Select a MotherBoard");
        getContentPane().add(mb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 420, 30));

        chooseProcessor1.setText("Choose");
        chooseProcessor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseProcessor1ActionPerformed(evt);
            }
        });
        getContentPane().add(chooseProcessor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        chooseRam.setText("Choose");
        chooseRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseRamActionPerformed(evt);
            }
        });
        getContentPane().add(chooseRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        chooseGPU.setText("Choose");
        chooseGPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseGPUActionPerformed(evt);
            }
        });
        getContentPane().add(chooseGPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        chooseMB.setText("Choose");
        chooseMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseMBActionPerformed(evt);
            }
        });
        getContentPane().add(chooseMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        Processor.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        Processor.setText("1) Select a Processor");
        getContentPane().add(Processor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 420, 30));

        total2.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        total2.setText("Total :");
        getContentPane().add(total2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 100, 30));

        ramPrice.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        ramPrice.setText("0");
        getContentPane().add(ramPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 210, 30));

        gpuPrice.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        gpuPrice.setText("0");
        getContentPane().add(gpuPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 210, 30));

        mbPrice.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        mbPrice.setText("0");
        getContentPane().add(mbPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 210, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 290, -1));

        cpuPrice.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        cpuPrice.setText("0");
        getContentPane().add(cpuPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 210, 30));

        total.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        total.setForeground(new java.awt.Color(0, 153, 102));
        total.setText("0 /-");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 210, 30));

        ra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ra.setText("Available :");
        getContentPane().add(ra, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, 120, 30));

        pa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pa.setText("Available :");
        getContentPane().add(pa, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, 120, 30));

        sa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sa.setText("Available :");
        getContentPane().add(sa, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 450, 120, 30));

        ma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ma.setText("Available :");
        getContentPane().add(ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 120, 30));

        ga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ga.setText("Available :");
        getContentPane().add(ga, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 120, 30));

        budget.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        budget.setText("100000");
        getContentPane().add(budget, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Budget :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseProcessor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseProcessor1ActionPerformed
        try {
            track = 1;
            DefaultTableModel dtm = (DefaultTableModel) builderTable.getModel();
            dtm.setRowCount(0);
            query = "select * from product where category = 'processor'";
            query2 = "select COUNT(*) as total, SUM(price) as total2, Min(price) as minimum, Max(price) as maximum from product where category = 'processor'";
            PreparedStatement statement = c.prepareStatement(query);
            
            ResultSet set = statement.executeQuery();

            while (set.next()) {
                int id = set.getInt(1);
                int price = set.getInt(4);
                String name = set.getString(2);

                Object data[] = {id, name, price};

                dtm.addRow(data);
            }
            statement = c.prepareStatement(query2);
            set = statement.executeQuery();
            if(set.next()){
                pa.setText("Available: "+set.getString(1)+" unit");
                tqp.setText(set.getString(2));
                mp.setText(set.getString(3));
                mxp.setText(set.getString(4));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BranchInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_chooseProcessor1ActionPerformed

    private void chooseGPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseGPUActionPerformed
        try {
            track = 3;
            DefaultTableModel dtm = (DefaultTableModel) builderTable.getModel();
            dtm.setRowCount(0);
            query = "select * from product where category = 'Graphics Card'";
            query2 = "select COUNT(*) as total, SUM(price) as total2, Min(price) as minimum, Max(price) as maximum from product where category = 'Graphics Card'";
            PreparedStatement statement = c.prepareStatement(query);
            
            ResultSet set = statement.executeQuery();

            while (set.next()) {
                int id = set.getInt(1);
                int price = set.getInt(4);
                String name = set.getString(2);

                Object data[] = {id, name, price};

                dtm.addRow(data);
            }
            statement = c.prepareStatement(query2);
            set = statement.executeQuery();
            if(set.next()){
                ga.setText("Available: "+set.getString(1)+" unit");
                tqp.setText(set.getString(2));
                mp.setText(set.getString(3));
                mxp.setText(set.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BranchInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_chooseGPUActionPerformed

    private void builderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_builderTableMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) builderTable.getModel();
        int row = builderTable.getSelectedRow();
        if(track==1) {
            Processor.setText(track+") "+builderTable.getModel().getValueAt(row, 1).toString());
            cpuPrice.setText(builderTable.getModel().getValueAt(row, 2).toString());
        }
        else if(track==2) {
            ram.setText(track+") "+builderTable.getModel().getValueAt(row, 1).toString());
            ramPrice.setText(builderTable.getModel().getValueAt(row, 2).toString());
        }
        else if(track==3) {
            gpu.setText(track+") "+builderTable.getModel().getValueAt(row, 1).toString());
            gpuPrice.setText(builderTable.getModel().getValueAt(row, 2).toString());
        }
        else if(track==4) {
            mb.setText(track+") "+builderTable.getModel().getValueAt(row, 1).toString());
            mbPrice.setText(builderTable.getModel().getValueAt(row, 2).toString());
        }
        else if(track==5) {
            st.setText(track+") "+builderTable.getModel().getValueAt(row, 1).toString());
            stPrice.setText(builderTable.getModel().getValueAt(row, 2).toString());
        }
        int totalPrice = Integer.parseInt(cpuPrice.getText())+Integer.parseInt(ramPrice.getText())+Integer.parseInt(gpuPrice.getText())+Integer.parseInt(mbPrice.getText())+Integer.parseInt(stPrice.getText());
        total.setText(totalPrice+" /-");
        if(totalPrice > Integer.parseInt(budget.getText())){
            total.setForeground(Color.red);
        }
        else {
            total.setForeground(Color.BLUE);
        }
    }//GEN-LAST:event_builderTableMouseClicked

    private void chooseRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseRamActionPerformed
        try {
            track = 2;
            DefaultTableModel dtm = (DefaultTableModel) builderTable.getModel();
            dtm.setRowCount(0);
            query = "select * from product where category = 'ram'";
            query2 = "select COUNT(*) as total, SUM(price) as total2, Min(price) as minimum, Max(price) as maximum from product where category = 'ram'";
            PreparedStatement statement = c.prepareStatement(query);
            
            ResultSet set = statement.executeQuery();

            while (set.next()) {
                int id = set.getInt(1);
                int price = set.getInt(4);
                String name = set.getString(2);

                Object data[] = {id, name, price};

                dtm.addRow(data);
            }
            statement = c.prepareStatement(query2);
            set = statement.executeQuery();
            if(set.next()){
                ra.setText("Available: "+set.getString(1)+" unit");
                tqp.setText(set.getString(2));
                mp.setText(set.getString(3));
                mxp.setText(set.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BranchInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_chooseRamActionPerformed

    private void chooseMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseMBActionPerformed
        try {
            track = 4;
            DefaultTableModel dtm = (DefaultTableModel) builderTable.getModel();
            dtm.setRowCount(0);
            query = "select * from product where category = 'MotherBoard'";
            query2 = "select COUNT(*) as total, SUM(price) as total2, Min(price) as minimum, Max(price) as maximum from product where category = 'MotherBoard'";
            PreparedStatement statement = c.prepareStatement(query);
            
            ResultSet set = statement.executeQuery();

            while (set.next()) {
                int id = set.getInt(1);
                int price = set.getInt(4);
                String name = set.getString(2);

                Object data[] = {id, name, price};

                dtm.addRow(data);
            }
            statement = c.prepareStatement(query2);
            set = statement.executeQuery();
            if(set.next()){
                ma.setText("Available: "+set.getString(1)+" unit");
                tqp.setText(set.getString(2));
                mp.setText(set.getString(3));
                mxp.setText(set.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BranchInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_chooseMBActionPerformed

    private void chooseStorageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseStorageActionPerformed
        try {
            track = 5;
            DefaultTableModel dtm = (DefaultTableModel) builderTable.getModel();
            dtm.setRowCount(0);
            query = "select * from product where category = 'storage'";
            query2 = "select COUNT(*) as total, SUM(price) as total2, Min(price) as minimum, Max(price) as maximum from product where category = 'storage'";
            PreparedStatement statement = c.prepareStatement(query);
            
            ResultSet set = statement.executeQuery();

            while (set.next()) {
                int id = set.getInt(1);
                int price = set.getInt(4);
                String name = set.getString(2);

                Object data[] = {id, name, price};

                dtm.addRow(data);
            }
            statement = c.prepareStatement(query2);
            set = statement.executeQuery();
            if(set.next()){
                sa.setText("Available: "+set.getString(1)+" unit");
                tqp.setText(set.getString(2));
                mp.setText(set.getString(3));
                mxp.setText(set.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BranchInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_chooseStorageActionPerformed

    private void tqpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tqpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tqpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Processor;
    private javax.swing.JTextField budget;
    private javax.swing.JTable builderTable;
    private javax.swing.JButton chooseGPU;
    private javax.swing.JButton chooseMB;
    private javax.swing.JButton chooseProcessor1;
    private javax.swing.JButton chooseRam;
    private javax.swing.JButton chooseStorage;
    private javax.swing.JLabel cpuPrice;
    private javax.swing.JLabel ga;
    private javax.swing.JLabel gpu;
    private javax.swing.JLabel gpuPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel ma;
    private javax.swing.JLabel mb;
    private javax.swing.JLabel mbPrice;
    private javax.swing.JTextField mp;
    private javax.swing.JTextField mxp;
    private javax.swing.JLabel pa;
    private javax.swing.JLabel ra;
    private javax.swing.JLabel ram;
    private javax.swing.JLabel ramPrice;
    private javax.swing.JLabel sa;
    private javax.swing.JLabel st;
    private javax.swing.JLabel stPrice;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total2;
    private javax.swing.JTextField tqp;
    // End of variables declaration//GEN-END:variables
}
