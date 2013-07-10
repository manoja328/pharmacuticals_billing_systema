/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BaseContainer.java
 *
 * Created on Nov 14, 2012, 7:33:36 PM
 */
package pharmacuticals_billing_systema;

import Reporting.Inventory;
import Reporting.purchaseDetail;
import Reporting.salesDetail;
import ValidationFormBox.loginPanel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paradise lost
 */
public class BaseContainer extends javax.swing.JFrame {

    /** Creates new form BaseContainer */
    public BaseContainer() throws SQLException {
        inventoryForm=new Inventory();
        sd=new salesDetail();
        pd=new purchaseDetail();
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ControlMenu = new javax.swing.JMenu();
        NewTransactionMenu = new javax.swing.JMenuItem();
        NewPurchaseMenu = new javax.swing.JMenuItem();
        ViewTransactionMenu = new javax.swing.JMenu();
        InventoryButton = new javax.swing.JMenuItem();
        salesReportButton = new javax.swing.JMenuItem();
        purReport = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        loginMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 51, 204));
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("rabindra.kharel@gmail.com");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 690, 160, 20));

        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Product No : 0000001A");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 690, -1, 20));

        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("Rabindra Kharel");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 690, 100, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 710, 580, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 690, 580, 10));

        jLabel5.setForeground(new java.awt.Color(204, 0, 204));
        jLabel5.setText("Developed By : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 690, 90, 20));

        ControlMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ControlMenu.setForeground(new java.awt.Color(0, 0, 102));
        ControlMenu.setText("    Control      ");
        ControlMenu.setFont(new java.awt.Font("Segoe UI", 1, 12));

        NewTransactionMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        NewTransactionMenu.setIcon(new javax.swing.ImageIcon("M:\\current jobs\\pharmacuticals_billing_systema\\icon.png")); // NOI18N
        NewTransactionMenu.setText("New Transaction ");
        NewTransactionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTransactionMenuActionPerformed(evt);
            }
        });
        ControlMenu.add(NewTransactionMenu);

        NewPurchaseMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        NewPurchaseMenu.setIcon(new javax.swing.ImageIcon("M:\\current jobs\\pharmacuticals_billing_systema\\icon2.png")); // NOI18N
        NewPurchaseMenu.setText("New Purchase");
        NewPurchaseMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPurchaseMenuActionPerformed(evt);
            }
        });
        ControlMenu.add(NewPurchaseMenu);

        jMenuBar1.add(ControlMenu);

        ViewTransactionMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ViewTransactionMenu.setForeground(new java.awt.Color(0, 0, 102));
        ViewTransactionMenu.setText("        View          ");
        ViewTransactionMenu.setFont(new java.awt.Font("Segoe UI", 1, 12));

        InventoryButton.setText("Stock Report");
        InventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventoryButtonActionPerformed(evt);
            }
        });
        ViewTransactionMenu.add(InventoryButton);

        salesReportButton.setText("Sales Report");
        salesReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesReportButtonActionPerformed(evt);
            }
        });
        ViewTransactionMenu.add(salesReportButton);

        purReport.setText("Purchase Report");
        purReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purReportActionPerformed(evt);
            }
        });
        ViewTransactionMenu.add(purReport);

        jMenuBar1.add(ViewTransactionMenu);

        jMenu4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setForeground(new java.awt.Color(0, 0, 102));
        jMenu4.setText("      Settings    ");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12));

        loginMenu.setText("Admin Login/logout");
        loginMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuActionPerformed(evt);
            }
        });
        jMenu4.add(loginMenu);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewTransactionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTransactionMenuActionPerformed
        // TODO add your handling code here:
       // billingForm.setVisible(true);  
    if(isuser)
    {
        if(purchaseCount!=0)
        {  purchaseCount=0;
            getContentPane().remove(purchaseForm);   
            }
        if(loginCount!=0)
        {   loginCount=0;
            getContentPane().remove(loginForm);   
                    }
          if(salesReportCount!=0)
        {
        salesReportCount=0;
            getContentPane().remove(sd);
        }
        if(billCount==0)
        { billingForm=new BillingForm();
     getContentPane().add(billingForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 1800));
        billCount=1;
   
        } 
         if(inventoryCount!=0)
        {   inventoryCount=0;
            getContentPane().remove(inventoryForm);   
         }
         if(purRepCount!=0)
        {   purRepCount=0;
            getContentPane().remove(pd);   
         }
         //purRepCount
       
     getContentPane().invalidate();
     getContentPane().validate();
     setVisible(true);  
     getContentPane().repaint();
    }
    else 
         new javax.swing.JOptionPane().showMessageDialog(this,"You are not logged in !! "); 
       
    }//GEN-LAST:event_NewTransactionMenuActionPerformed

    private void NewPurchaseMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPurchaseMenuActionPerformed
        // purchaseForm.setVisible(true);  
       if(isadmin){
        if(billCount!=0)
        {   billCount=0;
            getContentPane().remove(billingForm);   
                    }
        if(loginCount!=0)
        {   loginCount=0;
            getContentPane().remove(loginForm);   
                    }
         if(purRepCount!=0)
        {   purRepCount=0;
            getContentPane().remove(pd);   
         }
          if(salesReportCount!=0)
        {
        salesReportCount=0;
            getContentPane().remove(sd);
        }
           if(inventoryCount!=0)
        {   inventoryCount=0;
            getContentPane().remove(inventoryForm);   
                    }
        if(purchaseCount==0)
        {
        purchaseForm=new PurchaseForm();
        getContentPane().add(purchaseForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 1800));
        purchaseCount=1;
         } 
        
            
     getContentPane().invalidate();
     getContentPane().validate();
    // setVisible(false);
     setVisible(true);   
     getContentPane().repaint();// TODO add your handling code here:
       }
       else
           new javax.swing.JOptionPane().showMessageDialog(this,"Log in as Administrator ! "); 
       
     
    }//GEN-LAST:event_NewPurchaseMenuActionPerformed

    private void loginMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuActionPerformed
      
        if(billCount!=0)
        {   billCount=0;
            getContentPane().remove(billingForm);   
                    }
         if(purchaseCount!=0)
        {   purchaseCount=0;
            getContentPane().remove(purchaseForm);   
             }
         if(inventoryCount!=0)
        {   inventoryCount=0;
            getContentPane().remove(inventoryForm);   
                    }
          if(purRepCount!=0)
        {   purRepCount=0;
            getContentPane().remove(pd);   
         }
           if(salesReportCount!=0)
        {
        salesReportCount=0;
            getContentPane().remove(sd);
        }
         
        if(loginCount==0)
        {
        loginForm=new loginPanel();
        getContentPane().add(loginForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40,-1,-1));
        loginCount=1;
       
        } 
        
            
     getContentPane().invalidate();
     getContentPane().validate();
    // setVisible(false);
     setVisible(true);   
     getContentPane().repaint();// TODO add your handling code here:
    }//GEN-LAST:event_loginMenuActionPerformed

    private void InventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryButtonActionPerformed
      // purchaseForm.setVisible(true);  
       if(isadmin){
        if(billCount!=0)
        {   billCount=0;
            getContentPane().remove(billingForm);   
                    }
        if(loginCount!=0)
        {   loginCount=0;
            getContentPane().remove(loginForm);   
                    }
         if(purchaseCount!=0)
        {   purchaseCount=0;
            getContentPane().remove(purchaseForm);   
                    }
         if(salesReportCount!=0)
        {
        salesReportCount=0;
            getContentPane().remove(sd);
        }
          if(purRepCount!=0)
        {   purRepCount=0;
            getContentPane().remove(pd);   
         }
        if(inventoryCount==0)
        {
                try {
                    inventoryForm=new Inventory();
                } catch (SQLException ex) {
                    Logger.getLogger(BaseContainer.class.getName()).log(Level.SEVERE, null, ex);
                }
        getContentPane().add(inventoryForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 1800));
        inventoryCount=1;
        
        } 
        
            
     getContentPane().invalidate();
     getContentPane().validate();
    // setVisible(false);
     setVisible(true);   
     getContentPane().repaint();// TODO add your handling code here:
       }
       else
           new javax.swing.JOptionPane().showMessageDialog(this,"Log in as Administrator ! "); 
           // TODO add your handling code here:
    }//GEN-LAST:event_InventoryButtonActionPerformed

    private void salesReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesReportButtonActionPerformed
 if(isadmin){
        if(billCount!=0)
        {   billCount=0;
            getContentPane().remove(billingForm);   
                    }
         if(purchaseCount!=0)
        {   purchaseCount=0;
            getContentPane().remove(purchaseForm);   
             }
           if(purRepCount!=0)
        {   purRepCount=0;
            getContentPane().remove(pd);   
         }
         if(inventoryCount!=0)
        {   inventoryCount=0;
            getContentPane().remove(inventoryForm);   
                    }
         if(loginCount!=0)
        {   loginCount=0;
            getContentPane().remove(loginForm);   
         }
         
        if(salesReportCount==0)
        {
            try {
                sd=new salesDetail();
            } catch (SQLException ex) {
                Logger.getLogger(BaseContainer.class.getName()).log(Level.SEVERE, null, ex);
            }
        getContentPane().add(sd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 1800));
        salesReportCount=1;
        } 
        
            
     getContentPane().invalidate();
     getContentPane().validate();
    // setVisible(false);
     setVisible(true);   
     getContentPane().repaint();
 }
 else
           new javax.swing.JOptionPane().showMessageDialog(this,"Log in as Administrator ! "); 
          // TODO add your handling code here:
    }//GEN-LAST:event_salesReportButtonActionPerformed

    private void purReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purReportActionPerformed
    if(isadmin){
        if(billCount!=0)
        {   billCount=0;
            getContentPane().remove(billingForm);   
                    }
        if(loginCount!=0)
        {   loginCount=0;
            getContentPane().remove(loginForm);   
                    }
         if(purchaseCount!=0)
        {   purchaseCount=0;
            getContentPane().remove(purchaseForm);   
                    }
         if(salesReportCount!=0)
        {
        salesReportCount=0;
            getContentPane().remove(sd);
        }
          if(inventoryCount!=0)
        {   inventoryCount=0;
            getContentPane().remove(inventoryForm);   
                    }
        if(purRepCount==0)
        {
                try {
                    pd=new purchaseDetail();
                } catch (SQLException ex) {
                    Logger.getLogger(BaseContainer.class.getName()).log(Level.SEVERE, null, ex);
                }
        getContentPane().add(pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 1800));
       purRepCount=1;
        } 
        
            
     getContentPane().invalidate();
     getContentPane().validate();
    // setVisible(false);
     setVisible(true);   
     getContentPane().repaint();// TODO add your handling code here:
       }
       else
           new javax.swing.JOptionPane().showMessageDialog(this,"Log in as Administrator ! "); 
              // TODO add your handling code here:
    }//GEN-LAST:event_purReportActionPerformed

        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new BaseContainer().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BaseContainer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ControlMenu;
    private javax.swing.JMenuItem InventoryButton;
    private javax.swing.JMenuItem NewPurchaseMenu;
    private javax.swing.JMenuItem NewTransactionMenu;
    private javax.swing.JMenu ViewTransactionMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem loginMenu;
    private javax.swing.JMenuItem purReport;
    private javax.swing.JMenuItem salesReportButton;
    // End of variables declaration//GEN-END:variables
    private BillingForm  billingForm= new BillingForm();  
    private PurchaseForm  purchaseForm= new PurchaseForm();  
    private  loginPanel loginForm=new loginPanel();
    private salesDetail sd;
    private Inventory inventoryForm;
    private purchaseDetail pd;
    private int billCount=0;
    private int purchaseCount=0;
    private int loginCount=0;
    private int inventoryCount=0;
    private int salesReportCount=0;
    private int purRepCount=0;
    public static boolean isadmin=false;
    public static boolean isuser=false;
    public static String username="";
    public static String ssn_id="";
}
