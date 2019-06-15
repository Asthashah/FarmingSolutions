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
import UserInterface.AdminRoles.SystemAdminPanelForm;
//import UserInterface.SystemAdminPanelForm_2;
import javax.swing.JPanel;
//import userinterface.SystemAdminWorkArea.systemAdminWorkAreaJPanel;

/**
 *
 * @author admin
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, 
                                    Organization organization, Enterprise enterprise, 
                                    Network network, EcoSystem business) {
       return new SystemAdminPanelForm(container, business);
    }
    
}
