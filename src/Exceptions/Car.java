package Exceptions;

import java.util.Random;
import Exceptions.exceptions.CarException;

public class Car {
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void StartEngine() throws CarException, Exception{

        Random r = new Random();
        if(r.nextBoolean()){
            throw new CarException("Car has problem starting");
        }
        engine.Start();
    }
 
    public Engine getEngine() {
        return engine;
    }
}
