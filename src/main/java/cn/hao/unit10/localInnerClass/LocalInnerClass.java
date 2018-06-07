package cn.hao.unit10.localInnerClass;

/**
 * Created by Tianbohao on 2018/5/31.
 */
public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {
        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("LocalCounter()");
            }

            public int next() {
                System.out.println(name);
                return count++;
            }
        }

        return new LocalCounter();
    }

    Counter getCounter2(final String name) {
        return new Counter() {

            {
                System.out.println("Counter()");
            }

            public int next() {
                System.out.println(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("getCounter"),
                c2 = lic.getCounter2("getCounter2");

        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }

}
