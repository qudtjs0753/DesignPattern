package Structural.Decorator;

/**
 * @Author: kbs
 */
public class DomesticDelivery implements Delivery {
    public int estimateTimeOfArrival(){
        return 3;
    }

    public int fee(){
        return 50;
    }
}
