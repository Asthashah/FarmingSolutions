/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Roles.ExpertRole;
import Business.Roles.Role;
import static Business.Roles.Role.RoleType.ExpertRole;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class ExpertOrganization extends Organization{

    public ExpertOrganization() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        super(Organization.Type.ExpertOrganisation.getValue());
    }

   @Override
    public ArrayList<Role> getSupportedRole() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ExpertRole());
        return roles;
    }
    
}
