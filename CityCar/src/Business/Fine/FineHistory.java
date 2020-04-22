/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Fine;

import java.util.ArrayList;

/**
 *
 * @author manishabahranii
 */
public class FineHistory {
    private ArrayList<Fine> fineIncurredhistory;

    public FineHistory() {
        fineIncurredhistory = new ArrayList<>();
    }

    
    
    public ArrayList<Fine> getFineIncurredhistory() {
        return fineIncurredhistory;
    }

    public void setFineIncurredhistory(ArrayList<Fine> fineIncurredhistory) {
        this.fineIncurredhistory = fineIncurredhistory;
    }
    
    
}
