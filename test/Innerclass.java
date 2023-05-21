class Pen{
    public void brand(){
        System.out.println("cello");
    }

    static class Ink{
        public void color(){
            System.out.println("blue");
        }

    }
}


public class Innerclass {

    public static void main(String[] args) {

        Pen obj=new Pen()
        {
            public void brand(){
                System.out.println("reynolds");
            }         

        };              // annonyms inner class
        obj.brand();
        
        Pen.Ink obj1=new Pen.Ink();
        obj1.color();
    }
    
}
