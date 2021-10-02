package Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jahid
 */
public class First extends javax.swing.JFrame {

    /**
     * Creates new form First
     */
    public First() {
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

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultT = new javax.swing.JTable();
        allB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        deleteB = new javax.swing.JButton();
        nameT = new javax.swing.JTextField();
        priceT = new javax.swing.JTextField();
        idT = new javax.swing.JTextField();
        updateB = new javax.swing.JButton();
        cat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        searchB = new javax.swing.JButton();
        insertB = new javax.swing.JButton();
        clearB = new javax.swing.JButton();
        searchB2 = new javax.swing.JButton();
        searchB3 = new javax.swing.JButton();
        searchB4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resultT);

        allB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        allB.setText("All Available Products");
        allB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allBActionPerformed(evt);
            }
        });

        deleteB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteB.setText("DELETE");
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });

        nameT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        priceT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        idT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        idT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTActionPerformed(evt);
            }
        });

        updateB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateB.setText("UPDATE");
        updateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBActionPerformed(evt);
            }
        });

        cat.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ram", "Motherboard", "Processor", "Graphics Card" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ID :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Product Name:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Price:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Category:");

        searchB.setText("search");
        searchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBActionPerformed(evt);
            }
        });

        insertB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertB.setText("INSERT");
        insertB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBActionPerformed(evt);
            }
        });

        clearB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearB.setText("CLEAR");
        clearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBActionPerformed(evt);
            }
        });

        searchB2.setText("search");
        searchB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchB2ActionPerformed(evt);
            }
        });

        searchB3.setText("search");
        searchB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchB3ActionPerformed(evt);
            }
        });

        searchB4.setText("search");
        searchB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchB4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameT)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cat, javax.swing.GroupLayout.Alignment.LEADING, 0, 129, Short.MAX_VALUE)
                                        .addComponent(priceT, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(idT, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchB2)
                            .addComponent(searchB)
                            .addComponent(searchB3)
                            .addComponent(searchB4))
                        .addGap(118, 118, 118))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(insertB)
                        .addGap(53, 53, 53)
                        .addComponent(deleteB)
                        .addGap(55, 55, 55)
                        .addComponent(updateB)
                        .addGap(80, 80, 80)
                        .addComponent(clearB)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(searchB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameT, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(searchB2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(priceT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchB3))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(searchB4))
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteB)
                    .addComponent(insertB)
                    .addComponent(updateB)
                    .addComponent(clearB))
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(allB, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTActionPerformed

    private void insertBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBActionPerformed

        try {
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/riotcomp", "root", "");
            Statement stmt = (Statement) c.createStatement();
            String query = "insert into salesman (id,name,price,category) value('" + idT.getText() + "','" + nameT.getText() + "','" + priceT.getText() + "','" + cat.getSelectedItem().toString() + "')";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Successfully Inserted!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!" + ex);
        }
    }//GEN-LAST:event_insertBActionPerformed

    private void searchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();
            dtm.setRowCount(0);
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/riotcomp", "root", "");
            String query = "select * from salesman where id = '" + idT.getText() + "'";
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString("id");
                String price = set.getString("price");
                String name = set.getString("name");
                String cat2 = set.getString("category");

                String data[] = {id, name, cat2, price};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
    }//GEN-LAST:event_searchBActionPerformed

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        try {
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/riotcomp", "root", "");
            Statement stmt = (Statement) c.createStatement();
            String query = "delete from salesman where id = '" + idT.getText() + "'";

            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Deleted Succesfully!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!" + ex);
        }
    }//GEN-LAST:event_deleteBActionPerformed

    private void clearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();
        dtm.setRowCount(0);
        nameT.setText(null);
        priceT.setText(null);
        idT.setText(null);
    }//GEN-LAST:event_clearBActionPerformed

    private void updateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBActionPerformed
        try {
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/riotcomp", "root", "");
            Statement stmt = (Statement) c.createStatement();
            String query = "update salesman set name = '" + nameT.getText() + "',price = '" + priceT.getText() + "', category = '" + cat.getSelectedItem().toString() + "'where id = '" + idT.getText() + "'";

            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Updated Succesfully!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!" + ex);
        }
    }//GEN-LAST:event_updateBActionPerformed

    private void searchB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchB2ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();
            dtm.setRowCount(0);
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/riotcomp", "root", "");
            String query = "select * from salesman where name like '%" + nameT.getText() + "%'";
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString("id");
                String price = set.getString("price");
                String name = set.getString("name");
                String cat2 = set.getString("category");

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
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/riotcomp", "root", "");
            String query = "select * from salesman where price = '" + priceT.getText() + "'";
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString("id");
                String price = set.getString("price");
                String name = set.getString("name");
                String cat2 = set.getString("category");

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
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/riotcomp", "root", "");
            String query = "select * from salesman where category = '" + cat.getSelectedItem().toString() + "'";
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString("id");
                String price = set.getString("price");
                String name = set.getString("name");
                String cat2 = set.getString("category");

                String data[] = {id, name, cat2, price};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
    }//GEN-LAST:event_searchB4ActionPerformed

    private void allBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allBActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();
            dtm.setRowCount(0);
            Class.forName("java.sql.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/riotcomp", "root", "");
            String query = "select * from salesman";
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                String id = set.getString("id");
                String price = set.getString("price");
                String name = set.getString("name");
                String cat2 = set.getString("category");

                String data[] = {id, name, cat2, price};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
    }//GEN-LAST:event_allBActionPerformed

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
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First().setVisible(true);
            }
        });
    }

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
