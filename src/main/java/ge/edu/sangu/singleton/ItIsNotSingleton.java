package ge.edu.sangu.singleton;

public class ItIsNotSingleton {

    private ItIsNotSingleton(){
        SingletonObjectCounter.OBJECT_COUNTER++;
    }

    public ItIsNotSingleton(int a){
        SingletonObjectCounter.OBJECT_COUNTER++;
        new ItIsNotSingleton();
    }

}
