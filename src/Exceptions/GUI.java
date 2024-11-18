package Exceptions;

import Exceptions.exceptions.CarException;
import Exceptions.exceptions.EngineException;

public class GUI {
    public static void main(String[] args) throws Exception {
        Engine e1 = new Engine(true);
        Car c1 = new Car(e1); 
        
        try {
            c1.StartEngine();
        } catch (EngineException e) {
            System.out.println("Engine exception: " + e.getMessage());
        } catch (CarException e) {
            System.out.println("Car exception: " + e.getMessage());
        }  
    }
}
