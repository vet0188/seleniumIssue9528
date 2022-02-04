import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

public class SampleTest {

    private String url = "https://google.com";
    private int iterations = 10;

    @Before
    public void beforeTest() {
        Driver.setupDriver();
    }

    private void action(int i) {
        System.out.println(Thread.currentThread().getId() + Thread.currentThread().getName());
        System.out.println("=== Iteration [" + i + "]. Thread - " + Thread.currentThread().getId());
        Driver.getInstance().get(url);
        System.out.println("=== Site opened. Thread - " + Thread.currentThread().getId());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            Driver.closeDriver();
            System.out.println("=== Driver losed. Thread - " + Thread.currentThread().getId());
        }
    }

    @Test
    public void test1() {
        IntStream.range(0,iterations).boxed().forEach(this::action);
    }

    @Test
    public void test2() {
        IntStream.range(0,iterations).boxed().forEach(this::action);
    }

    @Test
    public void test3() {
        IntStream.range(0,iterations).boxed().forEach(this::action);
    }

    @Test
    public void test4() {
        IntStream.range(0,iterations).boxed().forEach(this::action);
    }

    @Test
    public void test5() {
        IntStream.range(0,iterations).boxed().forEach(this::action);
    }

    @Test
    public void test6() {
        IntStream.range(0,iterations).boxed().forEach(this::action);
    }

    @Test
    public void test7() {
        IntStream.range(0,iterations).boxed().forEach(this::action);
    }

    @Test
    public void test8() {
        IntStream.range(0,iterations).boxed().forEach(this::action);
    }
}
