/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Fine.FineHistory;
import Business.Role.EnvironmentRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author manishabahranii
 */
public class EnvironmentOrganization extends Organization{
    
    private FineHistory fineHistory;

    
     public EnvironmentOrganization() {
        super(Organization.Type.Environment.getValue());
        fineHistory = new FineHistory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EnvironmentRole());
        return roles;
    }

    public FineHistory getFineHistory() {
        return fineHistory;
    }

    public void setFineHistory(FineHistory fineHistory) {
        this.fineHistory = fineHistory;
    }
}
