package myapp.core;

// Class
public class Car implements Controllable {

    // properties, members
    private String colour;
    protected String make;
    private Integer engineCapacity;
    private Boolean started = false;
    public long startedSince;
    
    // Default constructor
    public Car() {
        System.out.println("*** Instantiating Car object");
        this.colour = "red";
    }

    public Car(Integer capacity) {
        this.engineCapacity = capacity;
    }

    public Car(String colour, String make) {
        this.colour = colour;
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setEngineCapacity(Integer capacity) {
        this.engineCapacity = capacity;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public Boolean isStarted() {
        return started;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public long getDrivingDuration() {
        if (this.isStarted())
            // Convert ms -> sec
            return (System.currentTimeMillis() - this.startedSince) / 1000;
        return (long)-1;
    }

    // To set the color
    public void setColour(String c) {
        this.colour = c; // to stop a person from changing color to red:[ADD -->] if (!colour.equals("red"))

    }

    // Get and set comes together
    public String getColour() {
        return this.colour;
    }

    // behaviour
    public void start() {

        if (this.started) {
            System.out.println("Your car is running");

        }
        else {
            System.out.println("Vroom.......");
            this.started=true;
            // Since 0000 Jan 1 1970
            this.startedSince= System.currentTimeMillis();
        }
    }
    public void stop() {
        if (!this.started) {
            System.out.println("Your car is not running");
        }
        else {
            System.out.println("Splutter splutter stop.....");
            this.started=false;
        }
    }   
}
