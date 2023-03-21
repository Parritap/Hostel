package model;

public final class Singleton {

    private static Singleton INSTANCE;
    private String info = "Initial info class";
    private Hostel hostel;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

    public Hostel getHostel() {
        return hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }

    // getters and setters
}