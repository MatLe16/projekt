package models;

/** 
Abstract class Basic Data
 */
public abstract class BasicData{

/** zmienne */
public String make;
public String model;
public String fuel;
public String gearbox;
public Int age;


public String getMake() {
    return String.valueOf(this.make);

}
 public void setMake(String make) {
        this.make = make;
    }





public String getModel() {
    return String.valueOf(this.model);

}

 public void setModel(String model) {
        this.model = model;
    }






public String getFuel() {
    return String.valueOf(this.fuel);

}
 public void setFuel(String fuel) {
        this.fuel = fuel;
    }




public String getGearbox() {
    return String.valueOf(this.gearbox);

}
 public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }






public String getAge() {
    return String.valueOf(this.age);
}
 public void setAge(String age) {
        this.age = age;
    }
    

public void breakLine() {
        System.out.println("----------------------------");
    }


}