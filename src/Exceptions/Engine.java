package Exceptions;

import Exceptions.exceptions.EngineException;

public class Engine {
    private boolean hasError;
    
    public Engine(boolean hasError){
        this.hasError = hasError;
    }

    public void Start() throws EngineException
    {
        System.out.println("Started Engine...");
        if(hasError){
            throw new EngineException("Engine error"); 
        }

    }


}