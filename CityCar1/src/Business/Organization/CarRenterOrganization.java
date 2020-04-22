/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CarRenterRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author CodeSmiths
 */
public class CarRenterOrganization extends Organization{
    
     public CarRenterOrganization() {
        super(Organization.Type.CarRenter.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CarRenterRole());
        return roles;
    }

   
}
