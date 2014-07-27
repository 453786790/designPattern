package structural.flyweight;

/**
 * @author reedmi
 * 摘录自Long.java
 * ps：享元模式主要处理细粒度对象的重复问题
 * 应用场景：#1cache的实现，不过需要考虑3个问题：cache的有效时间，数据同步，并发访问时数据的一致性
 *         #2"xx池"的处理，需要考虑2个问题：动态生成和动态分配
 */
public class Number {

    public static Long valueOf(long l) {
        final int offset = 128;
        if (l >= -128 && l <= 127) { // will cache
            return NumberCache.cache[(int)l + offset];
        }
        return new Long(l);
    }

    /**
     * 类何时被初始化？
     *  #1.new ClassName();
     *  #2.调用类的静态方法
     *  #3.为类或接口的静态field赋值
     *  #4.访问非final的static filed
     *  #5.初始化某个类的子类
     *  ps：静态内部类只有在主动使用的时候才会被初始化
     */
    private static class NumberCache {
        private NumberCache(){}

        static final Long cache[] = new Long[-(-128) + 127 + 1];

        static {
            for(int i = 0; i < cache.length; i++)
                cache[i] = new Long(i - 128);
        }
    }
}
