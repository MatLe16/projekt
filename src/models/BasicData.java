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


/**
sting make
return
 */
public String getMake() {
    return String.valueOf(this.make);


/**
param make
 */
}
public void setMake(String make) {
        this.make = make;
}


/**
string model
return
 */
public String getModel() {
    return String.valueOf(this.model);

}


/**
param model
 */

public void setModel(String model) {
        this.model = model;
}


/**
string model
return
 */
public String getFuel() {
    return String.valueOf(this.fuel);

}


/**
param fuel
 */
public void setFuel(String fuel) {
        this.fuel = fuel;
}


/**
string gearbox
return
 */
public String getGearbox() {
    return String.valueOf(this.gearbox);


/**
param gearbox
 */
}
public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
}


/**
int age
return
 */
public String getAge() {
    return String.valueOf(this.age);
}


/**
param age
 */
public void setAge(String age) {
        this.age = age;
}
    

/**
Void Break Line
 */
public void breakLine() {
        System.out.println("----------------------------");
}


}