
package Interface;

import java.awt.Color;
import javax.swing.JOptionPane;


public class Home extends javax.swing.JFrame {

    boolean logedin;
   
    public Home(boolean logedin, String username){
        initComponents();
        varStaff.setVisible(true);
        varBranch.setVisible(true);
        varManage.setVisible(true); 
        mainPanel.removeAll();
        HomeInternal hi= new HomeInternal();
        mainPanel.add(hi).setVisible(true);    
        login_logout.setText("Logout");
        varIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logout-48.png")));
        usernamePanel.setVisible(true);
        varLogedUsername.setText(username);
    }
    
    public Home() {
        initComponents();
        varStaff.setVisible(false);  ///later edit false 
        
        varManage.setVisible(false);
        usernamePanel.setVisible(false);
        mainPanel.removeAll();
        HomeInternal hi= new HomeInternal();
        mainPanel.add(hi).setVisible(true);
             
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        varLogin = new javax.swing.JPanel();
        varIconLogin = new javax.swing.JLabel();
        login_logout = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        usernamePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        varLogedUsername = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        varHomeInternal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        varManage = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        varBranch = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        varStaff = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        varLogin.setBackground(new java.awt.Color(153, 0, 0));
        varLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                varLoginMouseClicked(evt);
            }
        });

        varIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login-48.png"))); // NOI18N

        login_logout.setBackground(new java.awt.Color(89, 4, 4));
        login_logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login_logout.setForeground(new java.awt.Color(240, 240, 240));
        login_logout.setText("Login");
        login_logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout varLoginLayout = new javax.swing.GroupLayout(varLogin);
        varLogin.setLayout(varLoginLayout);
        varLoginLayout.setHorizontalGroup(
            varLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, varLoginLayout.createSequentialGroup()
                .addComponent(login_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varIconLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        varLoginLayout.setVerticalGroup(
            varLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, varLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(varLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varIconLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel8.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("RIOT Computers");

        usernamePanel.setBackground(new java.awt.Color(153, 0, 0));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/manager-48.png"))); // NOI18N

        varLogedUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        varLogedUsername.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout usernamePanelLayout = new javax.swing.GroupLayout(usernamePanel);
        usernamePanel.setLayout(usernamePanelLayout);
        usernamePanelLayout.setHorizontalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(varLogedUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        usernamePanelLayout.setVerticalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(varLogedUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(varLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(varLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 80));

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));

        varHomeInternal.setBackground(new java.awt.Color(89, 4, 4));
        varHomeInternal.setPreferredSize(new java.awt.Dimension(200, 40));
        varHomeInternal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                varHomeInternalMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Home");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home-5-32.png"))); // NOI18N

        javax.swing.GroupLayout varHomeInternalLayout = new javax.swing.GroupLayout(varHomeInternal);
        varHomeInternal.setLayout(varHomeInternalLayout);
        varHomeInternalLayout.setHorizontalGroup(
            varHomeInternalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varHomeInternalLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        varHomeInternalLayout.setVerticalGroup(
            varHomeInternalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, varHomeInternalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(varHomeInternalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
        );

        varManage.setBackground(new java.awt.Color(89, 4, 4));
        varManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                varManageMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit-32.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Manage");

        javax.swing.GroupLayout varManageLayout = new javax.swing.GroupLayout(varManage);
        varManage.setLayout(varManageLayout);
        varManageLayout.setHorizontalGroup(
            varManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varManageLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        varManageLayout.setVerticalGroup(
            varManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, varManageLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(varManageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
        );

        varBranch.setBackground(new java.awt.Color(89, 4, 4));
        varBranch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                varBranchMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Branch");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/worldwide-location-32.png"))); // NOI18N

        javax.swing.GroupLayout varBranchLayout = new javax.swing.GroupLayout(varBranch);
        varBranch.setLayout(varBranchLayout);
        varBranchLayout.setHorizontalGroup(
            varBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, varBranchLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
        );
        varBranchLayout.setVerticalGroup(
            varBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, varBranchLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(varBranchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        varStaff.setBackground(new java.awt.Color(89, 4, 4));
        varStaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        varStaff.setForeground(new java.awt.Color(240, 240, 240));
        varStaff.setText("Employee");
        varStaff.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(89, 4, 4), 3, true));
        varStaff.setOpaque(false);
        varStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varStaffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(varStaff, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varHomeInternal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(varManage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(varBranch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(varHomeInternal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varManage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(487, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 670));

        mainPanel.setBackground(new java.awt.Color(235, 228, 228));

        jLabel9.setText("Home main");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(453, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        jPanel1.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 1000, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void varLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varLoginMouseClicked
       
        
        
    }//GEN-LAST:event_varLoginMouseClicked

    private void varManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varManageMouseClicked
      
        mainPanel.removeAll();
        ManageInternal mi= new ManageInternal();
        mainPanel.add(mi).setVisible(true);
    }//GEN-LAST:event_varManageMouseClicked

    private void varHomeInternalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varHomeInternalMouseClicked
        // TODO add your handling code here:
        
        mainPanel.removeAll();
       HomeInternal hi= new HomeInternal();
        mainPanel.add(hi).setVisible(true); 
    }//GEN-LAST:event_varHomeInternalMouseClicked

    private void varBranchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_varBranchMouseClicked
       mainPanel.removeAll();
       BranchInternal bi= new BranchInternal();
       mainPanel.add(bi).setVisible(true);
    }//GEN-LAST:event_varBranchMouseClicked

    private void varStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varStaffActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
       StaffInternal si= new StaffInternal();
       mainPanel.add(si).setVisible(true);
    }//GEN-LAST:event_varStaffActionPerformed

    private void login_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_logoutActionPerformed
        // TODO add your handling code here:
        if(login_logout.getText().equals("Logout")){
            int response= JOptionPane.showConfirmDialog(this,"Are you sure You Want to Logout?", "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION){
                Home h= new Home();
                this.dispose();
                h.setVisible(true); 
            }
                        
        }
        if(login_logout.getText().equals("Login")){
            Login login=new Login(this);
            login.setVisible(true);
        }
    }//GEN-LAST:event_login_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton login_logout;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel usernamePanel;
    private javax.swing.JPanel varBranch;
    private javax.swing.JPanel varHomeInternal;
    private javax.swing.JLabel varIconLogin;
    private javax.swing.JLabel varLogedUsername;
    private javax.swing.JPanel varLogin;
    private javax.swing.JPanel varManage;
    private javax.swing.JButton varStaff;
    // End of variables declaration//GEN-END:variables
}
