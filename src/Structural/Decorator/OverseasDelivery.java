package Structural.Decorator;

/**
 * @Author: kbs
 */
public class OverseasDelivery implements Delivery {

    private final Delivery decorated;

    OverseasDelivery(Delivery decorated){
        this.decorated = decorated;
    }

    @Override
    public int estimateTimeOfArrival(){
        return decorated.estimateTimeOfArrival() + 8;
    }

    @Override
    public int fee(){
        return decorated.fee() + 100;
    }
}
