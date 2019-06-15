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
public class HealthData {
    
    private int bplow;
    private int bphigh;
    private int sugar;
    private int height;
    private double weight;
    private double temperature;
    private double healthScore;
    private Date date;
    
    public HealthData(){
        date = new Date();
    }

    public double getHealthScore() {
        return healthScore;
    }

//    public void setHealthScore(double healthScore) {
//        this.healthScore = healthScore;
//    }

    public int getBplow() {
        return bplow;
    }

    public void setBplow(int bplow) {
        this.bplow = bplow;
    }

    public int getBphigh() {
        return bphigh;
    }

    public void setBphigh(int bphigh) {
        this.bphigh = bphigh;
    }
    
    
    
    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
    public void calculateHealthScore(){
        float random = (float) ((Math.random() * 25.0) + 15.0);
        this.healthScore = (double) random;
    }
    
}
