package ge.edu.sangu.singleton;

public class NoSingletonExample {

    private static NoSingletonExample FAKE_SINGLETON_OBJECT;

    private NoSingletonExample() {
        SingletonObjectCounter.NO_SINGLETON_COUNT++;
        new NoSingletonExample(1);
    }

    private NoSingletonExample(int a) {
        SingletonObjectCounter.NO_SINGLETON_COUNT++;
    }


    public static NoSingletonExample getInstance(){
        if (FAKE_SINGLETON_OBJECT == null) {
            FAKE_SINGLETON_OBJECT = new NoSingletonExample();
        }

        return FAKE_SINGLETON_OBJECT;
    }


}
