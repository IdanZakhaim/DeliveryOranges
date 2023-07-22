public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket(50,0);
        OrangePicker orangePicker = new OrangePicker(basket);
        DeliveryPerson deliveryPerson = new DeliveryPerson(basket);
        orangePicker.start();
        deliveryPerson.start();
    }
}