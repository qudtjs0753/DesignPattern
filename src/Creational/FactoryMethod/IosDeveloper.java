package Creational.FactoryMethod;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * @Author: kbs
 */
public class IosDeveloper implements Developer {
    private static final Map<PartType, Android> ANDROID_PART;

    static {
        ANDROID_PART = new EnumMap<PartType, Android>(PartType.class);
        Arrays.stream(PartType.values()).forEach(type -> ANDROID_PART.put(type, new Android(type)));
    }

    @Override
    public FrontEnd createPart(PartType partType){
        return ANDROID_PART.get(partType);
    }

    @Override
    public String toString() {
        return "The ios developer make ";
    }
}
