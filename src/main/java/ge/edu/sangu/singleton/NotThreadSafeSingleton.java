package ge.edu.sangu.singleton;

public class NotThreadSafeSingleton {

    private static NotThreadSafeSingleton singletonObject;

    private NotThreadSafeSingleton() {
    }

    public static NotThreadSafeSingleton getInstance() {
        if (singletonObject == null) {
            singletonObject = new NotThreadSafeSingleton();
            SingletonObjectCounter.NOT_THREAD_SAFE_COUNT++;
        }

        return singletonObject;
    }
}
