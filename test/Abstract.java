abstract class Bike{                  // abstract class

    public abstract void ride();
    public abstract void sportMode();

    
    public void fillFuel(){
        System.out.println("Fuel indicator");
    }
}
abstract class Splendor extends Bike{      // abstract class
    public void ride(){
        System.out.println("start ride");

    }

}
class AdvancedSplendor extends Splendor{     //concrete class

    public void sportMode(){
        System.out.println("sport Mode started");
    }
}



public class Abstract {
    public static void main (String []args){

        Bike hero=new AdvancedSplendor();
        hero.ride();
        hero.sportMode();   
        hero.fillFuel();

    }
}
