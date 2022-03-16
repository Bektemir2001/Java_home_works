

public class HomeWork_1{
    public static void main(String[] args){
        Planet Mars = new Planet();
        Mars.isThereLife();
        Mars.howMuchDoesItWeigh();
        Mars.freeFallSpeed();

        System.out.println();

        Planet Saturn = new Planet("Saturn", 54364000, 690);
        Saturn.isThereLife();
        Saturn.howMuchDoesItWeigh();
        Saturn.freeFallSpeed();

        System.out.println();
        
        Planet Earth = new Planet("Earth", 6356000, 5520, true, true);
        Earth.isThereLife();
        Earth.howMuchDoesItWeigh();
        Earth.freeFallSpeed();
    }
}