/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RideSharing;

import Business.Employee.Employee;
import Business.WorkQueue.RideShareWorkRequest;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author manishabahranii
 */
public class CarListing {
    private String carModel;
    private String carType;
    private int carRent;
    private String Address;
    private String onOffmarket = "OffMarket";
    private Employee carOwner;
    private ImageIcon carImage;
    private ImageIcon location;
    private Date lastPollution;
    
    public Employee getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(Employee carOwner) {
        this.carOwner = carOwner;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getCarRent() {
        return carRent;
    }

    public void setCarRent(int carRent) {
        this.carRent = carRent;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getOnOffmarket() {
        return onOffmarket;
    }

    public void setOnOffmarket(String onOffmarket) {
        this.onOffmarket = onOffmarket;
    }

    @Override
    public String toString() {
        return carModel;
    }

    public ImageIcon getCarImage() {
        return carImage;
    }

    public void setCarImage(ImageIcon carImage) {
        this.carImage = carImage;
    }

    public ImageIcon getLocation() {
        return location;
    }

    public void setLocation(ImageIcon location) {
        this.location = location;
    }

    public Date getLastPollution() {
        return lastPollution;
    }

    public void setLastPollution(Date lastPollution) {
        this.lastPollution = lastPollution;
    }

}