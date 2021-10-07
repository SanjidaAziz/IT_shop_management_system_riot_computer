
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
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class OwnerInternal extends javax.swing.JInternalFrame {
Connection c;
    public OwnerInternal() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui= (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        try {

           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=RiotComputer;user=b;password=1234");
           position.setEnabled(false);
           search.setEnabled(false);
           spin.setValue(5);
           slider.setMinorTickSpacing(2);  
           slider.setMajorTickSpacing(10);  
           slider.setPaintTicks(true);  
           slider.setPaintLabels(true); 
           slider.setEnabled(false);
           categoryBox.setEnabled(false);
           
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HomeInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTableOwner = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        incrementBy = new javax.swing.JComboBox<>();
        search = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        applyIncrement = new javax.swing.JButton();
        position = new javax.swing.JComboBox<>();
        showAll = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        show2 = new javax.swing.JButton();
        show3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        top = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cBox = new javax.swing.JComboBox<>();
        spin = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        categoryBox = new javax.swing.JComboBox<>();
        slider = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();

        employeeTableOwner.setAutoCreateRowSorter(true);
        employeeTableOwner.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        employeeTableOwner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Position", "Salary", "Last Increment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeTableOwner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        employeeTableOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableOwnerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTableOwner);

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
        jScrollPane2.setViewportView(resultT);

        jLabel1.setText("Salary increment");

        incrementBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Increment Selected", "By Position", "By Branchno", "Most Late Increment", "All employee" }));
        incrementBy.setSelectedIndex(4);
        incrementBy.setToolTipText("");
        incrementBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incrementByActionPerformed(evt);
            }
        });

        jLabel2.setText("Increment percentage");

        applyIncrement.setText("Apply");
        applyIncrement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyIncrementActionPerformed(evt);
            }
        });

        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assistant", "Supervisor", "Assistant Manager", "Manager" }));
        position.setToolTipText("Select position");
        position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionActionPerformed(evt);
            }
        });

        showAll.setText("Show All");
        showAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllActionPerformed(evt);
            }
        });

        jLabel3.setText("Whose salaries are greater than or equal to the highest salary of every position");

        show2.setText("SHOW");
        show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show2ActionPerformed(evt);
            }
        });

        show3.setText("Show");
        show3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show3ActionPerformed(evt);
            }
        });

        jLabel4.setText(" Salary hold by each position of employee");

        top.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topActionPerformed(evt);
            }
        });

        jLabel5.setText("Max");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Show All Items", "Give Discount" }));
        cBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxActionPerformed(evt);
            }
        });

        jLabel6.setText("Show First");

        submit.setText("Apply");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel7.setText("Rows");

        categoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Processor", "Graphics Card", "Display", "Motherboard", "Ram" }));
        categoryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(incrementBy, 0, 170, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(amount))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(search)
                                .addComponent(position, 0, 124, Short.MAX_VALUE)))
                        .addComponent(applyIncrement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(show3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20))
                        .addComponent(show2)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cBox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(incrementBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(applyIncrement)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showAll)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(show2)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(show3)
                                    .addComponent(jLabel4)
                                    .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(categoryBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(slider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(38, 38, 38)
                                .addComponent(submit)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeeTableOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableOwnerMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) employeeTableOwner.getModel();
        int empRowIndex = employeeTableOwner.getSelectedRow();
        String empID= dtm.getValueAt(empRowIndex, 0).toString();
               
        search.setText(empID);

    }//GEN-LAST:event_employeeTableOwnerMouseClicked

    private void resultTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTMouseClicked
        
        DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();   
        int selectedRowIndex = resultT.getSelectedRow(); 
        String productID= dtm.getValueAt(selectedRowIndex, 0).toString();
        
    }//GEN-LAST:event_resultTMouseClicked

    private void applyIncrementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyIncrementActionPerformed
        // TODO add your handling code here:
        
        
        try {    // selectedIndex-->//Increment Selected , By Position,  By Branchno, Most Late Increment

            String all="EmployeeID, (FirstName+' '+ LastName)as Name ,Position, Salary,LastIncrement";     //Increment Selected id , By Position,  By Branchno, Most Late Increment   
            DefaultTableModel dtm = (DefaultTableModel) employeeTableOwner.getModel();  
            dtm.setRowCount(0);
            String query = null;
            String subquery=null;
            int selected = incrementBy.getSelectedIndex();       
            if(selected==0){
                query = "UPDATE employee SET Salary = ROUND(salary + (salary * "+amount.getText()+" / 100),2), LastIncrement= CAST( GETDATE() AS Date ) WHERE employeeID = all(SELECT employeeID  from Employee where employeeID = "+search.getText()+")";
            }
            else if(selected==1) {
                query = "UPDATE employee SET Salary = ROUND(salary + (salary * "+amount.getText()+" / 100),2), LastIncrement= CAST( GETDATE() AS Date ) WHERE position= '"+position.getSelectedItem().toString()+"'";
            }
            else if(selected==2) {
                query = "UPDATE employee SET Salary = ROUND(salary + (salary * "+amount.getText()+" / 100),2), LastIncrement= CAST( GETDATE() AS Date ) WHERE BranchNo="+search.getText();
            }
            else if(selected==3) {
                subquery="SELECT TOP (1) LastIncrement FROM Employee order by LastIncrement";
                query = "UPDATE employee SET Salary = ROUND(salary + (salary *"+amount.getText()+" / 100),2), LastIncrement= CAST( GETDATE() AS Date ) WHERE LastIncrement = all("+subquery+")";
            } // ****
            else if(selected==4) {
                query = "UPDATE employee SET Salary = ROUND(salary + (salary *"+amount.getText()+" / 100),2), LastIncrement= CAST( GETDATE() AS Date )";
            }
          
            Statement stmt = (Statement) c.createStatement();

            stmt.executeUpdate(query);

      
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
        
    }//GEN-LAST:event_applyIncrementActionPerformed

    private void positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionActionPerformed

    private void showAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllActionPerformed
       try {   

            String all="EmployeeID, (FirstName+' '+ LastName)as Name ,Position, Salary,LastIncrement";     //Increment Selected , By Position,  By Branchno, Most Late Increment   
            DefaultTableModel dtm = (DefaultTableModel) employeeTableOwner.getModel();  
            dtm.setRowCount(0);
            String query = null;
                    
            String subquery=null;
            int selected = incrementBy.getSelectedIndex();       
            if(selected==0){query = "SELECT "+all+" from Employee where employeeID = "+search.getText();}
            else if(selected==1) {query = "SELECT "+all+" from Employee WHERE position= '"+position.getSelectedItem().toString()+"'";}
            else if(selected==2) {query = "SELECT "+all+" from Employee WHERE BranchNo="+search.getText();}          
            else if(selected==3) {query="SELECT TOP (1) "+all+" FROM Employee order by LastIncrement";}
            else if(selected==4) {query = "SELECT "+all+" from Employee";}
            
            
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                int id = set.getInt(1);              
                String name = set.getString(2);
                
                String pos = set.getString(3);               
                
                int salary = set.getInt(4);
                String lastInc = set.getString(5);
                
                Object data[] = {id, name,pos,salary,lastInc};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
    }//GEN-LAST:event_showAllActionPerformed

    private void incrementByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incrementByActionPerformed
        // TODO add your handling code here:
        
        int selected = incrementBy.getSelectedIndex();      //Increment Selected , By Position,  By Branchno, Most Late Increment
        if(selected == 0 || selected == 2){
            search.setEnabled(true);           
            position.setEnabled(false);           
        }
        else if(selected == 1)
        {
            search.setEnabled(false);
            position.setEnabled(true);           
        }
        else if(selected == 3){
            search.setEnabled(false);
            position.setEnabled(false);
        }
        else if(selected == 4){
            search.setEnabled(false);
            position.setEnabled(false);
        }
    }//GEN-LAST:event_incrementByActionPerformed

    private void show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show2ActionPerformed
        // TODO add your handling code here:
        try {   

            String all="EmployeeID, (FirstName+' '+ LastName)as Name ,Position, Salary,LastIncrement";     //Increment Selected , By Position,  By Branchno, Most Late Increment   
            DefaultTableModel dtm = (DefaultTableModel) employeeTableOwner.getModel();  
            dtm.setRowCount(0);
            String query = null;
           
            query="SELECT "+all+" FROM employee WHERE salary >= SOME (SELECT MAX(salary) FROM employee GROUP BY Position)order by Salary desc"; 
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                int id = set.getInt(1);              
                String name = set.getString(2);
                
                String pos = set.getString(3);               
                
                int salary = set.getInt(4);
                String lastInc = set.getString(5);
                
                Object data[] = {id, name,pos,salary,lastInc};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
    }//GEN-LAST:event_show2ActionPerformed

    private void show3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show3ActionPerformed
        // TODO add your handling code here:
        try {   

            String all="EmployeeID, (FirstName+' '+ LastName)as Name ,Position, Salary,LastIncrement";     //Increment Selected , By Position,  By Branchno, Most Late Increment   
            DefaultTableModel dtm = (DefaultTableModel) employeeTableOwner.getModel();  
            dtm.setRowCount(0);
            String query = null;
            String t=null;
            t=top.getText();
           if(!t.equals(null)){             
                query="SELECT TOP ("+t+") "+all+" FROM employee WHERE  position ='assistant' union SELECT TOP ("+t+") "+all+" FROM employee WHERE position ='manager'  union SELECT TOP ("+t+") "+all+" FROM employee WHERE  position ='supervisor' union SELECT TOP ("+t+") "+all+" FROM employee WHERE  position ='assistant manager'order by Position ,Salary desc"; 
                PreparedStatement statement = c.prepareStatement(query);
                ResultSet set = statement.executeQuery();

                while (set.next()) {
                    int id = set.getInt(1);              
                    String name = set.getString(2);
                    String pos = set.getString(3);               
                    int salary = set.getInt(4);
                    String lastInc = set.getString(5);

                    Object data[] = {id, name,pos,salary,lastInc};

                    dtm.addRow(data);
                }
           }
 
           else if(t.equals(null)) JOptionPane.showMessageDialog(null, "Enter number of maximum !!!" );
          
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
        
    }//GEN-LAST:event_show3ActionPerformed

    private void topActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            slider.getValue();
            System.out.println(slider.getValue());
            DefaultTableModel dtm = (DefaultTableModel) resultT.getModel();
            dtm.setRowCount(0);
            int selected = cBox.getSelectedIndex();
            String query = null;
            if (selected == 0) {
                query = "SELECT TOP ("+spin.getValue()+") [productId] ,[productName],[category] ,[price] FROM [RiotComputer].[dbo].[Product]";
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
            } else if (selected == 1) {
                query = "Update Product set price = (price - (price*("+slider.getValue()+".0/100.0))) where category = '"+categoryBox.getSelectedItem().toString()+"'";
                PreparedStatement statement = c.prepareStatement(query);
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Successfully Discounted");
            } 
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void categoryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryBoxActionPerformed

    private void cBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxActionPerformed
        int selected = cBox.getSelectedIndex();
        if(selected == 0 ){
           slider.setEnabled(false);
           categoryBox.setEnabled(false);
        }
        else if(selected == 1){
           slider.setEnabled(true);
           categoryBox.setEnabled(true);
        }
    }//GEN-LAST:event_cBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton applyIncrement;
    private javax.swing.JComboBox<String> cBox;
    private javax.swing.JComboBox<String> categoryBox;
    private javax.swing.JTable employeeTableOwner;
    private javax.swing.JComboBox<String> incrementBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JTable resultT;
    private javax.swing.JTextField search;
    private javax.swing.JButton show2;
    private javax.swing.JButton show3;
    private javax.swing.JButton showAll;
    private javax.swing.JSlider slider;
    private javax.swing.JSpinner spin;
    private javax.swing.JButton submit;
    private javax.swing.JTextField top;
    // End of variables declaration//GEN-END:variables
}
