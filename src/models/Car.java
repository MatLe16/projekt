package models;

import interfaces.BasicInterface;
import interfaces.CarInterface;

public class Car extends BasicData implements BasicInterface, PersonInterface {

    /**
     * String[] returned with set properties
     * @return
     */
    public String[] CarData() {
        return new String[]{
                "make: " + this.getMake(),
                "model: " + this.getModel(),
                "fuel: " + this.getFuel(),
                "gearbox: " + this.getGearbox(),
                "age: " + this.getAge(),
        };
    }

    /**
     *
     * @param make
     */
    @Override
    public void welcome(String make) {
        System.out.println("This is your car" + make);
    }
}