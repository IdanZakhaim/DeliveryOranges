public class DeliveryPerson extends Thread {
    private final Basket basket;


    public DeliveryPerson(Basket basket) {
        this.basket = basket;
    }

    public void run() {
        while (true) {
            try {
                synchronized (basket) {
                    System.out.println("Waiting for full basket");
                    basket.wait();
                }
                basket.emptyTheBasket();

                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
