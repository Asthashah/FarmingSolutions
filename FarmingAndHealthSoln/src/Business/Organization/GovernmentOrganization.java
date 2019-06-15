/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.FarmerRole;
import Business.Roles.GovtRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author sidku
 */
public class GovernmentOrganization extends Organization{

    public GovernmentOrganization() {
        super(Organization.Type.GovernmentOrganisation.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GovtRole());
        return roles;
    }
    
}
