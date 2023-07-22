public class OrangePicker extends Thread{
    private Basket basket;

    public OrangePicker (Basket basket){
        this.basket = basket;
    }

    public void run (){
        while (true){
            try {
                Thread.sleep(10000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            basket.fillBasket();
        }
    }

}
