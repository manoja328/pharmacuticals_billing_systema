/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Inventory.java
 *
 * Created on Dec 22, 2012, 8:55:29 AM
 */
package Reporting;

import Model.InventoryModel;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paradise lost
 */
public class Inventory extends javax.swing.JPanel {

    /** Creates new form Inventory */
    public Inventory() throws SQLException {
        dft=new DefaultTableModel();
        dft.addColumn("Sn");
        dft.addColumn("Name");
        dft.addColumn("Qty(ml/gm/Pack)");
        dft.addColumn("Stock Value");
        InventoryModel im=new InventoryModel();        
        Vector<Vector<String>> resultSet=im.getAllDetails("noth");
        for(Vector<String> list : resultSet)
        {
            dft.addRow(list);
        }
        initComponents();     
        
        stockCost.setText(Math.round(new Float(im.getInventoryCost()))+" NRS");
        stockValue.setText(Math.round(new Float(im.getInventoryCost()))+" NRS");
        stockCost.repaint();
        stockValue.repaint();
           
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        stockValue = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        stockCost = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, -1, 640));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Inventory Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jButton1.setText("Alphabetical");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 120, -1));

        jButton2.setText("Stock Wise");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 660, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Total Stock Value : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 130, 22));

        stockValue.setFont(new java.awt.Font("Tahoma", 0, 14));
        stockValue.setText("O.O NRS");
        add(stockValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 160, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 290, -1));

        stockCost.setFont(new java.awt.Font("Tahoma", 0, 14));
        stockCost.setText("O.O NRS");
        add(stockCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 160, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Total Stock Cost  :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 130, 22));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 280, -1));

        inventoryTable.setModel(dft);
        jScrollPane2.setViewportView(inventoryTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 638));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            dft=new DefaultTableModel();
                  dft.addColumn("Sn");
                  dft.addColumn("Name");
                  dft.addColumn("Qty");
                  InventoryModel im=new InventoryModel();        
                  Vector<Vector<String>> resultSet=im.getAllDetails("product");
                  for(Vector<String> list : resultSet)
                  {
                      dft.addRow(list);
                      System.out.print(dft.toString());
        }
        inventoryTable.setModel(dft);
        jScrollPane2.setViewportView(inventoryTable);
        jScrollPane3.setViewportView(jScrollPane2);
     this.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, -1, 620));
     this.invalidate();
     this.validate();
     setVisible(true);   
     this.repaint();
        
        
// TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            dft=new DefaultTableModel();
                  dft.addColumn("Sn");
                  dft.addColumn("Name");
                  dft.addColumn("Qty");
                  InventoryModel im=new InventoryModel();        
                  Vector<Vector<String>> resultSet=im.getAllDetails("stock");
                  for(Vector<String> list : resultSet)
                  {
                      dft.addRow(list);
        }
     
        inventoryTable.setModel(dft);
        jScrollPane2.setViewportView(inventoryTable);
        jScrollPane3.setViewportView(jScrollPane2);
     this.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, -1, 620));
     this.invalidate();
     this.validate();
     setVisible(true);   
     this.repaint();
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        }//GEN-LAST:event_jButton2ActionPerformed
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable inventoryTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel stockCost;
    private javax.swing.JLabel stockValue;
    // End of variables declaration//GEN-END:variables
  DefaultTableModel dft;
}