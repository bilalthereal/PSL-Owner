/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Owner;

import Class.Owner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author MUHAMMED BILAL
 */
public class Add_Owner extends javax.swing.JFrame {

    /**
     * Creates new form Add_Owner
     */
    owner.DatabaseConnectivity objConnectivity;
    private Connection Connection;
    public Add_Owner() {
        initComponents();
        objConnectivity=new owner.DatabaseConnectivity();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adminfname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        adminmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        adminpnumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        admincnic = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        adminnationality = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        adminid = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        admindob = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Owner");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 20, 140, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 240, 45, 22);

        adminfname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(adminfname);
        adminfname.setBounds(370, 230, 260, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mail");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 320, 41, 16);

        adminmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(adminmail);
        adminmail.setBounds(370, 310, 260, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone No");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 390, 80, 22);

        adminpnumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(adminpnumber);
        adminpnumber.setBounds(370, 380, 260, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CNIC");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(280, 470, 41, 16);

        admincnic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(admincnic);
        admincnic.setBounds(370, 450, 260, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date of Birth");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(240, 530, 110, 16);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nationality");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(260, 600, 90, 22);

        adminnationality.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(adminnationality);
        adminnationality.setBounds(370, 590, 260, 40);

        add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/gogreen.png"))); // NOI18N
        add.setText("Add");
        add.setContentAreaFilled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(670, 590, 110, 49);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(280, 160, 19, 22);

        adminid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adminid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminidActionPerformed(evt);
            }
        });
        jPanel1.add(adminid);
        adminid.setBounds(370, 150, 260, 40);

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/icons8-back-arrow-48.png"))); // NOI18N
        back.setText("Back");
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(10, 20, 130, 57);
        jPanel1.add(admindob);
        admindob.setBounds(370, 530, 260, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Background/green_background_3-wallpaper-1920x1080.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1070, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1069, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminidActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Owner_Menu().setVisible(true);
        }
        });
    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        // get data in local variables
        int id=Integer.parseInt(adminid.getText());
        String name=adminfname.getText();
        String mail=adminmail.getText();
        int phoneno=Integer.parseInt(adminpnumber.getText());
        int cnic=Integer.parseInt(admincnic.getText());
         java.util.Date utilStartDate = admindob.getDate();
         java.sql.Date d = new java.sql.Date(utilStartDate.getTime());
        String Nationality=adminnationality.getText();
        
        try{
            //  objConnectivity.getConnection();         //Database class
            Connection=objConnectivity.getConnection();
            Owner o=new Owner(id, name, mail, phoneno, cnic, d, Nationality);
            String query="insert into ownerdb(Owner_id,Name,Mail,Phone_No,Cnic,DOB,Nationality)values(?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = Connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,mail);
            preparedStatement.setInt(4,phoneno);
            preparedStatement.setInt(5,cnic);
            preparedStatement.setDate(6,d);
            preparedStatement.setString(7,Nationality);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(this,"Data Succesfully Added!");
            setClear();
        }catch (Exception e){
            e.printStackTrace();
        }

          
          
          
          
          
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Owner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField admincnic;
    private com.toedter.calendar.JDateChooser admindob;
    private javax.swing.JTextField adminfname;
    private javax.swing.JTextField adminid;
    private javax.swing.JTextField adminmail;
    private javax.swing.JTextField adminnationality;
    private javax.swing.JTextField adminpnumber;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    void setClear(){
        adminid.setText("");
        adminfname.setText("");
        adminmail.setText("");
        adminpnumber.setText("");
        admincnic.setText("");
        admindob.setDateFormatString("");
        adminnationality.setText("");
    }
}
