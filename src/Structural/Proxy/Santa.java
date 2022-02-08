package Structural.Proxy;

/**
 * @Author: kbs
 */
public class Santa implements Sender {

    public void sendGift(Gift gift){
        System.out.println( gift.getGift() + " is a gift for you! Merry Christmas! HaHa");
    }
}
