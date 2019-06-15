package Business;


import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Roles.Role;
import Business.Roles.SystemAdminRole;
import Business.UserAccount.UserAccount;
import com.db4o.collections.ActivatableArrayList;
//import Business.Role.Role;
//import Business.Role.SystemAdminRole;
//import Business.Vaccine.VaccineCatalog;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Aastha
 */
public class EcoSystem extends Organization  {

   
   // private ArrayList<Network> networkList;
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
          
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network addNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public boolean checkNetworkName(String netname){
        for(Network network : networkList){
            if(network.getName().equalsIgnoreCase(netname)){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @return
     */
      public boolean checkIfUsernameIsUnique(String username) {

      //  if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
             for (Network network : this.getNetworkList()) {
                 
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                        if(ua.getUsername().equals(username)){
                            return false;
                        }
                    }
                    
                    
                    
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                         
                        
                        for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                                 if(ua.getUsername().equals(username)){
                        
                                     
                                   return false;
                        }
                    }
                            }
                        }
                    }
            
      //  }

       

        return true;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
//        roles.add(new SystemAdminRole());
        return roles;
    }

    
    
}