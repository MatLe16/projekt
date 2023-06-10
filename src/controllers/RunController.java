package controllers;

import models.Car;
import models.BasicData;


public class RunController extends BasicData{
    /**
     * Class to run program
     */
    public void run() {
        Car car = new Car();
        System.out.println("Podaj markę auta:");
        car.setMake(String.valueOf(scanner.nextLine()));
        System.out.println("Podaj model auta: ");
        car.setModel = String.valueOf(scanner.nextLine());
        System.out.println("Podaj rodzaj paliwa: ");
        car.setFuel(Integer.parseInt(scanner.nextLine()));
        System.out.println("Podaj rodzaj skrzyni biegów: ");
        car.gearbox = String.valueOf(scanner.nextLine());
        System.out.println("Podaj wiek auta: ");
        car.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println(Arrays.toString(car.CarData()));
        
        }
        this.breakLine();
        System.out.println("Do widzenia");
    }
}