public class Singleton {
     
     
     private Singleton(){

     }

     private static Singleton instance;

     public static Singleton getInstance(){
          // check wheter only 1 objet is creted or not
          if (instance == null){
               instance=new Singleton();
          }
          return instance;          

     }

     

    
}
