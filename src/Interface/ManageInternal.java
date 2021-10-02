package Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ManageInternal extends javax.swing.JInternalFrame {

    public ManageInternal() {
        initComponents();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        resultT = new javax.swing.JTable();
        allB = new javax.swing.JButton();
        idT = new javax.swing.JTextField();
        nameT = new javax.swing.JTextField();
        priceT = new javax.swing.JTextField();
        cat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        insertB = new javax.swing.JButton();
        deleteB = new javax.swing.JButton();
        updateB = new javax.swing.JButton();
        clearB = new javax.swing.JButton();
        searchB = new javax.swing.JButton();
        searchB2 = new javax.swing.JButton();
        searchB3 = new javax.swing.JButton();
        searchB4 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultT.setAutoCreateRowSorter(true);
        resultT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(resultT);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 490, -1));

        allB.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        allB.setText("All Available Products");
        allB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allBActionPerformed(evt);
            }
        });
        getContentPane().add(allB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 210, 80));

        idT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        idT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTActionPerformed(evt);
            }
        });
        getContentPane().add(idT, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 160, -1));

        nameT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(nameT, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 160, -1));

        priceT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        priceT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTActionPerformed(evt);
            }
        });
        getContentPane().add(priceT, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 160, -1));

        cat.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ram", "Motherboard", "Processor", "Graphics Card", "Storage", "Display" }));
        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });
        getContentPane().add(cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ID :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 40, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Product Name:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 110, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Price:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 50, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Category:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 80, -1));

        insertB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertB.setForeground(new java.awt.Color(51, 102, 255));
        insertB.setText("INSERT");
        insertB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBActionPerformed(evt);
            }
        });
        getContentPane().add(insertB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 100, 30));

        deleteB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteB.setForeground(new java.awt.Color(204, 0, 51));
        deleteB.setText("DELETE");
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });
        getContentPane().add(deleteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 90, 30));

        updateB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateB.setForeground(new java.awt.Color(0, 204, 0));
        updateB.setText("UPDATE");
        updateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBActionPerformed(evt);
            }
        });
        getContentPane().add(updateB, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 90, 30));

        clearB.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        clearB.setText("CLEAR");
        clearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBActionPerformed(evt);
            }
        });
        getContentPane().add(clearB, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 110, 40));

        searchB.setText("search");
        searchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBActionPerformed(evt);
            }
        });
        getContentPane().add(searchB, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, -1, 28));

        searchB2.setText("search");
        searchB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchB2ActionPerformed(evt);
            }
        });
        getContentPane().add(searchB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 230, -1, -1));

        searchB3.setText("search");
        searchB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchB3ActionPerformed(evt);
            }
        });
        getContentPane().add(searchB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, -1, -1));

        searchB4.setText("search");
        searchB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchB4ActionPerformed(evt);
            }
        });
        getContentPane().add(searchB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void allBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allBActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();
            dtm.setRowCount(0);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=RiotComputer;user=b;password=1234");
            String query = "select * from product";
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString(1);
                String price = set.getString(4);
                String name = set.getString(2);
                String cat2 = set.getString(3);

                String data[] = {id, name, cat2, price};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
    }//GEN-LAST:event_allBActionPerformed

    private void idTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTActionPerformed

    private void priceTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTActionPerformed

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catActionPerformed

    private void insertBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBActionPerformed

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=RiotComputer;user=b;password=1234");
            Statement stmt = (Statement) c.createStatement();
            String query = "insert into Product values( '" + nameT.getText() + "','" + cat.getSelectedItem().toString() + "'," + priceT.getText() + ")";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Successfully Inserted!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!" + ex);
        }
    }//GEN-LAST:event_insertBActionPerformed

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=RiotComputer;user=b;password=1234");
            Statement stmt = (Statement) c.createStatement();
            String query = "delete from Product where productId = '" + idT.getText() + "'";

            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Deleted Succesfully!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!" + ex);
        }
    }//GEN-LAST:event_deleteBActionPerformed

    private void updateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=RiotComputer;user=b;password=1234");
            Statement stmt = (Statement) c.createStatement();
            String query = "update product set productName = '" + nameT.getText() + "',price = '" + priceT.getText() + "', category = '" + cat.getSelectedItem().toString() + "'where productId = '" + idT.getText() + "'";

            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Updated Succesfully!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!" + ex);
        }
    }//GEN-LAST:event_updateBActionPerformed

    private void clearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();
        dtm.setRowCount(0);
        nameT.setText(null);
        priceT.setText(null);
        idT.setText(null);
    }//GEN-LAST:event_clearBActionPerformed

    private void searchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();
            dtm.setRowCount(0);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=RiotComputer;user=b;password=1234");
            String query = "select * from Product where productId = " + idT.getText();
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString(1);
                String price = set.getString(4);
                String name = set.getString(2);
                String cat2 = set.getString(3);

                String data[] = {id, name, cat2, price};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
    }//GEN-LAST:event_searchBActionPerformed

    private void searchB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchB2ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();
            dtm.setRowCount(0);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=RiotComputer;user=b;password=1234");
            String query = "select * from Product where productName like '%" + nameT.getText() + "%'";
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString(1);
                String price = set.getString(4);
                String name = set.getString(2);
                String cat2 = set.getString(3);

                String data[] = {id, name, cat2, price};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
    }//GEN-LAST:event_searchB2ActionPerformed

    private void searchB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchB3ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();
            dtm.setRowCount(0);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=RiotComputer;user=b;password=1234");
            String query = "select * from Product where price = " + priceT.getText();
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString(1);
                String price = set.getString(4);
                String name = set.getString(2);
                String cat2 = set.getString(3);

                String data[] = {id, name, cat2, price};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
    }//GEN-LAST:event_searchB3ActionPerformed

    private void searchB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchB4ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();
            dtm.setRowCount(0);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=RiotComputer;user=b;password=1234");
            String query = "select * from Product where category = '" + cat.getSelectedItem().toString() + "'";
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString(1);
                String price = set.getString(4);
                String name = set.getString(2);
                String cat2 = set.getString(3);

                String data[] = {id, name, cat2, price};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
    }//GEN-LAST:event_searchB4ActionPerformed

    private void resultTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTMouseClicked
        DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();
        int row = resultT.getSelectedRow();
        idT.setText(resultT.getModel().getValueAt(row, 0).toString());
        nameT.setText(resultT.getModel().getValueAt(row, 1).toString());
        priceT.setText(resultT.getModel().getValueAt(row, 3).toString());
        cat.setSelectedItem(resultT.getModel().getValueAt(row, 2).toString());
    }//GEN-LAST:event_resultTMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allB;
    private javax.swing.JComboBox<String> cat;
    private javax.swing.JButton clearB;
    private javax.swing.JButton deleteB;
    private javax.swing.JTextField idT;
    private javax.swing.JButton insertB;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameT;
    private javax.swing.JTextField priceT;
    private javax.swing.JTable resultT;
    private javax.swing.JButton searchB;
    private javax.swing.JButton searchB2;
    private javax.swing.JButton searchB3;
    private javax.swing.JButton searchB4;
    private javax.swing.JButton updateB;
    // End of variables declaration//GEN-END:variables
}
