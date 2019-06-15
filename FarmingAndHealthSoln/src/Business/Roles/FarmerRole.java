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
import UserInterface.FarmerRolePanel.FarmerLoginPanel;
import javax.swing.JPanel;
//import userinterface.Farmer.FarmerDetailJPanel;

/**
 *
 * @author admin
 */
public class FarmerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, 
                                    Organization organization, Enterprise enterprise, 
                                    Network network, EcoSystem business) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return new FarmerLoginPanel(container,account, organization, enterprise, network, business);
    }
    
    
    public String toString(){
     return RoleType.FarmerRole.getValue();   
    }
    
}
