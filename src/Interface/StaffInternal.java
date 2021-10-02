
package Interface;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class StaffInternal extends javax.swing.JInternalFrame {
Connection c;
    public StaffInternal() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bui= (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
        
        try {

           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=RiotComputer;user=b;password=1234");
            one.setEnabled(false);
            two.setEnabled(false);
            position.setEnabled(false);
            sortBy.setEnabled(false);
            gender.setEnabled(false);
            sortType.setEnabled(false);
           
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HomeInternal.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        criteria = new javax.swing.JComboBox<>();
        position = new javax.swing.JComboBox<>();
        one = new javax.swing.JTextField();
        two = new javax.swing.JTextField();
        sortBy = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        sortType = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1000, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 670));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        employeeTable.setAutoCreateRowSorter(true);
        employeeTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employeet Name", "Gender", "Position", "Age", "Salary", "Branch No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        criteria.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        criteria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Employees", "Salay upper than", "Salay lower than", "Salay range", "Search BY Name", "Search By Id", "Search by Position", "Search by Branch", "Sort BY" }));
        criteria.setToolTipText("Sort By");
        criteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criteriaActionPerformed(evt);
            }
        });

        position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assistant", "Supervisor", "Assistant Manager", "Manager", "All" }));
        position.setToolTipText("Select position");
        position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionActionPerformed(evt);
            }
        });

        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        sortBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EmployeeID", "Name", "Age", "Salary" }));
        sortBy.setToolTipText("");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male/Female", "Male", "Female" }));
        gender.setToolTipText("Select gender");

        sortType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));

        name.setEditable(false);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel1.setText("Employee name:");

        jLabel2.setText("Office Address:");

        jLabel3.setText("Select a row from table to see branch address of the employee");

        address.setEditable(false);
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submit)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(criteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sortBy, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(sortType, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(161, 161, 161))
                                .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(criteria)
                    .addComponent(one)
                    .addComponent(two))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortBy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criteriaActionPerformed

        int selected = criteria.getSelectedIndex();      //All Employees, Salay upper than, Salay lower than, Salay range, Search BY Name, Search By Id, Search by Position,search by branch Sort BY
        if(selected == 0){
            one.setEnabled(false);
            two.setEnabled(false);
            position.setEnabled(false);
            sortBy.setEnabled(false);
            sortType.setEnabled(false);
            gender.setEnabled(false);
        }
        else if(selected == 3)
        {
            one.setEnabled(true);
            two.setEnabled(true);
            gender.setEnabled(false);
            position.setEnabled(false);
            sortBy.setEnabled(false);
            sortType.setEnabled(false);
            
        }
        else if(selected == 2 || selected == 1 || selected == 4 || selected == 5){
            one.setEnabled(true);
            two.setEnabled(false);
            position.setEnabled(false);
            sortBy.setEnabled(false);
            sortType.setEnabled(false);
            gender.setEnabled(false);
        }
        
        else if(selected == 6)
        {
            one.setEnabled(false);
            two.setEnabled(false);
            position.setEnabled(true);
            gender.setEnabled(true);
            sortBy.setEnabled(false);
            sortType.setEnabled(false);
        }
        else if(selected == 7)
        {
            gender.setEnabled(true);
            one.setEnabled(true);
            two.setEnabled(false);
            position.setEnabled(true);
            sortBy.setEnabled(false);
            sortType.setEnabled(false);
        }
        else if(selected == 8)
        {
            gender.setEnabled(true);
            one.setEnabled(false);
            two.setEnabled(false);
            position.setEnabled(false);
            sortBy.setEnabled(true);
            sortType.setEnabled(true);
        } 
        
        else{
            one.setEnabled(false);
            two.setEnabled(false);
            position.setEnabled(false);
            sortBy.setEnabled(false);
            sortType.setEnabled(false);
            gender.setEnabled(false);

        }
    }//GEN-LAST:event_criteriaActionPerformed

    private void positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twoActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        try {    // selectedIndex--> All Employees, Salay upper than, Salay lower than, Salay range, Search BY Name, Search By Id, Search by Position, Search by Branch,Sort BY

            String all="EmployeeID, (FirstName+' '+ LastName)as Name ,Position,Gender, Salary, BranchNo,DATEDIFF(year, DateOfBirth, CONVERT(VARCHAR(10),GETDATE(),111)) AS Age";
            String allj="e.EmployeeID, (e.FirstName+' '+ e.LastName)as Name ,e.Position,e.Gender, e.Salary, e.BranchNo,DATEDIFF(year, e.DateOfBirth, CONVERT(VARCHAR(10),GETDATE(),111)) AS Age";
            DefaultTableModel dtm = (DefaultTableModel) employeeTable.getModel();  
            dtm.setRowCount(0);
            int selected = criteria.getSelectedIndex();
            String query = null;
            if(selected==0){query = "select "+all+" from Employee";}
            else if(selected==1) {query = "select "+all+" from Employee where Salary > "+one.getText();}
            else if(selected==2) {query = "select "+all+" from Employee  where Salary < "+one.getText();}
            else if(selected==3) {query = "select "+all+" from Employee where Salary Between "+one.getText()+" AND "+two.getText();}
            else if(selected==4) {query = "select "+all+" from Employee where FirstName Like '%"+one.getText()+"%' OR LastName Like '%"+one.getText()+"%'";}
            else if(selected==5) {query = "select "+all+" from Employee where EmployeeID = "+one.getText();}
            else if(selected==6){
                if(position.getSelectedItem().toString()=="All") {
                    /*
                    if(gender.getSelectedIndex()==1){
                    query = "SELECT "+all+" from Employee where Gender='M'";
                    }
                    if(gender.getSelectedIndex()==2){
                    query = "SELECT "+all+" from Employee where Gender='F'";
                    }
                    else query = "SELECT "+all+" from Employee";*/
                    JOptionPane.showMessageDialog(null, "All Position cant't be selected here in search by position field !!!");
                }
                else{
                    if(gender.getSelectedIndex()==1){
                     query = "SELECT "+all+" from Employee where position = '"+ position.getSelectedItem().toString()+"' AND Gender='M'";
                    }
                     else if(gender.getSelectedIndex()==2){
                         query = "select "+all+" from Employee where position = '"+ position.getSelectedItem().toString()+"' AND Gender='F'";
                     }
                     else if(gender.getSelectedIndex()==0)
                     {
                         query = "select "+all+" from Employee where position = '"+ position.getSelectedItem().toString()+"'";
                     }
                    
                }
                
             }
            else if(selected==7){
               // query = "SELECT "+allj+" FROM employee e JOIN branch b ON e.BranchNo = b.BranchNo where  (b.Postcode = '"+one.getText()+"') or (b.BranchNo ="+one.getText()+ ") or (b.District ='"+one.getText()+"')";
               // query = "SELECT "+allj+" FROM employee e JOIN branch b ON e.BranchNo = b.BranchNo where ( b.Postcode = '"+one.getText()+"' or b.BranchNo ="+one.getText()+" or b.District = '"+one.getText()+"')";
                if(one.getText().equals(null)){
                     JOptionPane.showMessageDialog(null, "Text field can't be empty !!!");
                }else{
                    if(position.getSelectedItem().toString()=="All"){
                        if(gender.getSelectedIndex()==1){
                            query = "SELECT "+allj+" FROM employee e JOIN branch b ON e.BranchNo = b.BranchNo where e.Gender='M' AND (b.District LIKE '%"+one.getText()+"%' or b.Area LIKE '%"+one.getText()+"%' or b.Postcode = '"+one.getText()+"' or b.BranchNo ="+one.getText()+")";
                        }
                        else if(gender.getSelectedIndex()==2){
                            query = "SELECT "+allj+" FROM employee e JOIN branch b ON e.BranchNo = b.BranchNo where e.Gender='F' AND (b.District LIKE '%"+one.getText()+"%' or b.Area LIKE '%"+one.getText()+"%' or b.Postcode = '"+one.getText()+"' or b.BranchNo ="+one.getText()+")";
                        }
                        else if(gender.getSelectedIndex()==0)
                        {
                            query = "SELECT "+allj+" FROM employee e JOIN branch b ON e.BranchNo = b.BranchNo where b.District LIKE '%"+one.getText()+"%' or b.Area LIKE '%"+one.getText()+"%' or b.Postcode = '"+one.getText()+"' or b.BranchNo ="+one.getText();
                        }
                    }else{
                        if(gender.getSelectedIndex()==1){
                        query = "SELECT "+allj+" FROM employee e JOIN branch b ON e.BranchNo = b.BranchNo where e.position= '"+ position.getSelectedItem().toString()+"' AND e.Gender='M' AND (b.District LIKE '%"+one.getText()+"%' or b.Area LIKE '%"+one.getText()+"%' or b.Postcode = '"+one.getText()+"' or b.BranchNo ="+one.getText()+")";
                        }
                        else if(gender.getSelectedIndex()==2){
                            query = "SELECT "+allj+" FROM employee e JOIN branch b ON e.BranchNo = b.BranchNo where e.position= '"+ position.getSelectedItem().toString()+"' AND e.Gender='F' AND (b.District LIKE '%"+one.getText()+"%' or b.Area LIKE '%"+one.getText()+"%' or b.Postcode = '"+one.getText()+"' or b.BranchNo ="+one.getText()+")";
                        }
                        else if(gender.getSelectedIndex()==0)
                        {
                            query = "SELECT "+allj+" FROM employee e JOIN branch b ON e.BranchNo = b.BranchNo where e.position= '"+ position.getSelectedItem().toString()+"' AND (b.District LIKE '%"+one.getText()+"%' or b.Area LIKE '%"+one.getText()+"%' or b.Postcode = '"+one.getText()+"' or b.BranchNo ="+one.getText()+")";
                        }
                        
                    }
                                       
                 } 
                 
             }
            
            else if(selected==8) {
               
                if(sortType.getSelectedIndex()==0){
                    if(gender.getSelectedIndex()==1){
                        query = "select "+all+" from Employee where gender='M' order by "+(String)sortBy.getSelectedItem();
                    }
                    else if(gender.getSelectedIndex()==2){
                        query = "select "+all+" from Employee where gender='F' order by "+(String)sortBy.getSelectedItem();
                    }
                    else query = "select "+all+" from Employee order by "+(String)sortBy.getSelectedItem();
                }
                else if(sortType.getSelectedIndex()==1){
                    if(gender.getSelectedIndex()==1){
                        query = "select "+all+" from Employee where gender='M' order by "+(String)sortBy.getSelectedItem()+" DESC";
                    }
                    else if(gender.getSelectedIndex()==2){
                        query = "select "+all+" from Employee where gender='F' order by "+(String)sortBy.getSelectedItem()+" DESC";
                    }
                    else query = "select "+all+" from Employee order by "+(String)sortBy.getSelectedItem()+" DESC";
                }
                    
            }
            PreparedStatement statement = c.prepareStatement(query);

            ResultSet set = statement.executeQuery();

            while (set.next()) {
                int id = set.getInt(1);              
                String name = set.getString(2);
                String gen = set.getString(4);
                String pos = set.getString(3);               
                int age = set.getInt(7);
                int salary = set.getInt(5);
                int barnchno = set.getInt(6);
                Object data[] = {id, name,gen,pos, age, salary,barnchno};

                dtm.addRow(data);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }
        
    }//GEN-LAST:event_submitActionPerformed

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) employeeTable.getModel();   
        int selectedRowIndex = employeeTable.getSelectedRow(); 
        String ID= dtm.getValueAt(selectedRowIndex, 0).toString();
        //name.setText(dtm.getValueAt(selectedRowIndex, 1).toString());
        String query = null;
        query= "SELECT (e.FirstName+' '+ e.LastName)as Name , (b.area + ', '+b.District+', '+b.Postcode) as WorkAddress FROM employee e JOIN branch b ON e.BranchNo = b.BranchNo where e.EmployeeID= "+ID;
        
        try {
            PreparedStatement statement = c.prepareStatement(query);
            ResultSet set = statement.executeQuery();
            if(set.next()){
                 name.setText(set.getString(1));
                 address.setText(set.getString(2));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Found !!!" + ex);
        }

                  
  
    }//GEN-LAST:event_employeeTableMouseClicked

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JComboBox<String> criteria;
    private javax.swing.JTable employeeTable;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField one;
    private javax.swing.JComboBox<String> position;
    private javax.swing.JComboBox<String> sortBy;
    private javax.swing.JComboBox<String> sortType;
    private javax.swing.JButton submit;
    private javax.swing.JTextField two;
    // End of variables declaration//GEN-END:variables
}
