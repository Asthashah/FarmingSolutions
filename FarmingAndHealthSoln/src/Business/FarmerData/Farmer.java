/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FarmerData;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Farmer {
    
    private ArrayList<SoilData> soilDataList;
    private ArrayList<HealthData> healthDataList;

    public Farmer() {
        soilDataList = new ArrayList<SoilData>();
        healthDataList = new ArrayList<HealthData>();
    }

    public ArrayList<HealthData> getHealthDataList() {
        return healthDataList;
    }
    
    public ArrayList<SoilData> getSoilDataList() {
        return soilDataList;
    }
    
    public SoilData addSoilData(){
        SoilData sd = new SoilData();
        soilDataList.add(sd);
        return sd;
    }
    
    public HealthData addHealthData(){
        HealthData hd = new HealthData();
        healthDataList.add(hd);
        return hd;
    }
    

}
