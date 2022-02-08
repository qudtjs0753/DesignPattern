package Creational.Singleton;

/**
 * @Author: kbs
 */
//Lazy Initialization 중 LazyHolder 방식을 사용해서 만들었음.
//Lazy Initialization 방식은 synchronized 방식, DCL 방식, Enum방식 등이 있음.
public class Space {
    /*
    이 클래스 내부에 static 변수가 존재하지 않기때문에 이름만 정의되고 trivial하게 초기화가 된다.
    도대체 초기화의 의미는 무엇인가..
        자바 공식문서에 따르면
        1.new, getstatic, putstatic, invokestatic -> java bytecode임.
            new instruction을 실행했을 때 참조된 class
            getstatic, putstatic, invokestatic instruction 실행시에 사용되는 field나 method를 가지고 있는 class
            또는 interface.
        이외 등등..

    우선 default constructor를 밖에서 쓰지 못하도록 private로 정의한다.
     */
    private Space(){}

    /*
    BigBang innerclass를 정의한다.
    이때 내부클래스에서 static 변수를 선언해야하기때문에 static 내부 클래스를 선언해야만 한다.
    createSpace가 class Something에서 실행되면 그때 BigBang class가 실행된다.
        JVM에서 BigBang Class가 반드시 실행될것이라 확정하지 않으면 초기화가 되지 않는다. -> Class Loader가 runtime에 가져와준다.
    createSpace가 Space class에서 실행되는 순간 처음으로 JVM은 Bigbang class를 load하고 초기화한다.
        LazyHolder class가 초기화됨으로서 Space() constructor가 실행이 되고 결과적으로 uniqueSpace static 변수가 초기화된다.
        static class이므로 createSpace는 단 한번만 초기화됨. Singleton 만족.
    즉, 런타임 바인딩
     */

    //이때 class initialization phase는 JLS에 의해 병렬(concurrent)수행이 아니라 연속적인(sequential) 수행을 한다.
    //따라서 동기화처리를 따로 해줄 필요가 없음.
    private static class BigBang {

        private static final Space uniqueSpace = new Space();
    }

    public static Space createSpace(){
        return BigBang.uniqueSpace;
    }
}
