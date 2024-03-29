public class Restaurant implements Runnable{
    
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodnumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try{
                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }   
    }
    
    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber() {
        return foodnumber;
    }

    public static Object getLock() {
        return lock;
    }

    public void makeFood() {
        synchronized(Restaurant.lock) {

            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: Waiting for the Waiter to deliver the food");
                    Restaurant.lock.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            waitingForPickup = true;
            System.out.println("Restaurant: Making Food Number " + foodnumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Telling the waiter to get the coffee \n");
        }
    }
}

