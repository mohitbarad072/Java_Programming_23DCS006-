// using Thread class
class prac32 extends Thread {
    public void run() {
        System.out.println("Hello World");
        System.out.print("\nName : Mohit Barad_23DCS006 ");

    }

    public static void main(String[] args) {
        prac32 thread = new prac32();
        thread.start();
        
    }
}


// using Runnable interface
class prac32 implements Runnable {
     public void run() {
         System.out.println("Hello World");
        System.out.print("\nName : Mohit Barad_23DCS006 ");

     }

     public static void main(String[] args) {
         Thread thread = new Thread(new prac32());
         thread.start();
     }
 }
