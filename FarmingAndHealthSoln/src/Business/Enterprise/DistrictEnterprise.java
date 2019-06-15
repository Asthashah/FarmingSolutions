/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class DistrictEnterprise extends Enterprise{
    
    public DistrictEnterprise(String name) {
        super(name, EnterpriseType.District);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }
    
    public String toString(){
        return this.getName();
    }
    
}
