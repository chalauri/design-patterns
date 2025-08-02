package ge.edu.sangu.singleton;

public class NotThreadSafeSingleton {

    private static NotThreadSafeSingleton SINGLETON_OBJECT;

    private NotThreadSafeSingleton() {
    }

    public static NotThreadSafeSingleton getInstance() {
        if (SINGLETON_OBJECT == null) {
            SINGLETON_OBJECT = new NotThreadSafeSingleton();
            SingletonObjectCounter.NOT_THREAD_SAFE_COUNT++;
        }

        return SINGLETON_OBJECT;
    }
}
