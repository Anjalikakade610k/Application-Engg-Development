/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import static java.awt.Image.SCALE_DEFAULT;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Cardetailshistory;
import model.Product;

/**
 *
 * @author anjalikakade
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    private Image image;
    Cardetailshistory history;

    public CreateJPanel(Cardetailshistory history){
        initComponents();
        this.history = history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreate = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblEngNo = new javax.swing.JLabel();
        lblSeatsNo = new javax.swing.JLabel();
        lblLicplate = new javax.swing.JLabel();
        lblOName = new javax.swing.JLabel();
        lblOTelNo = new javax.swing.JLabel();
        lblEmailadd = new javax.swing.JLabel();
        lblODrivlic = new javax.swing.JLabel();
        lblOSSN = new javax.swing.JLabel();
        lblOAdd = new javax.swing.JLabel();
        lblServrec = new javax.swing.JLabel();
        lblWyr = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtEngNo = new javax.swing.JTextField();
        txtLicplate = new javax.swing.JTextField();
        txtOName = new javax.swing.JTextField();
        txtOTelNo = new javax.swing.JTextField();
        txtEmailadd = new javax.swing.JTextField();
        txtDrivlic = new javax.swing.JTextField();
        txtOSSN = new javax.swing.JTextField();
        txtOAdd = new javax.swing.JTextField();
        txtServrec = new javax.swing.JTextField();
        txtWyr = new javax.swing.JTextField();
        bttnSave = new javax.swing.JButton();
        btnAttach = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSeatsNo = new javax.swing.JTextField();

        lblCreate.setText(" Create");
        lblCreate.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblBrand.setText("Brand");

        lblModel.setText("Model");

        lblColor.setText("Color");

        lblYear.setText("Year");

        lblEngNo.setText("Engine No.");

        lblSeatsNo.setText("Seats No.");

        lblLicplate.setText("License Plate");

        lblOName.setText("Owner Name");

        lblOTelNo.setText("Owner Tel No.");

        lblEmailadd.setText("Email Add :");

        lblODrivlic.setText("Owner Driver License");

        lblOSSN.setText("Owner SSN");

        lblOAdd.setText("Owner Address");

        lblServrec.setText("Service Records");

        lblWyr.setText("Warranty Year");

        lblPhoto.setText("Photo");

        txtBrand.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtModel.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtColor.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtYear.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtEngNo.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtLicplate.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtOName.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtOTelNo.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtEmailadd.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtDrivlic.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtOSSN.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtOAdd.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtServrec.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtWyr.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        bttnSave.setText("Save");
        bttnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnSaveActionPerformed(evt);
            }
        });

        btnAttach.setText("Attach");
        btnAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmailadd, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLicplate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeatsNo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEngNo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtYear)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBrand)
                                        .addComponent(txtModel, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(txtColor)
                                    .addComponent(txtEngNo)
                                    .addComponent(txtLicplate)
                                    .addComponent(txtOName)
                                    .addComponent(txtOTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailadd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCreate, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(68, 74, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(bttnSave))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSeatsNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWyr)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(lblPhoto)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblODrivlic)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDrivlic, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblOSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtOSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblOAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblServrec))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtServrec, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtWyr, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAttach))))
                                .addGap(0, 13, Short.MAX_VALUE))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBrand, txtColor, txtDrivlic, txtEmailadd, txtEngNo, txtLicplate, txtModel, txtOAdd, txtOName, txtOSSN, txtOTelNo, txtSeatsNo, txtServrec, txtWyr, txtYear});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBrand)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblODrivlic)
                        .addComponent(txtDrivlic, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblColor)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOAdd)
                            .addComponent(txtOAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAttach))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEngNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEngNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblServrec)
                                    .addComponent(txtServrec))))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSeatsNo)
                                .addComponent(txtSeatsNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblWyr)
                                .addComponent(txtWyr, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLicplate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLicplate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOTelNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOTelNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailadd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmailadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnSave)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBrand, txtColor, txtDrivlic, txtEmailadd, txtEngNo, txtLicplate, txtModel, txtOAdd, txtOName, txtOSSN, txtOTelNo, txtServrec, txtWyr, txtYear});

    }// </editor-fold>//GEN-END:initComponents

    private void bttnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnSaveActionPerformed
        // TODO add your handling code here:
//        //String Brand = txtBrand.getText();
//        String Model = txtModel.getText();
//        
//        String Color = txtColor.getText();
//        String Year = txtYear.getText();
//        String EngineNo = txtEngNo.getText();
//        String SeatsNo = txtSeatsNo.getText();
//        String Licplate = txtLicplate.getText();
//        String OName = txtOName.getText();
//        String OTelNo = txtOTelNo.getText();
//        String OEmailadd = txtEmailadd.getText();
//        String ODrivlic = txtDrivlic.getText();
//        String OSSN = txtOSSN.getText();
//        String OAdd = txtOAdd.getText();
//        String Servrec = txtServrec.getText();
//        String Wyr = txtWyr.getText();
//        
        try{ 
           String address = txtOAdd.getText();
           String Wyr = txtWyr.getText();
        String Brand = txtBrand.getText();
        String Model = txtModel.getText();
        String Color = txtColor.getText();
        String seats = txtSeatsNo.getText();
        String EngineNo = txtEngNo.getText();
        String LicPlate = txtLicplate.getText();
        
        String OEmailadd =txtEmailadd.getText();
        String ODrivlic = txtDrivlic.getText();
        String OTelNo =  txtOTelNo.getText();
        String Servrec = txtServrec.getText();
        String OSSN = txtOSSN.getText();
        String OName = txtOName.getText();
        
        String Year = txtYear.getText();
        if(Brand.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Car Brand is Empty!");
         txtBrand.grabFocus();
            return;
        }else if(Model.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Car Model is Empty!");
         txtModel.grabFocus();
            return;
        }else if(Color.trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Car color is Empty!");
         txtColor.grabFocus();
            return;
        }else if(EngineNo.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Car EngineNo is Empty!");
         txtEngNo.grabFocus();
            return;
        }else if(LicPlate.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Car License Plate is Empty!");
         txtLicplate.grabFocus();
            return;
          }else if(OName.trim().isEmpty()){
              JOptionPane.showMessageDialog(this, "Owner Name is Empty!");
         txtOName.grabFocus();
            return;
          }else if(OEmailadd.trim().isEmpty()){
              JOptionPane.showMessageDialog(this, "Email Address is Empty!");
         txtEmailadd.grabFocus();
            return;
          }else if(ODrivlic.trim().isEmpty()){
              JOptionPane.showMessageDialog(this, "Driver License is Empty!");
         txtDrivlic.grabFocus();
            return;
          }else if(address.trim().isEmpty()){
              JOptionPane.showMessageDialog(this, "Adddress is Empty!");
         txtOAdd.grabFocus();
            return;
          }else if(Servrec.trim().isEmpty()){
              JOptionPane.showMessageDialog(this, "ServiceRecord is Empty!");
         txtServrec.grabFocus();
            return;
          }else if(OTelNo.trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "Phone Number  is Empty!");
         txtOTelNo.grabFocus();
            return;
          }else if(String.valueOf(OTelNo).length() != 10){
              JOptionPane.showMessageDialog(this, "Input Valid Telephone Number !");
                        txtOTelNo.grabFocus();
                        return;
          }else if(String.valueOf(Year).length()!=4){
               JOptionPane.showMessageDialog(this, "Input Valid Year !");
                       txtYear.grabFocus();
                        return;
          }else if(String.valueOf(OSSN).length()!=9){
                JOptionPane.showMessageDialog(this, "Input Valid SSN !");
                       txtOSSN.grabFocus();
                       return;
          }else if(String.valueOf(Wyr).length() != 4){
              
          JOptionPane.showMessageDialog(this, "Input Valid Warranty Year !");
                       txtWyr.grabFocus();
                       return;
          }
          else{
                  
               Product p = history.addNewProduct();
                p.setBrand(Brand);
                p.setColor(Color);
                p.setEngineNo(EngineNo);
                p.setLicplate(LicPlate);
                p.setModel(Model);
                p.setOAdd(address);
                p.setODrivlic(ODrivlic);
                p.setOEmailadd(OEmailadd);
                p.setOName(OName);
                p.setOSSN(OSSN);
                p.setOTelNo(OTelNo);
                p.setSeatsNo(seats);
                p.setYear(Year);
                p.setServrec(Servrec);
                p.setWyr(Wyr);
                p.setPhoto(image);
      
          }
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(this, "Put proper Number in Total Seats !");
            txtSeatsNo.grabFocus();
            return;
        }
     
        
    
        
        
//        Product p = history.addNewProduct();
//        p.setBrand(Brand);
//        p.setColor(Color);
//        p.setEngineNo(EngineNo);
//        p.setLicplate(Licplate);
//        p.setModel(Model);
//        
//        p.setOAdd(OAdd);
//        p.setODrivlic(ODrivlic);
//        
//        p.setOEmailadd(OEmailadd);
//        p.setOName(OName);
//        p.setOSSN(OSSN);
//        p.setOTelNo(OTelNo);
//        
//        p.setSeatsNo(SeatsNo);
//        p.setServrec(Servrec);
//        p.setWyr(Wyr);
//        p.setYear(Year);
//        p.setPhoto(image);
          
        JOptionPane.showMessageDialog(this, "New Product added.");
        txtBrand.setText("");
        txtModel.setText("");
        txtColor.setText("");
        txtEngNo.setText("");
        txtLicplate.setText("");
        txtOAdd.setText("");
        txtEmailadd.setText("");
        txtDrivlic.setText("");
        txtOName.setText("");
        txtOSSN.setText("");
        txtOTelNo.setText("");
        
        txtSeatsNo.setText("");
        txtServrec.setText("");
        txtWyr.setText("");
        txtYear.setText("");
        
        
        
        
        /*product.setBrand(txtBrand.getText());
        product.setModel(txtModel.getText());
        product.setColor(txtColor.getText());
        product.setYear(txtYear.getText());
        product.setEngineNo(txtEngNo.getText());
        product.setSeatsNo(txtSeatsNo.getText());
        product.setLicplate(txtLicplate.getText());
        product.setOName(txtOName.getText());
        product.setOTelNo(txtOTelNo.getText());
        product.setOEmailadd(txtEmailadd.getText());
        product.setODrivlic(txtDrivlic.getText());
        product.setOSSN(txtOSSN.getText());
        product.setOAdd(txtOAdd.getText());
        product.setServrec(txtServrec.getText());
        product.setWyr(txtWyr.getText());
        product.setPhoto(txtPhoto.getText());*/
        
        JOptionPane.showMessageDialog(this, "Product Information Saved.");
        
    }//GEN-LAST:event_bttnSaveActionPerformed

    private void btnAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int showOpenDialogue = chooser.showOpenDialog(null);
        
    if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
        File SelectedImageFile = chooser.getSelectedFile();
        ImageIcon ii = new ImageIcon(SelectedImageFile.toString());
        image = ii.getImage().getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),SCALE_DEFAULT);
        jLabel1.setIcon(new ImageIcon(image));
        JOptionPane.showMessageDialog(this,"Image Updated");
    }//GEN-LAST:event_btnAttachActionPerformed
   System.out.println("");
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttach;
    private javax.swing.JButton bttnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblEmailadd;
    private javax.swing.JLabel lblEngNo;
    private javax.swing.JLabel lblLicplate;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblOAdd;
    private javax.swing.JLabel lblODrivlic;
    private javax.swing.JLabel lblOName;
    private javax.swing.JLabel lblOSSN;
    private javax.swing.JLabel lblOTelNo;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSeatsNo;
    private javax.swing.JLabel lblServrec;
    private javax.swing.JLabel lblWyr;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDrivlic;
    private javax.swing.JTextField txtEmailadd;
    private javax.swing.JTextField txtEngNo;
    private javax.swing.JTextField txtLicplate;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtOAdd;
    private javax.swing.JTextField txtOName;
    private javax.swing.JTextField txtOSSN;
    private javax.swing.JTextField txtOTelNo;
    private javax.swing.JTextField txtSeatsNo;
    private javax.swing.JTextField txtServrec;
    private javax.swing.JTextField txtWyr;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    
}
