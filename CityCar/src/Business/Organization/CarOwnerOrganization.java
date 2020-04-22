/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.RideSharing.CarListingDirectory;
import Business.Role.CarOwnerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author manishabahranii
 */
public class CarOwnerOrganization extends Organization {
    
    private CarListingDirectory carListingDirectory;
    
    public CarOwnerOrganization() {
        super(Organization.Type.CarOwner.getValue());
        carListingDirectory = new CarListingDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CarOwnerRole());
        return roles;
    }

    public CarListingDirectory getCarListingDirectory() {
        return carListingDirectory;
    }

    public void setCarListingDirectory(CarListingDirectory carListingDirectory) {
        this.carListingDirectory = carListingDirectory;
    }

   
    
}
