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
public class staff {
    
    public void listStaff()
    {
    String displayStaff = "";
    
    String staffArray[] = new String[2];
    for(int s = 0;s<staffArray.length;s++)
    {
        String staffId = JOptionPane.showInputDialog("Staff Menu:\nEnter staff Id");
        staffArray[s] = String.valueOf(staffId);
        String staffName = JOptionPane.showInputDialog("Staff Menu:\nEnter staff Name");
        staffArray[s] = String.valueOf(staffName);
        String staffDept = JOptionPane.showInputDialog("Staff Menu:\nEnter staff Department");
        staffArray[s] = String.valueOf(staffDept);
        displayStaff = displayStaff +staffId + "                 " + staffName + "                 " + staffDept + "\n";
    }        
        JOptionPane.showMessageDialog(null,"Staff Id" + " " +"Staff Name" + " " + "Staff Department" + "\n" + displayStaff);
    }
     
    
}   