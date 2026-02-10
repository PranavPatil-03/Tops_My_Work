package com.websriver_Module_7_junit;

import org.junit.Assert;
import org.junit.Test;

public class Assert_class {
	

	    @Test
	    public void testAssertEquals() {
	        int actual = 10;
	        int expected = 10;
	        Assert.assertEquals(expected, actual);
	    }

	    @Test
	    public void testAssertNotEquals() {
	        int a = 10;
	        int b = 20;
	        Assert.assertNotEquals(a, b); 
	    }

	    @Test
	    public void testAssertTrue() {
	        Assert.assertTrue(5 > 2); 
	    }

	    @Test
	    public void testAssertFalse() {
	        Assert.assertFalse(5 < 2); 
	    }

	    @Test
	    public void testAssertNull() {
	        String name = null;
	        Assert.assertNull(name); 
	    }

	    @Test
	    public void testAssertNotNull() {
	        String name = "Pranav";
	        Assert.assertNotNull(name); 
	    }

	    @Test
	    public void testAssertSame() {
	        String s1 = "Java";
	        String s2 = s1;
	        Assert.assertSame(s1, s2); 
	    }

	    @Test
	    public void testAssertNotSame() {
	        String s1 = new String("Java");
	        String s2 = new String("Java");
	        Assert.assertNotSame(s1, s2); 
	    }

	    @Test
	    public void testFail() {
	        if (10 > 5) {
	            Assert.fail("Test is fail");
	        }
	    }
	}

