/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.FarmerData.Farmer;

/**
 *
 * @author raunak
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private String SSN;
    private int age;
    private Farmer farmer;
    private int id;
    private static int count = 1;

    public Person() {
        id = count;
        count++;
        farmer=new Farmer();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Farmer getFarmer() {
        return farmer;
    }

    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }
    
    @Override
    public String toString() {
        return firstName+" "+lastName;
    }
    
    
}
