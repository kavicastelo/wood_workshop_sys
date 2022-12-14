/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Marketing;

import Marketing.cost;
import Marketing.additem;
import Marketing.edit;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import woodworkshop.login;

/**
 *
 * @author KAVI
 */
public class marketing extends javax.swing.JFrame {

    /**
     * Creates new form marketing
     */
    public marketing() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(100, 100, (int) dim.getWidth(), (int) dim.getHeight());
        setLocationRelativeTo(null);
        dateTime();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnlist = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtlist = new javax.swing.JTextArea();
        btnsearch = new javax.swing.JButton();
        btnweb = new javax.swing.JButton();
        btncost = new javax.swing.JButton();
        btnfacebook = new javax.swing.JButton();
        btninsta = new javax.swing.JButton();
        btnwhatsapp = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        lbldate = new javax.swing.JLabel();
        rbtncat = new javax.swing.JRadioButton();
        rbtnitem = new javax.swing.JRadioButton();
        rbtnprice = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAsearch = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setText("[]");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setText("-");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel4.setText("Marketing department");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 776, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setLayout(null);

        btnlist.setText("List of Items");
        btnlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistActionPerformed(evt);
            }
        });
        jPanel2.add(btnlist);
        btnlist.setBounds(70, 50, 310, 23);

        txtlist.setColumns(20);
        txtlist.setRows(5);
        jScrollPane1.setViewportView(txtlist);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(70, 90, 310, 350);

        btnsearch.setText("Search Item");
        btnsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnsearch);
        btnsearch.setBounds(670, 50, 100, 23);

        btnweb.setText("Manage Web Page");
        btnweb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnweb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwebActionPerformed(evt);
            }
        });
        jPanel2.add(btnweb);
        btnweb.setBounds(850, 200, 260, 23);

        btncost.setText("Costs for Marketing");
        btncost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncostActionPerformed(evt);
            }
        });
        jPanel2.add(btncost);
        btncost.setBounds(850, 150, 260, 23);

        btnfacebook.setText("FaceBook");
        btnfacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnfacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacebookActionPerformed(evt);
            }
        });
        jPanel2.add(btnfacebook);
        btnfacebook.setBounds(850, 250, 260, 23);

        btninsta.setText("Instargram");
        btninsta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninstaActionPerformed(evt);
            }
        });
        jPanel2.add(btninsta);
        btninsta.setBounds(850, 300, 260, 23);

        btnwhatsapp.setText("Whatsapp");
        btnwhatsapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnwhatsapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwhatsappActionPerformed(evt);
            }
        });
        jPanel2.add(btnwhatsapp);
        btnwhatsapp.setBounds(850, 350, 260, 23);

        btnadd.setText("Add New Item");
        btnadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel2.add(btnadd);
        btnadd.setBounds(850, 50, 260, 23);

        btnedit.setText("Edit Item Property");
        btnedit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel2.add(btnedit);
        btnedit.setBounds(850, 100, 260, 23);

        btnlogout.setText("Logout");
        btnlogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnlogout);
        btnlogout.setBounds(1040, 420, 70, 23);

        btnexit.setText("Exit");
        btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel2.add(btnexit);
        btnexit.setBounds(950, 420, 70, 23);
        jPanel2.add(txtsearch);
        txtsearch.setBounds(440, 50, 220, 30);

        lbldate.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                lbldateInputMethodTextChanged(evt);
            }
        });
        jPanel2.add(lbldate);
        lbldate.setBounds(850, 384, 250, 30);

        rbtncat.setText("Category");
        rbtncat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtncatActionPerformed(evt);
            }
        });
        jPanel2.add(rbtncat);
        rbtncat.setBounds(440, 20, 80, 23);

        rbtnitem.setText("Item");
        jPanel2.add(rbtnitem);
        rbtnitem.setBounds(520, 20, 50, 23);

        rbtnprice.setText("Price");
        jPanel2.add(rbtnprice);
        rbtnprice.setBounds(580, 20, 93, 23);

        txtAsearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(txtAsearch);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(440, 90, 330, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnfacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacebookActionPerformed
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(new URL("https://www.facebook.com").toURI()); //Enter facebook page url here
        } catch (MalformedURLException ex) {
            Logger.getLogger(marketing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(marketing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(marketing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnfacebookActionPerformed

    private void btninstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninstaActionPerformed
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(new URL("https://www.instagram.com/").toURI()); //Enter instergram acc url here
        } catch (MalformedURLException ex) {
            Logger.getLogger(marketing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(marketing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(marketing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btninstaActionPerformed

    private void lbldateInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lbldateInputMethodTextChanged
        // TODO add your handling code here:
        dateTime();
    }//GEN-LAST:event_lbldateInputMethodTextChanged

    private void btnlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistActionPerformed
        // TODO add your handling code here:
        String filename = "C:\\Users\\KAVI\\Desktop\\Items.txt";

        try
        {
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            txtlist.read(br, null);
            br.close();
            txtlist.requestFocus();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnlistActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        if(rbtncat.isSelected())
        {
            this.userSearch(txtsearch.getText(), rbtncat.getText(),0);
        }
        if(rbtnitem.isSelected())
        {
            this.userSearch(txtsearch.getText(), rbtnitem.getText(),1);
        }
        if(rbtnprice.isSelected())
        {
            this.userSearch(txtsearch.getText(), rbtnprice.getText(),2);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void rbtncatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtncatActionPerformed
        // TODO add your handling code here:
        if(rbtncat.isSelected())
        {
            txtsearch.setText("#");
        }
        else
        {
            txtsearch.setText(null);
        }
    }//GEN-LAST:event_rbtncatActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        Object[] options= {"OK", "Cancel"};
        int response = JOptionPane.showOptionDialog(null, "sure you want to exit?", "Warning",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        
        if (response==JOptionPane.OK_OPTION)
        {
        System.exit(0);
        }
        else if(response==JOptionPane.CANCEL_OPTION)
                {
                
                }
        else if(response==JOptionPane.CLOSED_OPTION)
        {
        
        }
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        this.toBack();
        this.setVisible(false);
        this.dispose();
        new login().toFront();
        new login().setVisible(true);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        new additem().toFront();
        new additem().setVisible(true);
    }//GEN-LAST:event_btnaddActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        new edit().toFront();
        new edit().setVisible(true);
    }//GEN-LAST:event_btneditActionPerformed

    private void btnwhatsappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwhatsappActionPerformed
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(new URL("https://web.whatsapp.com/").toURI()); //link with beta whatsapp business account to your default web browser
        } catch (MalformedURLException ex) {
            Logger.getLogger(marketing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(marketing.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(marketing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnwhatsappActionPerformed

    private void btnwebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwebActionPerformed
        // TODO add your handling code here:
        //enter your web page here
    }//GEN-LAST:event_btnwebActionPerformed

    private void btncostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncostActionPerformed
        // TODO add your handling code here:
        new cost().toFront();
        new cost().setVisible(true);
    }//GEN-LAST:event_btncostActionPerformed

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
            java.util.logging.Logger.getLogger(marketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(marketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(marketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(marketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new marketing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncost;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnfacebook;
    private javax.swing.JButton btninsta;
    private javax.swing.JButton btnlist;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnweb;
    private javax.swing.JButton btnwhatsapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbldate;
    private javax.swing.JRadioButton rbtncat;
    private javax.swing.JRadioButton rbtnitem;
    private javax.swing.JRadioButton rbtnprice;
    private javax.swing.JTable txtAsearch;
    private javax.swing.JTextArea txtlist;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables

    public void dateTime()
    {
        ActionListener actiondate = new ActionListener()
        {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date mydate = new Date();
                
                lbldate.setText("Time : "+mydate.getHours()+":"+mydate.getMinutes()+":"+mydate.getSeconds());
            }
        };
        new javax.swing.Timer(100, actiondate).start();
    }
    
    private void userSearch(String userDeatails, String Stype, int colnu)
      {
          //cat=String.valueOf(cmbCCatagory.getSelectedItem());
          DefaultTableModel mytblmodle=(DefaultTableModel)txtAsearch.getModel();
          mytblmodle.setRowCount(0);
          try
          {
            BufferedReader br = null;
            File file = new File("C:\\Users\\KAVI\\Desktop\\Items.txt");
            FileReader fr = new FileReader(file); // java.io.FileReader
            br = new BufferedReader(fr); // java.io.BufferedReader
            String headingline = br. readLine().trim(); //read the file heading
            String[] colName=headingline.split("\\t");
            Object[] fileLines=br.lines().toArray();
            mytblmodle.setColumnIdentifiers(colName);
                for (int count=0;count<=fileLines.length-1;count++)
                {
                  String currentLine=fileLines[count].toString().trim();
                  String[] row=currentLine.split("\\t");

                  for (int x=0;x<=row.length-1;x++)
                  {          
                        if (row[colnu].equals(userDeatails)) 
                        {
                            JOptionPane.showMessageDialog(this, "User Found!","User Found!", HEIGHT);
                            mytblmodle.addRow(row);
                            break;
                        }
                    break;
                  }
                }
          }
          catch (FileNotFoundException ex) {
          JOptionPane.showMessageDialog(this, "Check selected User File!","User File Error", HEIGHT);
         // Logger.getLogger(frmHRM.class.getName()).log(Level.SEVERE, null, ex);
          }
          catch (IOException ex)
          {
         // Logger.getLogger(frmHRM.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
}
