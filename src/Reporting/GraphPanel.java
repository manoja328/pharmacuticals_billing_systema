/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GraphPanel.java
 *
 * Created on Apr 19, 2013, 9:27:41 AM
 */
package Reporting;

import Model.SalesModel;
import java.awt.Color;
import java.awt.Graphics;
import java.lang.Integer;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rabindra
 */
public class GraphPanel extends javax.swing.JPanel {
private SalesModel sm;

    /** Creates new form GraphPanel */
    public GraphPanel() throws SQLException {
         sm=new SalesModel();
        initComponents();
        this.setBackground(new java.awt.Color(204, 204, 204));
        this.setVisible(true);
        
    }
    @Override
public void paint(Graphics graphics)
{ graphics.setColor( Color.black );
  graphics.drawLine(0,0,0,300);
  graphics.drawLine(0, 300, 600, 300); // x and y axis
List<Date> dates = new ArrayList<Date>();
SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd"); 
long interval = 24*1000 * 60 * 60; // 1 hour in millis
long curTime = new Date().getTime();
long startTime =curTime-24*1000 * 60 * 60*6; // create your endtime here, possibly using Calendar or Date
DateFormat formatter  =new SimpleDateFormat("yyyy-MM-dd"); 
System.out.println(curTime-startTime);
while (startTime <= curTime) 
{
    dates.add(new Date(startTime));
    startTime += interval;
}

int xCoor=0;
int[][] Coor = new int[7][2]; 
for(int i=0;i<dates.size();i++){
    Date lDate =(Date)dates.get(i);
    String ds = formatter.format(lDate);
     try {
            int Val=(int) Math.ceil(sm.getSales(ds)/100);//change 50 0as per the marketting sheme
            xCoor+=80;
            Coor[i][0]=xCoor-40;
            Coor[i][1]=300-Val;
    graphics.drawString(ds,xCoor-60,313);
          } 
     catch (SQLException ex) {
                Logger.getLogger(GraphPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
}

graphics.setColor( Color.red );

for(int i=0;i<6;i++)
{
graphics.drawLine(Coor[i][0],Coor[i][1],Coor[i+1][0],Coor[i+1][1]);
}

}
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(new javax.swing.border.MatteBorder(null));
        setForeground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
