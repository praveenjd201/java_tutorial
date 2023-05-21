interface Cab{
    void drive();
    
}
class Bus implements Cab{
    public void drive(){
        System.out.println("iam ready to drive volvo bus");
    }
}

class Car implements Cab{
    public void drive(){
        System.out.println("iam ready to drive Hyundai car");
    }
}

class Driver{
    public void drive(Cab car1){
        car1.drive();
    }
}

public class Interface {
    public static void main(String[] args) {
        
        Cab bus= new Bus();
        Cab car= new Car();
        Driver praveen=new Driver();
        Driver ajith=new Driver();
        praveen.drive(bus);
        ajith.drive(car);
    }
}
