package Structural.Decorator;

/**
 * @Author: kbs
 */
public class Main {
    public static void main(String[] args) {
        var domesticDelivery = new DomesticDelivery();
        System.out.println("It will be delivered within " + domesticDelivery.estimateTimeOfArrival() + " days.");
        System.out.println("The Shipping fee is " + domesticDelivery.fee() + "$");

        var overseasDelivery = new OverseasDelivery(new DomesticDelivery());
        System.out.println("It will be delivered within " + overseasDelivery.estimateTimeOfArrival() + " days.");
        System.out.println("The Shipping fee is " + overseasDelivery.fee() + "$");
    }
}
