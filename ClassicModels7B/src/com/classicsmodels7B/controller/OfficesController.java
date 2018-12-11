/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classicsmodels7B.controller;
import com.classicmodels7b.dao.OfficesDaoImpl;
import com.classicmodels7b.model.OfficesModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karol
 */
public class OfficesController {
    OfficesDaoImpl OfficesDaoImple = new OfficesDaoImpl();
    
    public String createOffice(String OfficeCode,String city,String phone,String addressLine1,String addressLine2,String state,String country,String postalCode,String territory){
        
        OfficesModel newOffice;
        
        newOffice = new OfficesModel(OfficeCode, city, phone, addressLine1, addressLine2, state, country, postalCode, territory);
        
        String serverAnswer = OfficesDaoImple.createOffice(newOffice);
        
        return serverAnswer;
    }
    public void readOffices(JTable table){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("OFFICE CODE");
        tableModel.addColumn("CITY");
        tableModel.addColumn("PHONE");
        tableModel.addColumn("ADDRESS LINE 1");
        tableModel.addColumn("ADDRESS LINE 2");
        tableModel.addColumn("STATE");
        tableModel.addColumn("COUNTRY");
        tableModel.addColumn("POSTALCODE");
        tableModel.addColumn("TERRITORY");
        int numRegisters = OfficesDaoImple.readOffices().size();
        Object[] row = new Object[9];
        for (int i = 0; i < numRegisters; i++) {
            row[0] = OfficesDaoImple.readOffices().get(i).getOfficeCode();
            row[1] = OfficesDaoImple.readOffices().get(i).getCity();
            row[2] = OfficesDaoImple.readOffices().get(i).getPhone();
            row[3] = OfficesDaoImple.readOffices().get(i).getAddressLIne1();
            row[4] = OfficesDaoImple.readOffices().get(i).getAddressLIne2();
            row[5] = OfficesDaoImple.readOffices().get(i).getState();
            row[6] = OfficesDaoImple.readOffices().get(i).getCountry();
            row[7] = OfficesDaoImple.readOffices().get(i).getPostalCode();
            row[8] = OfficesDaoImple.readOffices().get(i).getTerritory();
            tableModel.addRow(row);
         }
        table.setModel(tableModel);
    }
}
