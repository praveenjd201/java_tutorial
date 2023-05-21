

// enum Check{
//     Running,Failed,Pending,Success;
// }
enum Laptop{
    Windows,Surface,Xps,Macbook;
    private int price;

    private Laptop(){
        price=40000;

    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}



public class Enum {
    public static void main(String[] args) {
        Laptop lap1=Laptop.Windows;
        Laptop lap2=Laptop.Surface;
        Laptop lap3=Laptop.Xps;
        Laptop lap4=Laptop.Macbook;
        lap2.setPrice(50000);
        lap3.setPrice(65000);
        lap4.setPrice(80000);

        System.out.println(lap1.name() + " :"+ lap1.getPrice());
        System.out.println(lap2.name() + " :"+ lap2.getPrice());
        System.out.println(lap3.name() + " :"+ lap3.getPrice());
        System.out.println(lap4.name() + " :"+ lap4.getPrice());



        // for(Laptop l : lap){
        //     System.out.println(l+ " " + l.ordinal());
        // }









        // response [] r=response.values();
        // Check c=Check.Running;
        

        // for(resoponse i:r){
        //     System.out.println(i +":"+ i.ordinal());

        // }
        // System.out.println(c);

        // switch(c){
        //     case Running:
        //         System.out.println("All good" + c.ordinal());
        //         break;

        //     case Failed:
        //         System.out.println("Please Try Again");
        //         break;
            
        //     case Pending:
        //         System.out.println("Please Wait....");
        //         break;
            
        //     default:
        //         System.out.println("Done...");
        //         break;


        // }


        // if (c == Check.Running)
        //     System.out.println("All good");
        // else if(c == Check.Failed)
        //     System.out.println("Please Try Again");
        // else if(c == Check.Pending)
        //     System.out.println("Please wait");            
        // else
        //     System.out.println("done");
       

            


        

    }
}
