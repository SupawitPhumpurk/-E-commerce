package ObserverPattern;
import Datamodels.*;
import java.util.ArrayList;
import java.util.List;

/**
 *  Subject (publisher) แจ้งข่าวสาร
 */

 public class OrderProcessor{
    private final List<OrderObserver> observers = new ArrayList<>();

    public void register(OrderObserver observer){
        observers.add(observer);

    }
    public void unregister(OrderObserver observer){
        observers.remove(observer);
        
    }
    private void notifyObservers(Order observer){
        for (OrderObserver observer : observers){
            observer.update(order);
        }
    }
    
    public void processOrder(Order order){
        System.out.println("\nProcessing order " + order.orderId() + ".....");

        System.out.println("Order processed successfully.");
    }

 }