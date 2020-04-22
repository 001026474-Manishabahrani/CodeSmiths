/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Fine.FineHistory;
import Business.RideSharing.CarListingDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author CodeSmiths
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
//    private FineHistory fineHistory;

    
    public enum Type{
        Admin("Admin Organization"),
        Environment("Environment Organization"),
        CarOwner("Car Owner Organization"),
        CarRenter("Car Renter Organization");
        
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
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
//        carListingDirectory = new CarListingDirectory();
//        fineHistory = new FineHistory();
        
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
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
   
    
//    public FineHistory getFineHistory() {
//        return fineHistory;
//    }
//
//    public void setFineHistory(FineHistory fineHistory) {
//        this.fineHistory = fineHistory;
//    }
    
    
//     public CarListingDirectory getCarListingDirectory() {
//        return carListingDirectory;
//    }
//
//    public void setCarListingDirectory(CarListingDirectory carListingDirectory) {
//        this.carListingDirectory = carListingDirectory;
//    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
