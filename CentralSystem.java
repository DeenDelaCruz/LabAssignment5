public class CentralSystem {
    public static void main(String[] args) {
        HelpDesk helpDesk = HelpDesk.getInstance();

        simulateCustomerService(helpDesk);

        helpDesk.logCustomerCount();
        helpDesk.resetCounter(0);

        simulateCustomerService(helpDesk);
    }

    private static void simulateCustomerService(HelpDesk helpDesk) {
        String[] desks = {"Desk 1", "Desk 2", "Desk 3"};
        for (String desk : desks) {
            helpDesk.serveCustomer(desk);
        }
    }
}
