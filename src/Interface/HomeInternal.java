package Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class HomeInternal extends javax.swing.JInternalFrame {

    Connection c;

    public HomeInternal() {
        initComponents();
        //one.setVisible(false);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=RiotComputer;user=b;password=1234");
            one.setEnabled(false);
            two.setEnabled(false);
            categoryBox.setEnabled(false);
            sortBox.setEnabled(false);
            sortButton.setEnabled(false);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HomeInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        one = new javax.swing.JTextField();
        cBox = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultT = new javax.swing.JTable();
        two = new javax.swing.JTextField();
        categoryBox = new javax.swing.JComboBox<>();
        sortBox = new javax.swing.JComboBox<>();
        sortButton = new javax.swing.JToggleButton();

        setPreferredSize(new java.awt.Dimension(1000, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        getContentPane().add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 16, 118, -1));

        cBox.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        cBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Products", "Price upper than", "Price lower than", "Price range", "Search BY Name", "Search By id", "Search by category", "Sort BY" }));
        cBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxActionPerformed(evt);
            }
        });
        getContentPane().add(cBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 13, -1, -1));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(883, 136, -1, -1));

        resultT.setAutoCreateRowSorter(true);
        resultT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        resultT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(resultT);
        if (resultT.getColumnModel().getColumnCount() > 0) {
            resultT.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 201, -1, -1));

        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        getContentPane().add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 16, 112, -1));

        categoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Processor", "Graphics Card", "Display", "Motherboard", "Ram" }));
        categoryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryBoxActionPerformed(evt);
            }
        });
        getContentPane().add(categoryBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 56, 154, 31));

        sortBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ProductId", "ProductName", "Category", "Price" }));
        getContentPane().add(sortBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 60, 118, -1));

        sortButton.setText("Asscending");
        sortButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sortButtonMouseClicked(evt);
            }
        });
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sortButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxActionPerformed

        int selected = cBox.getSelectedIndex();
        if (selected == 0) {
            one.setEnabled(false);
            two.setEnabled(false);
            categoryBox.setEnabled(false);
            sortBox.setEnabled(false);
            sortButton.setEnabled(false);
        } else if (selected == 2 || selected == 1 || selected == 4 || selected == 5) {
            one.setEnabled(true);
            two.setEnabled(false);
            categoryBox.setEnabled(false);
            sortBox.setEnabled(false);
            sortButton.setEnabled(false);
        } else if (selected == 3) {

            categoryBox.setEnabled(false);
            sortBox.setEnabled(false);
            sortButton.setEnabled(false);
            one.setEnabled(true);
            two.setEnabled(true);
        } else if (selected == 6) {
            one.setEnabled(false);
            two.setEnabled(false);
            categoryBox.setEnabled(true);
            sortBox.setEnabled(false);
            sortButton.setEnabled(false);
        } else if (selected == 7) {
            one.setEnabled(false);
            two.setEnabled(false);
            categoryBox.setEnabled(false);
            sortBox.setEnabled(true);
            sortButton.setEnabled(true);
        }
    }//GEN-LAST:event_cBoxActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {

            DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();
            dtm.setRowCount(0);
            int selected = cBox.getSelectedIndex();
            String query = null;
            if (selected == 0) {
                query = "select * from product";
            } else if (selected == 1) {
                query = "select * from product where price > " + one.getText();
            } else if (selected == 2) {
                query = "select * from product where price < " + one.getText();
            } else if (selected == 3) {
                query = "select * from product where price > " + one.getText() + " AND price < " + two.getText();
            } else if (selected == 4) {
                query = "select * from product where productName Like '%" + one.getText() + "%'";
            } else if (selected == 5) {
                query = "select * from product where productid = " + one.getText();
            } else if (selected == 6) {
                query = "select * from product where category = '" + categoryBox.getSelectedItem().toString() + "'";
            } else if (selected == 7) {
                if (sortButton.getText().equals("Asscending")) {
                    query = "select * from product order by " + (String) sortBox.getSelectedItem();
                } else {
                    query = "select * from product order by " + (String) sortBox.getSelectedItem() + " DESC";
                }
            }
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                int id = set.getInt(1);
                int price = set.getInt(4);
                String name = set.getString(2);
                String cat2 = set.getString(3);

                Object data[] = {id, name, cat2, price};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }


    }//GEN-LAST:event_submitActionPerformed

    private void categoryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryBoxActionPerformed

    private void sortButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortButtonMouseClicked

        sortButton.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent event) {
            if (sortButton.isSelected()){
                sortButton.setText("Descending");
            } else {
                sortButton.setText("Asscending");
            }
        }
    });
    }//GEN-LAST:event_sortButtonMouseClicked

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twoActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oneActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cBox;
    private javax.swing.JComboBox<String> categoryBox;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField one;
    private javax.swing.JTable resultT;
    private javax.swing.JComboBox<String> sortBox;
    private javax.swing.JToggleButton sortButton;
    private javax.swing.JButton submit;
    private javax.swing.JTextField two;
    // End of variables declaration//GEN-END:variables
}
