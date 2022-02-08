package Structural.Proxy;

/**
 * @Author: kbs
 */
public class Main {
    public static void main(String[] args) {
        var proxy = new SenderProxy(new Santa());
        proxy.sendGift(new Gift("Computer"));
        proxy.sendGift(new Gift("Soccer Ball"));
        proxy.sendGift(new Gift("Computer"));
    }
}
