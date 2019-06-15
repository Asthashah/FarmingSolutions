/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.ExpertOrganisation.getValue())){
            organization = new ExpertOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FarmerOrganisation.getValue())){
            organization = new FarmerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.DoctorOrganisation.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.GovernmentOrganisation.getValue())){
            organization = new GovernmentOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
