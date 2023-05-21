class A{
    int count;
    public synchronized void show(){
        count++;
    }

}


public class ThreadMutable {
        public static void  main(String []args) throws InterruptedException{
            A count=new A();
        Runnable obj1=  new Runnable() {
            public void run(){
                for(int i=0;i<10000;i++){
                    count.show();
                    
                }
            }
        };
        
        Runnable obj2=  new Runnable() {
            public void run(){
                for(int i=0;i<10000;i++){
                    count.show();
                }
            }
        };

        Thread t1= new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.count);
    }    
}
