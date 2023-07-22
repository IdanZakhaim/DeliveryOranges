public class Basket {
private int maxCapacity;
private int currentCapacity;

    public Basket(int maxCapacity, int currentCapacity) {
        this.maxCapacity = 50;
        this.currentCapacity = 0;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    protected synchronized void fillBasket (){
        while (currentCapacity < maxCapacity){
            currentCapacity++;
            System.out.println("\nFilling the basket: now have "+getCurrentCapacity());
        }
        System.out.println("\n\nBasket is full - call to delivery\n\n");
        notify();
    }
    protected synchronized void emptyTheBasket (){
        currentCapacity=0;
    }
}
