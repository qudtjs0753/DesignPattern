package Creational.FactoryMethod;

/**
 * @Author: kbs
 */
public class Ios implements FrontEnd {

    private final PartType partType;

    public Ios(PartType partType){
        this.partType = partType;
    }

    public PartType getPartType() {
        return partType;
    }

    @Override
    public String toString(){
        return partType + " in ios";
    }
}
