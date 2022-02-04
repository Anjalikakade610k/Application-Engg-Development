 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;

/**
 *
 * @author anjalikakade
 */
public class Product {
    private String Brand;
    private String Model;
    private String Color;
    private String Year;
    private String EngineNo;
    private String SeatsNo;
    private String Licplate;
    private String OName;
    private String OTelNo;
    private String OEmailadd;
    private String ODrivlic;
    private String OSSN;
    private String OAdd;
    private String Servrec;
    private String Wyr;
    private Image Photo;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getEngineNo() {
        return EngineNo;
    }

    public void setEngineNo(String EngineNo) {
        this.EngineNo = EngineNo;
    }

    public String getSeatsNo() {
        return SeatsNo;
    }

    public void setSeatsNo(String SeatsNo) {
        this.SeatsNo = SeatsNo;
    }

    public String getLicplate() {
        return Licplate;
    }

    public void setLicplate(String Licplate) {
        this.Licplate = Licplate;
    }

    public String getOName() {
        return OName;
    }

    public void setOName(String OName) {
        this.OName = OName;
    }

    public String getOTelNo() {
        return OTelNo;
    }

    public void setOTelNo(String OTelNo) {
        this.OTelNo = OTelNo;
    }

    public String getOEmailadd() {
        return OEmailadd;
    }

    public void setOEmailadd(String OEmailadd) {
        this.OEmailadd = OEmailadd;
    }

    public String getODrivlic() {
        return ODrivlic;
    }

    public void setODrivlic(String ODrivlic) {
        this.ODrivlic = ODrivlic;
    }

    public String getOSSN() {
        return OSSN;
    }

    public void setOSSN(String OSSN) {
        this.OSSN = OSSN;
    }

    public String getOAdd() {
        return OAdd;
    }

    public void setOAdd(String OAdd) {
        this.OAdd = OAdd;
    }

    public String getServrec() {
        return Servrec;
    }

    public void setServrec(String Servrec) {
        this.Servrec = Servrec;
    }

    public String getWyr() {
        return Wyr;
    }

    public void setWyr(String Wyr) {
        this.Wyr = Wyr;
    }

    public Image getPhoto() {
        return Photo;
    }

    public void setPhoto(Image Photo) {
        this.Photo = Photo;
    }

    
    
    @Override
    public String toString(){
        return OName;
    }
    
}
