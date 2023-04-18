package ge.edu.sangu.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        // Not Thread-safe
        NotThreadSafeSingleton.getInstance();
        NotThreadSafeSingleton.getInstance();
        NotThreadSafeSingleton.getInstance();
        NotThreadSafeSingleton.getInstance();
        System.out.println("Not thread-safe object count = " + SingletonObjectCounter.NOT_THREAD_SAFE_COUNT);


        // Thread-safe
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    ThreadSafeSingleton.getInstance();
                }
            }).start();
        }
        System.out.println("Thread-safe object count = " + SingletonObjectCounter.NOT_THREAD_SAFE_COUNT);


        // Some broken code
        NoSingletonExample.getInstance();
        System.out.println("NoSingletonExample count = " + SingletonObjectCounter.NO_SINGLETON_COUNT);
    }
}
