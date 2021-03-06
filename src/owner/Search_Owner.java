/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Owner;

import Class.Owner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author MUHAMMED BILAL
 */
public class Search_Owner extends javax.swing.JFrame {

    /**
     * Creates new form Search_Owner
     */
    owner.DatabaseConnectivity objConnectivity;
    private Connection Connection;
    public Search_Owner() {
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
        jLabel2 = new javax.swing.JLabel();
        option = new javax.swing.JComboBox<>();
        search = new javax.swing.JTextField();
        ownersearch = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Admin");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(390, 30, 140, 40);

        option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option", "ID", "Name" }));
        jPanel1.add(option);
        option.setBounds(350, 120, 240, 40);

        search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(310, 190, 330, 50);

        ownersearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Icon/icons8-search-client-48.png"))); // NOI18N
        ownersearch.setContentAreaFilled(false);
        ownersearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownersearchActionPerformed(evt);
            }
        });
        jPanel1.add(ownersearch);
        ownersearch.setBounds(410, 270, 110, 50);

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSL Background/green_background_3-wallpaper-1920x1080.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 990, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner_Menu().setVisible(true);
            }
        });
    }//GEN-LAST:event_backActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
  
    }//GEN-LAST:event_searchActionPerformed

    private void ownersearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownersearchActionPerformed
        if(option.getSelectedItem()=="Option"){
            JOptionPane.showMessageDialog(this, "Select Only One Menu Please!");
        }
        else if(option.getSelectedItem().equals("ID")){
            int id=Integer.parseInt(search.getText());
            try{
                Connection=objConnectivity.getConnection();
                 PreparedStatement preparedStatement =Connection.prepareStatement("select * from ownerdb where Owner_Id = ?");
                 preparedStatement.setInt(1, id);
                 ResultSet objResultSet = preparedStatement.executeQuery();
                 if (objResultSet != null && objResultSet.next()) {
                Owner o= new Owner(objResultSet.getInt(1) , objResultSet.getString(2) , objResultSet.getString(3) , objResultSet.getInt(4) , objResultSet.getInt(5) , objResultSet.getDate(6) , objResultSet.getString(7));
                 JOptionPane.showMessageDialog(this, o.toString());
                 setClear();
                }else{
                     JOptionPane.showMessageDialog(this,"Not Found in the Database");
                 }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(option.getSelectedItem().equals("Name")){
            String name=search.getText();
            try{
                Connection=objConnectivity.getConnection();
                 PreparedStatement preparedStatement =Connection.prepareStatement("select * from ownerdb where Name=?");
                 preparedStatement.setString(1,name);
                 ResultSet objResultSet = preparedStatement.executeQuery();
                 if (objResultSet != null && objResultSet.next()) {
                Owner o= new Owner(objResultSet.getInt(1) , objResultSet.getString(2) , objResultSet.getString(3) , objResultSet.getInt(4) , objResultSet.getInt(5) , objResultSet.getDate(6) , objResultSet.getString(7));
                 JOptionPane.showMessageDialog(this, o.toString());
                 setClear();
                }else{
                     JOptionPane.showMessageDialog(this,"Not Found in the Database");
                 }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ownersearchActionPerformed

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
            java.util.logging.Logger.getLogger(Search_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Owner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> option;
    private javax.swing.JButton ownersearch;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
    void setClear(){
        search.setText("");
    }
}
