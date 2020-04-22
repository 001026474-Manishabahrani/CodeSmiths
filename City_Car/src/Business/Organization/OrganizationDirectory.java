/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.RideSharingEnterprise;
import java.util.ArrayList;

/**
 *
 * @author CodeSmiths
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
        if (type.getValue().equals(Organization.Type.CarOwner.getValue())){
            organization = new CarOwnerOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Organization.Type.CarRenter.getValue())){
            organization = new CarRenterOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Environment.getValue())){
            organization = new EnvironmentOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
