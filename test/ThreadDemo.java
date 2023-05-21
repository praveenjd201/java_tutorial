// class A implements Runnable{
//     public void run(){
        
//         for(int i=0;i<5;i++){
//             System.out.println("hi");
//             try {
//                 Thread.sleep(20);
//             } catch (InterruptedException e) { e.printStackTrace();}
//         }
        
//     }
// }

// class B implements Runnable{
//     public void run(){
        
//         for(int i=0;i<5;i++){
//             System.out.println("hello");
//              try {
//                 Thread.sleep(20);
//             } catch (InterruptedException e) { e.printStackTrace();}
//         }
        
//     }
// }


public class ThreadDemo {
    public static void main(String[] args) {
        Runnable obj1= () -> {         // annonyms inner class and lamda expressio
                for(int i=0;i<5;i++){
                    System.out.println("Poda");
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) { e.printStackTrace();}
                }                         
        };

        Runnable obj2= () -> {  // annonyms inner class and lamda expressio
                for(int i=0;i<5;i++){
                    System.out.println("punda.........");
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) {e.printStackTrace();}
                }
        };

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);
        
        t1.start();
        try {
                Thread.sleep(5);
            } catch (InterruptedException e) { e.printStackTrace();}
        t2.start();

        
    }
}
