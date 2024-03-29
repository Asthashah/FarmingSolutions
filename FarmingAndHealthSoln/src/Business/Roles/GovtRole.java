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
import UserInterface.GovtRolePanel.GovernmentOfficialJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sidku
 */
public class GovtRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new GovernmentOfficialJPanel(userProcessContainer, account, organization, enterprise, network, business);
    }
    
    public String toString(){
     return RoleType.GovernmentRole.getValue();   
    }
    
}
