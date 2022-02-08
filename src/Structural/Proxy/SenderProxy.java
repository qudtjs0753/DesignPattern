package Structural.Proxy;

/**
 * @Author: kbs
 */
public class SenderProxy implements Sender {

    private static final int NUM_OF_GIFT = 2;

    private int numGifts;

    private final Sender sender;

    public SenderProxy(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void sendGift(Gift gift){
        if(numGifts < NUM_OF_GIFT){
            sender.sendGift(gift);
            numGifts++;
        }else{
            System.out.println("No more gift!");
        }
    }
}
