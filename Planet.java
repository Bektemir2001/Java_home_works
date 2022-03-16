

public class Planet{
    public String name;
    public double radius;
    public double density;
    public boolean woter = false;
    public boolean oxygen = false;
    
    private double weigh;

    public Planet(){
        this.name = "Mars";
        this.radius = 3389500;
        this.density = 3933.5;
    }

    public Planet(String name, double radius, double density){
        this.name = name;
        this.radius = radius;
        this.density = density;
    }

    public Planet(String name, double radius, double density, boolean water, boolean oxygen){
        this.name = name;
        this.radius = radius;
        this.density = density;
        this.woter = water;
        this.oxygen = oxygen;
    }
    public void isThereLife(){
        if (woter && oxygen || name == "Earth") {
            System.out.println("There is life on " + name);
        }
        System.out.println("There is no life on " + name);
    } 
    public void howMuchDoesItWeigh(){
        double p = 3.14;
        weigh = (4*p*Math.pow(radius, 3)/300000000)*density/10000000;
        System.out.println(name + " weighs: " + weigh/100000000 + "* 10^23 kg");
    }

    public void freeFallSpeed(){
        double g;
        double G = 6.67;
        g = G*(weigh/Math.pow(radius, 2))*10000;
        System.out.println("Free fall speed in " + name + " = " + g + "m/s^2");
    }
}