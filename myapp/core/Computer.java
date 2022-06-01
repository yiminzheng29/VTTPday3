package myapp.core;

public class Computer implements Controllable{ //Can implement more than 1 interface

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Starting computer");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Stopping computer");
    }
    
}
