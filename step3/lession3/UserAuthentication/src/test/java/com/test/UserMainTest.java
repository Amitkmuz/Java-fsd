package com.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class UserMainTest 
    extends TestCase
{
   
    public UserMainTest( String testName )
    {
        super( testName );
    }

   
    public static Test suite()
    {
        return new TestSuite( UserMainTest.class );
    }

   
    public void testApp()
    {
        assertTrue( true );
    }
}

