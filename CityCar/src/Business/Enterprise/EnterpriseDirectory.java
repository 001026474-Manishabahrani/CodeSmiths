/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author manishabahranii
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.RideSharing){
            enterprise = new RideSharingEnterprise(name);
            enterpriseList.add(enterprise);
        }
//        if (type == Enterprise.EnterpriseType.Environment){
//            enterprise = new EnvironmentEnterprise(name);
//            enterpriseList.add(enterprise);
//        }
        
        return enterprise;
    }
    
}
