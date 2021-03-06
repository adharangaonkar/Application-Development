/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarDirectory;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CCM
 */
public class ManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManJPanel
     */
    
    private JPanel userProcessContainer;
    private CarDirectory carDirectory;
    ManJPanel(JPanel userProcessContainer, CarDirectory carDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.carDirectory = carDirectory;
        populateMan();
    }
    private void populateMan(){
    DefaultTableModel dtm = (DefaultTableModel) tblMan.getModel();
        dtm.setRowCount(0);
        ArrayList<String> man = new ArrayList<String>();
        for(Car car: carDirectory.getCarList()){
            Object row[] = new Object[1];
            
    if(man.contains(car.getBrand()))
    {}
    else{
    row[0] = car.getBrand();
    dtm.addRow(row);
    man.add(car.getBrand());
    }
         
    }
    }
    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMan = new javax.swing.JTable();

        tblMan.setBorder(new javax.swing.border.MatteBorder(null));
        tblMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Manufacturer"
            }
        ));
        jScrollPane1.setViewportView(tblMan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMan;
    // End of variables declaration//GEN-END:variables
}
