/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.FarmerData.HealthData;

/**
 *
 * @author hp
 */
public class HealthReportRequest extends WorkRequest{
    private HealthData healthdata;

    public HealthData getHealthdata() {
        return healthdata;
    }

    public void setHealthdata(HealthData healthdata) {
        this.healthdata = healthdata;
    }
   
}
