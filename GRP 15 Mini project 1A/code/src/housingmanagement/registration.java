/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package housingmanagement;

import java.sql.Connection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author saman
 */
public class registration extends javax.swing.JFrame {

    /**
     * Creates new form registration
     */
    public registration() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        editFirstName = new javax.swing.JTextField();
        editMobileNo = new javax.swing.JTextField();
        editEmail = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        editLastName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        editUsername = new javax.swing.JTextField();
        editPassword = new javax.swing.JPasswordField();
        edtLN = new javax.swing.JLabel();
        edtEA = new javax.swing.JLabel();
        edtUN = new javax.swing.JLabel();
        edtPa = new javax.swing.JLabel();
        edtMoNo = new javax.swing.JLabel();
        edtFN = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(870, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(247, 237, 226));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Great Sejagad", 0, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 66, 45));
        jLabel2.setText("Registration");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 274, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 66, 45));
        jLabel4.setText("Last Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 180, 34));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 66, 45));
        jLabel5.setText("Email Address");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, 180, 34));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 66, 45));
        jLabel7.setText("Mobile No.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 180, 34));

        editFirstName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editFirstName.setForeground(new java.awt.Color(199, 151, 111));
        editFirstName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editFirstName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFirstNameActionPerformed(evt);
            }
        });
        editFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                editFirstNameKeyReleased(evt);
            }
        });
        jPanel2.add(editFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 265, 38));

        editMobileNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editMobileNo.setForeground(new java.awt.Color(199, 151, 111));
        editMobileNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editMobileNo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editMobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMobileNoActionPerformed(evt);
            }
        });
        editMobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                editMobileNoKeyReleased(evt);
            }
        });
        jPanel2.add(editMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 265, 38));

        editEmail.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editEmail.setForeground(new java.awt.Color(199, 151, 111));
        editEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                editEmailKeyReleased(evt);
            }
        });
        jPanel2.add(editEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, 310, 43));

        btnSignUp.setBackground(new java.awt.Color(239, 186, 151));
        btnSignUp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(102, 66, 45));
        btnSignUp.setText("SIGN UP");
        btnSignUp.setBorder(new javax.swing.border.MatteBorder(null));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 236, 42));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 66, 45));
        jLabel8.setText("First name");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 180, 34));

        editLastName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editLastName.setForeground(new java.awt.Color(199, 151, 111));
        editLastName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editLastName.setToolTipText("");
        editLastName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLastNameActionPerformed(evt);
            }
        });
        editLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                editLastNameKeyReleased(evt);
            }
        });
        jPanel2.add(editLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 265, 38));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 66, 45));
        jLabel10.setText("Username");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 180, 34));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 66, 45));
        jLabel11.setText("Password");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, 180, 34));

        editUsername.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editUsername.setForeground(new java.awt.Color(199, 151, 111));
        editUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editUsername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUsernameActionPerformed(evt);
            }
        });
        editUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                editUsernameKeyReleased(evt);
            }
        });
        jPanel2.add(editUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 265, 38));

        editPassword.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        editPassword.setForeground(new java.awt.Color(199, 151, 111));
        editPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                editPasswordKeyReleased(evt);
            }
        });
        jPanel2.add(editPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 270, 40));

        edtLN.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(edtLN, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 160, 260, 20));

        edtEA.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(edtEA, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 260, 20));

        edtUN.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(edtUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 260, 20));

        edtPa.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(edtPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 260, 20));

        edtMoNo.setForeground(new java.awt.Color(255, 0, 0));
        edtMoNo.setText(" ");
        jPanel2.add(edtMoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 260, 20));

        edtFN.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(edtFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 260, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1560, 700));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/housingmanagement/output-onlinepngtools (2).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 1183, 148));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editFirstNameActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
         if(editFirstName.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Name is Mandatory!");
        
       else if(editLastName.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Name is Mandatory!");
        else if(editUsername.getText().equals(""))
             JOptionPane.showMessageDialog(null, "Username is Mandatory!");
        else if(editPassword.getText().equals(""))
             JOptionPane.showMessageDialog(null, "Password is Mandatory!");   
        else if(editMobileNo.getText().equals(""))
             JOptionPane.showMessageDialog(null, "Mobile_No is Mandatory!");   
        else if(editEmail.getText().equals(""))
             JOptionPane.showMessageDialog(null, "Email_Address is Mandatory!");
        else
           {  
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/seds","root","123456")) {
                String sql="insert into register() values (?,?,?,?,?,?)";
                java.sql.PreparedStatement pst=con.prepareStatement(sql);
                pst.setString(1, editFirstName.getText());
                pst.setString(2, editLastName.getText());
                pst.setString(3, editUsername.getText());
                pst.setString(4, editPassword.getText());
                pst.setString(5, editMobileNo.getText());
                pst.setString(6, editEmail.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Updated Successfully");
                dispose();
                HomePage1 hpage =new HomePage1();
                hpage.show();
            }
            
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        }
      
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void editUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUsernameActionPerformed
        // TODO add your handling code here:
         Pattern p=Pattern.compile("^[a-zA-Z0-9]{0,30}[@._#*$]{0,30}[a-zA-Z0-9]{0,30}$");
       Matcher m=p.matcher(editUsername.getText());
       if(!m.matches())
       {
           edtUN.setText("Invalid USERNAME");
       }
       else{
           edtUN.setText(null);
       }
       
        
    }//GEN-LAST:event_editUsernameActionPerformed

    private void editLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLastNameActionPerformed
        // TODO add your handling code here: 
        Pattern p=Pattern.compile("^[a-zA-Z0-9]{0,30}[@._#*$]{0,30}[a-zA-Z0-9]{0,30}$");
       Matcher m=p.matcher(editLastName.getText());
       if(!m.matches())
       {
           edtLN.setText("Invalid LASTNAME");
       }
       else{
           edtLN.setText(null);
       }
       
    }//GEN-LAST:event_editLastNameActionPerformed

    private void editFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editFirstNameKeyReleased
        // TODO add your handling code here:
        Pattern p=Pattern.compile("^[a-zA-Z]{0,30}$");
       Matcher m=p.matcher(editFirstName.getText());
       if(!m.matches())
       {
           edtFN.setText("Invalid Name");
       }
       else{
           edtFN.setText(null);
       }
    }//GEN-LAST:event_editFirstNameKeyReleased

    private void editPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editPasswordKeyReleased
        // TODO add your handling code here:
      Pattern p=Pattern.compile("^[a-zA-Z0-9]{0,30}[@,.,_,$,#]{0,30}[a-zA-Z0-9]{0,30}$");
       Matcher m=p.matcher(editPassword.getText());
       if(!m.matches())
       {
           edtPa.setText("Invalid Password");
       }
       else{
           edtPa.setText(null);
       }
    }//GEN-LAST:event_editPasswordKeyReleased

    private void editEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editEmailKeyReleased
      // TODO add your handling code here:
         Pattern p=Pattern.compile("^[a-zA-Z0-9]{0,30}[@][gmail]{0,30}[.][com]{0,30}$");
       Matcher m=p.matcher(editEmail.getText());
       if(!m.matches())
       {
           edtEA.setText("Invalid Email_Address");
       }
       else{
           edtEA.setText(null);
       }
      
    }//GEN-LAST:event_editEmailKeyReleased

    private void editMobileNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editMobileNoKeyReleased
        // TODO add your handling code here:
        Pattern p=Pattern.compile("^[7-9][0-9]{9}$");
       Matcher m=p.matcher(editMobileNo.getText());
       if(!m.matches())
       {
           edtMoNo.setText("Invalid Mobile no.");
       }
       else{
           edtMoNo.setText(null);
       }
    }//GEN-LAST:event_editMobileNoKeyReleased

    private void editUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editUsernameKeyReleased
        // TODO add your handling code here:
         Pattern p=Pattern.compile("^[a-zA-Z0-9]{0,30}[@._#*$]{0,30}[a-zA-Z0-9]{0,30}$");
       Matcher m=p.matcher(editUsername.getText());
       if(!m.matches())
       {
           edtUN.setText("Invalid Username");
       }
       else{
           edtUN.setText(null);
       }
    }//GEN-LAST:event_editUsernameKeyReleased

    private void editLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editLastNameKeyReleased
        // TODO add your handling code here:
         Pattern p=Pattern.compile("^[a-zA-Z]{0,30}$");
       Matcher m=p.matcher(editLastName.getText());
       if(!m.matches())
       {
           edtLN.setText("Invalid Name");
       }
       else{
           edtLN.setText(null);
       }
    }//GEN-LAST:event_editLastNameKeyReleased

    private void editMobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editMobileNoActionPerformed

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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JTextField editEmail;
    private javax.swing.JTextField editFirstName;
    private javax.swing.JTextField editLastName;
    private javax.swing.JTextField editMobileNo;
    private javax.swing.JPasswordField editPassword;
    private javax.swing.JTextField editUsername;
    private javax.swing.JLabel edtEA;
    private javax.swing.JLabel edtFN;
    private javax.swing.JLabel edtLN;
    private javax.swing.JLabel edtMoNo;
    private javax.swing.JLabel edtPa;
    private javax.swing.JLabel edtUN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
