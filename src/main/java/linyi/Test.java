package linyi;


import linyi.sjms.策略模式.Asbd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Hello world test.
 *
 * @author pdai
 */
@RunWith(MockitoJUnitRunner.class)
public class Test {

    @Mock
    private Asbd asbd;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("只执行一次，最先执行");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("只执行一次，最后执行");
    }

    @Before
    public void before(){
        System.out.println("每个test方法前执行一次");

    }

    @After
    public void after() {
        System.out.println("每个test方法前执行一次");
    }

    @org.junit.Test()
    public void test3(){
        when(asbd.getId()).thenReturn("mock123");
        assertEquals(asbd.getId(),"mock123");
    }


    @org.junit.Test(expected = ArithmeticException.class)
    public void test1(){
        System.out.println("in exception success test");
        int a = 0;
        int b = 1 / a;
    }
    @org.junit.Test(expected = NullPointerException.class)
    public void test2(){
        System.out.println("in exception success test");
        String s = null;
        s.length();
    }
}
