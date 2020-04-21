/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Fine;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author manishabahranii
 */
public class Fine {
    private int fineIncurred;
    private Date date;
    private UserAccount userAccount;

    public int getFineIncurred() {
        return fineIncurred;
    }

    public void setFineIncurred(int fineIncurred) {
        this.fineIncurred = fineIncurred;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    
}
