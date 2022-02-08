package Creational.FactoryMethod;

/**
 * @Author: kbs
 */
public class Android implements FrontEnd {

    private final PartType partType;

    public Android(PartType partType){
        this.partType = partType;
    }

    public PartType getPartType() {
        return partType;
    }

    @Override
    public String toString(){
        return partType + " in android";
    }
}
