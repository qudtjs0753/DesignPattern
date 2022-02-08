package Creational.FactoryMethod;

/**
 * @Author: kbs
 */
public enum PartType {
    BUTTON("button"), FOOTER("footer"), HEADER("header"), BANNER("banner");

    private final String part;

    PartType(String part) {
        this.part = part;
    }

    @Override
    public String toString(){
        return part;
    }
}
