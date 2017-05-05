package com.xiaomi.test.triangle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public static void testApp()
    {     App app=new App();
          float d=3.9f;
          float e=4.9f;
          float f=4.9f;
           String  result=app.trianglejudge(d,e,f);
          assertEquals("这是个等腰三角形", result);
       // assertTrue( true );
    }
}
