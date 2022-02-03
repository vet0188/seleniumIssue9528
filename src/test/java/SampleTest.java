import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

public class SampleTest {

    private String url = "https://google.com";

    @Before
    public void beforeTest() {
        Driver.setupDriver();
    }

    @Test
    public void test1() {
        IntStream.rangeClosed(0,50).boxed().forEach(i -> {
            try {
                System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName());
                System.out.println("=== Iteration [" + i + "] ===");
                Driver.getInstance().get(url);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                Driver.closeDriver();
            }
        });
    }

    @Test
    public void test2() {
        IntStream.rangeClosed(0,50).boxed().forEach(i -> {
            try {
                System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName());
                System.out.println("=== Iteration [" + i + "] ===");
                Driver.getInstance().get(url);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                Driver.closeDriver();
            }
        });
    }

    @Test
    public void test3() {
        IntStream.rangeClosed(0,50).boxed().forEach(i -> {
            try {
                System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName());
                System.out.println("=== Iteration [" + i + "] ===");
                Driver.getInstance().get(url);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                Driver.closeDriver();
            }
        });
    }

    @Test
    public void test4() {
        IntStream.rangeClosed(0,50).boxed().forEach(i -> {
            try {
                System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName());
                System.out.println("=== Iteration [" + i + "] ===");
                Driver.getInstance().get(url);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                Driver.closeDriver();
            }
        });
    }

    @Test
    public void test5() {
        IntStream.rangeClosed(0,50).boxed().forEach(i -> {
            try {
                System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName());
                System.out.println("=== Iteration [" + i + "] ===");
                Driver.getInstance().get(url);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                Driver.closeDriver();
            }
        });
    }

    @Test
    public void test6() {
        IntStream.rangeClosed(0,50).boxed().forEach(i -> {
            try {
                System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName());
                System.out.println("=== Iteration [" + i + "] ===");
                Driver.getInstance().get(url);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                Driver.closeDriver();
            }
        });
    }

    @Test
    public void test7() {
        IntStream.rangeClosed(0,50).boxed().forEach(i -> {
            try {
                System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName());
                System.out.println("=== Iteration [" + i + "] ===");
                Driver.getInstance().get(url);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                Driver.closeDriver();
            }
        });
    }

    @Test
    public void test8() {
        IntStream.rangeClosed(0,50).boxed().forEach(i -> {
            try {
                System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName());
                System.out.println("=== Iteration [" + i + "] ===");
                Driver.getInstance().get(url);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                Driver.closeDriver();
            }
        });
    }
}
