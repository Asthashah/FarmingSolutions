/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.FarmerData.Farmer;
import Business.Roles.Role;
import java.util.HashSet;
import Business.Roles.FarmerRole;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class FarmerOrganization extends Organization {
    
//    private ArrayList<Farmer> farmerDirectory;
    
    public FarmerOrganization() {
        super(Organization.Type.FarmerOrganisation.getValue());
//        farmerDirectory = new ArrayList<Farmer>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FarmerRole());
        return roles;
    }

//    public ArrayList<Farmer> getFarmerDirectory() {
//        return farmerDirectory;
//    }
    
//    public Farmer addFarmer(){
//        Farmer farmer = new Farmer();
//        farmerDirectory.add(farmer);
//        return farmer;
//    }
    
}
