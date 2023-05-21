 class Lenovo {

    String model;
    int price;

   
    public String toString() {
        return "Lenovo [model=" + model + ", price=" + price + "]";
    }
    


    



    
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }



    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lenovo other = (Lenovo) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}




public class Demo {
    public static void main (String [] args){
        Lenovo obj1=new Lenovo();
        obj1.model="e-15";
        obj1.price=1000;

        Lenovo obj2=new Lenovo();
        obj2.model="e-15";
        obj2.price=1000;

        Boolean flag;

        System.out.println(obj2);
        flag=obj1.equals(obj2);
        System.out.println(flag);



             

        // obj2.show1();
        // flag=obj1.flag(obj2);
        // System.out.println(flag);

        // // System.out.println(obj1);
        // // System.out.println(obj2);



       
        
        
        

        

    }
}
