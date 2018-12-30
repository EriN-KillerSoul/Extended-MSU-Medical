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
public class patient {
    
public void listPatient()
    {
    String displayPatient = "";
    
    String patientArray[] = new String[2];
    for(int p = 0;p<patientArray.length;p++)
    {
        String patientId = JOptionPane.showInputDialog("Patient Menu:\nEnter patient Id");
        patientArray[p] = String.valueOf(patientId);
        String patientName = JOptionPane.showInputDialog("Patient Menu:\nEnter patient Name");
        patientArray[p] = String.valueOf(patientName);
        String patientIC = JOptionPane.showInputDialog("Patient Menu:\nEnter patient IC");
        patientArray[p] = String.valueOf(patientIC);
        String patientWard = JOptionPane.showInputDialog("Patient Menu:\nEnter Ward Number :");
        patientArray[p] = String.valueOf(patientWard);
        String patientBed = JOptionPane.showInputDialog("Patient Menu:\nEnter Bed Number :");
        patientArray[p] = String.valueOf(patientBed);
        String patientBlood = JOptionPane.showInputDialog("Patient Menu:\nEnter blood type :");
        patientArray[p] = String.valueOf(patientBlood); 
        displayPatient = displayPatient +patientId + "                 " + patientName + "                 " + patientIC + 
                "                 "+ patientWard +"                 "+ patientBed +
                "                 "+ patientBlood +"\n";
    }        
        JOptionPane.showMessageDialog(null,"Patient Id" + "    " +"Patient Name" + "    " + "Patient IC" + 
                "    " + "Ward Number" + "    " + "Bed Number" + "    " + " Blood Type\n" + displayPatient);
    }

}
