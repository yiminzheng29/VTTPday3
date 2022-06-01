package myapp.core;

public class Honda extends Car {
    
    public Honda() {
        this.setMake("honda");
    }

    public void accelerate() {
        System.out.println("Accelerating...");
    }

    //annotation to prevent you from making mistake in case of override - add @Override
    public void stop(Integer count) {
        System.out.printf("Stopping in %d seconds\n");
    }
}
