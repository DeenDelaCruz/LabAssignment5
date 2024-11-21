public class HelpDesk {
    private static HelpDesk instance;
    private int customerCounter = 0;

    private HelpDesk() {}


    public static HelpDesk getInstance() {
        if (instance == null) {
            synchronized (HelpDesk.class) {
                if (instance == null) {
                    instance = new HelpDesk();
                }
            }
        }
        return instance;
    }

    public synchronized void logCustomerCount() {
        System.out.println("Total Assisted Customers: " + customerCounter);
    }

    public synchronized void serveCustomer(String deskName) {
        customerCounter++;
        System.out.println("Now Serving Customer #" + customerCounter + " at " + deskName);
    }

    public synchronized void resetCounter(int value) {
        customerCounter = value;
        System.out.println("Customer Counter has been reset to: " + customerCounter);
    }
}
