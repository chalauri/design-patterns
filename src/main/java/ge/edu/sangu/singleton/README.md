# Singleton Pattern Examples in Java (With Pitfalls and Fixes)

This package demonstrates different implementations (and misimplementations) of the **Singleton Design Pattern** in Java. The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.

## What is the Singleton Pattern?

The **Singleton** is a creational design pattern that:
- Ensures a class has **only one instance**.
- Provides a **global access point** to that instance.
- Often used for shared resources (e.g., configuration, logging, database connection pools).

---

## Demonstrated Classes

### 1. `ItIsNotSingleton`

This class is **not a singleton** at all — it simply increments a counter every time it's instantiated, and it's publicly constructible.

```java
new ItIsNotSingleton();            // Valid
new ItIsNotSingleton(123);        // Also valid, and internally calls another constructor

```

<br/><br/>

### 2. `NoSingletonExample`

``` java
public NoSingletonExample() {
    new NoSingletonExample(1);  // A second object is created here!
}
```

- The private constructor calls another constructor (NoSingletonExample(int x)), creating a second instance.
- FAKE_SINGLETON_OBJECT gets only the outer object, but an inner one was also created — violating singleton principles.

<br/><br/>

### 3. `NotThreadSafeSingleton`

``` java
public static NotThreadSafeSingleton getInstance() {
    if (SINGLETON_OBJECT == null) {
        SINGLETON_OBJECT = new NotThreadSafeSingleton();
    }
}
```

This class correctly limits instantiation under single-threaded conditions but is not safe in multi-threaded environments.

- Two threads could simultaneously enter the if (SINGLETON_OBJECT == null) block and both create an instance.
- This leads to race conditions and multiple singleton instances.

<br/><br/>

### 4. `ThreadSafeSingleton`

``` java
public static synchronized ThreadSafeSingleton getInstance() {
    if (singletonObject == null) {
        singletonObject = new ThreadSafeSingleton();
    }
}
```

This class properly implements the Singleton pattern with thread safety using the synchronized keyword.

Why it works:

- The synchronized keyword ensures only one thread accesses the method at a time.
- The instance is created only once, even in a multithreaded environment.

Drawback: 
- Every call to getInstance() is synchronized, which may cause performance issues under high load.