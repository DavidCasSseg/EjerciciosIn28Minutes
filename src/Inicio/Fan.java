package Inicio;

public class Fan {
    private String make = "";
    private double radius;
    private String color;
    private boolean isON;
    private byte speed; //1 to 5

    public Fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

//    public void switchOn(boolean isOn){
//        this.isON = isOn;
//    }

    public void switchOn(){
        this.isON = true;
        changeSpeed((byte)5);
    }

    public void switchOff(){
        this.isON = false;
        changeSpeed((byte)0);
    }

    public void changeSpeed(byte speed){
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Inicio.Fan{" +
                "make='" + make + '\'' +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", isON=" + isON +
                ", speed=" + speed +
                '}';
    }
}
