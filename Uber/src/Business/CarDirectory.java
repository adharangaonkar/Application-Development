/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author CCM
 */
public class CarDirectory {
    
    private ArrayList<Car> carList;
   // private CarDirectory carList; 
    private ArrayList<Car> secList;
    
    public CarDirectory(){
        this.carList = new ArrayList<Car>();
        
        carList = new ArrayList<>();
     
        Car car1 = new Car(true, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true);
        Car car2 = new Car(true, "BMW", 2019, 1, 4, 2, "X1", "New York", true);
        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true);
        Car car4 = new Car(true, "GM", 2018, 1, 4, 4, "G1", "New York", true);
        Car car5 = new Car(true, "Toyota", 2017, 1, 4, 5, "T2", "Chicago", true);
        Car car6 = new Car(true, "GM", 2017, 1, 4, 6, "G2", "Chicago", true);
        Car car7 = new Car(true, "Ferrari", 2016, 1, 4, 7, "A", "Seattle", true);
        Car car8 = new Car(true, "BMW", 2016, 1, 4, 8, "X2", "Seattle", true);
        Car car9 = new Car(true, "Toyota", 2019, 1, 4, 9, "T3", "Austin", true);
        Car car10 = new Car(true, "GM", 2019, 1, 4, 10, "G3", "Austin", true);
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        return;
        
        
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    public Car addCar(){
        Car car = new Car();
        carList.add(car);
        return car;
    }
    public void deleteAccount(Car car){
        carList.remove(car);
    }
  
    
    public ArrayList<Car>searchBrand (String brand, ArrayList<Car> search){
        secList = new ArrayList<Car>();
        for (Car car : search){
            if(car.getBrand().equalsIgnoreCase(brand)){
                secList.add(car);
            }
        }
        return secList;
    }
    public ArrayList<Car>searchMakeYear(String makeYear, ArrayList<Car> search){
        secList = new ArrayList<Car>();
        for (Car car : search){
            if(car.getMakeYear() == Integer.parseInt(makeYear)){
                secList.add(car);
            }
        }
    
    return secList;
    }
    public ArrayList<Car>searchMinSeats(String minSeats, ArrayList<Car> search){
        secList = new ArrayList<Car>();
        for (Car car : search){
            if(car.getMinSeats() == Integer.parseInt(minSeats)){
                secList.add(car);
            }
        }
    
    return secList;
    }
    public ArrayList<Car>searchMaxSeats(String maxSeats, ArrayList<Car> search){
        secList = new ArrayList<Car>();
        for (Car car : search){
            if(car.getMaxSeats() == Integer.parseInt(maxSeats)){
                secList.add(car);
            }
        }
    
    return secList;
    }
    public ArrayList<Car>searchSerialNum(String serialNum, ArrayList<Car> search){
        secList = new ArrayList<Car>();
        for (Car car : search){
            if(car.getSerialNum() == Integer.parseInt(serialNum)){
                secList.add(car);
            }
        }
    
    return secList;
    }
    public ArrayList<Car>searchModel (String model, ArrayList<Car> search){
        secList = new ArrayList<Car>();
        for (Car car : search){
            if(car.getModel().equalsIgnoreCase(model)){
                secList.add(car);
            }
        }
        return secList;
    }
    public ArrayList<Car>searchAvialableCity (String avialableCity, ArrayList<Car> search){
        secList = new ArrayList<Car>();
        for (Car car : search){
            if(car.getAvialableCity().equalsIgnoreCase(avialableCity)){
                secList.add(car);
            }
        }
        return secList;
    }
    public ArrayList<Car>searchMaintenanceCert (String maintenanceCert, ArrayList<Car> search){
        secList = new ArrayList<Car>();
        for (Car car : search){
            if(car.isMaintenanceCert() == Boolean.parseBoolean(maintenanceCert)){
                secList.add(car);
            }
        }
        return secList;
    }
    public ArrayList<Car>searchAvailabilty (String availabilty, ArrayList<Car> search){
        secList = new ArrayList<Car>();
        for (Car car : search){
            if(car.isAvailabilty() == Boolean.parseBoolean(availabilty)){
                secList.add(car);
            }
        }
        return secList;
    }
    public ArrayList<Car> searchMinMax (int min, int max, ArrayList<Car> search){
        secList = new ArrayList<Car>();
        for (Car car : search){
            if(car.getMaxSeats()<= max && car.getMinSeats()>=min){
            secList.add(car);
            }
        }
        return secList;
    }
    public ArrayList<Car> searchFirstCar (String firstCar, ArrayList<Car> search){
        secList = new ArrayList<Car>();
        for (Car car : search){
            if(car.isAvailabilty()== true){
                secList.add(car);
                break;
            }
        }
        return secList;
    }
    
}
