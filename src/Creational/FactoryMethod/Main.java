package Creational.FactoryMethod;

/**
 * @Author: kbs
 */
public class Main {
    public static void main(String[] args) {
        Developer developer = new AndroidDeveloper();
        FrontEnd frontEnd = developer.createPart(PartType.BANNER);
        System.out.print(developer);
        System.out.println(frontEnd);

        developer = new IosDeveloper();
        frontEnd = developer.createPart(PartType.BUTTON);
        System.out.print(developer);
        System.out.println(frontEnd);
    }
}
