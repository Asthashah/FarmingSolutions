/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FarmerData;

import java.util.Date;

/**
 *
 * @author hp
 */
public class SoilData {
    
    private double nitroValue;
    private double potassiumValue;
    private double phosphorValue;
    private double waterValue;
    private double acidity;
    private Date date;
    private String IsSoilScore;
    private String typeOfLand;
    private String cropPlanted;
    private String fertiliserType;
    private String technologyUsed;
    private double monthlyincome;
    
    private double soilScore;
    
    public SoilData(){
        date = new Date();
    }

    public String getIsSoilScore() {
        return IsSoilScore;
    }

    public void setIsSoilScore(String IsSoilScore) {
        this.IsSoilScore = IsSoilScore;
    }
    
    public String getTypeOfLand() {
        return typeOfLand;
    }

    public void setTypeOfLand(String typeOfLand) {
        this.typeOfLand = typeOfLand;
    }

    public String getCropPlanted() {
        return cropPlanted;
    }

    public void setCropPlanted(String cropPlanted) {
        this.cropPlanted = cropPlanted;
    }

    public String getFertiliserType() {
        return fertiliserType;
    }

    public void setFertiliserType(String fertiliserType) {
        this.fertiliserType = fertiliserType;
    }

    public String getTechnologyUsed() {
        return technologyUsed;
    }

    public void setTechnologyUsed(String technologyUsed) {
        this.technologyUsed = technologyUsed;
    }

    public double getMonthlyincome() {
        return monthlyincome;
    }

    public void setMonthlyincome(double monthlyincome) {
        this.monthlyincome = monthlyincome;
    }
       
    public double getNitroValue() {
        return nitroValue;
    }

    public void setNitroValue(double nitroValue) {
        this.nitroValue = nitroValue;
    }

    public double getPotassiumValue() {
        return potassiumValue;
    }

    public void setPotassiumValue(double potassiumValue) {
        this.potassiumValue = potassiumValue;
    }

    public double getPhosphorValue() {
        return phosphorValue;
    }

    public void setPhosphorValue(double phosphorValue) {
        this.phosphorValue = phosphorValue;
    }

    public double getWaterValue() {
        return waterValue;
    }

    public void setWaterValue(double waterValue) {
        this.waterValue = waterValue;
    }

    public double getAcidity() {
        return acidity;
    }

    public void setAcidity(double acidity) {
        this.acidity = acidity;
    }

    public double getSoilScore() {
        return soilScore;
    }
    
    public void calculateSoilScore(){
        soilScore = (double)(Math.random() * 10.0 + 0.0);
    }   

    public void setSoilScore(double soilScore) {
        this.soilScore = soilScore;
    }
    
    public Date getDate() {
        return date;
    }

    public String toString(){
        return String.valueOf(soilScore);
    }
}
