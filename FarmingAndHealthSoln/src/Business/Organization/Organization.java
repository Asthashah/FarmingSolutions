/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Person.PersonDirectory;
import Business.Roles.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    public HashSet<Role> roles;
    
    public enum Type{
        FarmerOrganisation("FarmerOrganisation"),
        ExpertOrganisation("ExpertOrganisation"), 
        DoctorOrganisation("DoctorOrganisation"),
        GovernmentOrganisation("GovernmentOrganisation");

        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        roles = new HashSet<>();
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
