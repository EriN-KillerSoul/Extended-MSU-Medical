/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msumedical2;

import javax.swing.JOptionPane;

/**
 *
 * @author Erina Chin
 */
public class medicine {
    public void listMedicine()
        {
            String displayMedicine = "";
    
            String MedicineArray[] = new String[2];
            for(int s = 0;s<MedicineArray.length;s++)
        {
            String MedicineId = JOptionPane.showInputDialog("Medicine Menu:\nEnter Medicine Id");
            MedicineArray[s] = String.valueOf(MedicineId);
            String MedicineName = JOptionPane.showInputDialog("Medicine Menu:\nEnter Medicine Name");
            MedicineArray[s] = String.valueOf(MedicineName);
            String MedicineQuantity = JOptionPane.showInputDialog("Medicine Menu:\nEnter Medicine Quantity");
            MedicineArray[s] = String.valueOf(MedicineQuantity);
            displayMedicine = displayMedicine +MedicineId + "                 " + MedicineName + "                 " + MedicineQuantity + "\n";
    }        
        JOptionPane.showMessageDialog(null,"Id" + "            " +"Medicine Name" + "      " + "Quantity" + "\n" + displayMedicine);
    }
    
    
}
