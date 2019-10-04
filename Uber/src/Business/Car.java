/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author CCM
 */
public class Car {
    private boolean availabilty;
    private String brand;
    private int makeYear;
    private int minSeats;
    private int maxSeats;
    private int serialNum;
    private String model;
    private String avialableCity;
    private boolean maintenanceCert;

    Car(boolean availabilty,String brand,int makeYear, int minSeats, int maxSeats, int serialNum, String model, String avialableCity, boolean maintenanceCert) {
        
        this.availabilty = availabilty;
        this.brand = brand;
        this.makeYear = makeYear;
        this.minSeats = minSeats;
        this.maxSeats = maxSeats;
        this.serialNum = serialNum;
        this.model = model;
        this.avialableCity = avialableCity;
        this.maintenanceCert = maintenanceCert;
    }

   /* Car() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    Car() {
      
    }
    

        
    public boolean isAvailabilty() {
        return availabilty;
    }

    public void setAvailabilty(boolean availabilty) {
        this.availabilty = availabilty;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public int getMinSeats() {
        return minSeats;
    }

    public void setMinSeats(int minSeats) {
        this.minSeats = minSeats;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAvialableCity() {
        return avialableCity;
    }

    public void setAvialableCity(String avialableCity) {
        this.avialableCity = avialableCity;
    }

    public boolean isMaintenanceCert() {
        return maintenanceCert;
    }

    public void setMaintenanceCert(boolean maintenanceCert) {
        this.maintenanceCert = maintenanceCert;
    }
    
    @Override
    public String toString(){
        return brand;
    }   
    
    
}
