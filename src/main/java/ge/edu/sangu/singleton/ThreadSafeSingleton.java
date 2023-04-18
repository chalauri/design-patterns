package ge.edu.sangu.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton singletonObject;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (singletonObject == null) {
            singletonObject = new ThreadSafeSingleton();
            SingletonObjectCounter.THREAD_SAFE_COUNT++;
        }

        return singletonObject;
    }
}
