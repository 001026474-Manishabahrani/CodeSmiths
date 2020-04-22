/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.RideSharing.CarListing;
import Business.RideSharing.CarListingDirectory;
import java.util.Date;

/**
 *
 * @author CodeSmiths
 */

public class RideShareWorkRequest extends WorkRequest {
    private CarListing carListing;
    private Date carHiredDate; //date on which car is hired
    private Date carReturnedDate; //date on which car is returned
    private int greenPoints;
    private int moneyEarned;

    public CarListing getCarListing() {
        return carListing;
    }

    public void setCarListing(CarListing carListing) {
        this.carListing = carListing;
    }

    public Date getCarHiredDate() {
        return carHiredDate;
    }

    public void setCarHiredDate(Date carHiredDate) {
        this.carHiredDate = carHiredDate;
    }

    public Date getCarReturnedDate() {
        return carReturnedDate;
    }

    public void setCarReturnedDate(Date carReturnedDate) {
        this.carReturnedDate = carReturnedDate;
    }

    public int getGreenPoints() {
        return greenPoints;
    }

    public void setGreenPoints(int greenPoints) {
        this.greenPoints = greenPoints;
    }

    public long calculateTimeDifference(){
        long hiredTime = carHiredDate.getTime();
        long returnTime = carReturnedDate.getTime();
        long diffe = returnTime - hiredTime;
        long diffeMin = diffe/3600;// / (60 * 1000) % 60;
        
//        System.out.println(diffeMin);
        return diffeMin;
    }
       
    public long calculateGreenPoints(){
        long z = calculateTimeDifference();
        long pts = z /6;
//        System.out.println(pts);
        return pts;
    }

    public int getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(int moneyEarned) {
        this.moneyEarned = moneyEarned;
    }
    
}
