/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RideSharing;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author manishabahranii
 */
public class CarListingDirectory {
    private ArrayList<CarListing> carListingDirectory;

    public CarListingDirectory() {
        carListingDirectory = new ArrayList<>();
    }

    public ArrayList<CarListing> getCarListingDirectory() {
        return carListingDirectory;
    }

    public CarListing createCarListing(){
        CarListing carListing = new CarListing();
        carListingDirectory.add(carListing);
        return carListing;
    }

    public void deleteCarlisting(CarListing carListing) {
        carListingDirectory.remove(carListing);
    }
}
