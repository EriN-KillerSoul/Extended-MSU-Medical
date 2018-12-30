/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msumedical2;

import javax.swing.JOptionPane;
/**
 *
 * @author anaxc
 */
public class Msumedical2 {

    public static void main(String[] args) {
        

        String menu = new String("MSU MEDICAL CENTRE" + "\n\nMenu :" + "\n1. Staff" + "\n2. Medicine"
                + "\n3. Patient " + "\n4. Exit" + "\n\nSelect option :");
       
        String option = JOptionPane.showInputDialog(menu.toString());
    switch(option)
        {
            case "1":
                staff listStaff2 = new staff();
                listStaff2.listStaff();
            break;
            case "2":
                medicine listMedicine = new medicine();
                listMedicine.listMedicine();
            break;
            case "3":
                patient listPatient = new patient();
                listPatient.listPatient();
            break;
            default:
                String answer = JOptionPane.showInputDialog(null, "Are you sure you want to exit?");
                if (answer.equals("yes")) {
                    System.exit(0);
                }
                if (answer.equals("no")) {
                    Msumedical2.main(args);
                }
            break;    
        }
    }  
}