/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.FarmerData.SoilData;

/**
 *
 * @author hp
 */
public class SoilTestRequest extends WorkRequest{
    
    private SoilData soildata;

    public SoilData getSoildata() {
        return soildata;
    }

    public void setSoildata(SoilData soildata) {
        this.soildata = soildata;
    }
    
}
