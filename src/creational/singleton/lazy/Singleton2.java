package creational.singleton.lazy;

/**
 * @author reedmi
 * 双重检查加锁
 */
public class Singleton2 {

    /**
     * 被volatile修饰的变量不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存，
     * 确保在多线程环境下的准确性
     */
    private volatile static Singleton2 uniqueInstance = null;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton2.class) {
                uniqueInstance = new Singleton2();
            }
        }
        return uniqueInstance;
    }
}
