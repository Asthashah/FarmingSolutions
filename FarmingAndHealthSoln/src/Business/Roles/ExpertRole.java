/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.ExpertRolePanel.AgriculturalExpert;
import javax.swing.JPanel;
//import userinterface.Expert.ExpertJPanel;

/**
 *
 * @author admin
 */
public class ExpertRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, 
                                    Organization organization, Enterprise enterprise, 
                                    Network network, EcoSystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new AgriculturalExpert(container,account,organization,enterprise,business);
    }
    
    public String toString(){
     return RoleType.ExpertRole.getValue();   
    }
    
}
