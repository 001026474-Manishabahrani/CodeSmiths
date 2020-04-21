/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.RideSharing.CarListing;
import java.util.Date;

/**
 *
 * @author manishabahranii
 */
public class EnvironmentWorkRequest extends WorkRequest {
    private CarListing carListing;
    private Date alertDate;
    private int fine;
    private String rewards = "$$-Rewards-$$";

    public CarListing getCarListing() {
        return carListing;
    }

    public void setCarListing(CarListing carListing) {
        this.carListing = carListing;
    }

    public Date getAlertDate() {
        return alertDate;
    }

    public void setAlertDate(Date alertDate) {
        this.alertDate = alertDate;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public String getRewards() {
        return rewards;
    }

    public void setRewards(String rewards) {
        this.rewards = rewards;
    }
    
}
