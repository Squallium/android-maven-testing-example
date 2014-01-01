package com.example.aatg.myfirstproject.test;

import com.example.aatg.myfirstproject.MyFirstProjectActivity;

import junit.framework.TestCase;
import android.os.Debug;
import android.test.suitebuilder.annotation.SmallTest;

public class MyFirstProjectTest extends TestCase {

	private static final boolean DEBUG = true;

	public MyFirstProjectTest() {
		this(MyFirstProjectTest.class.getSimpleName());
	}

	public MyFirstProjectTest(String name) {
		super(name);

		if (DEBUG) {
			Debug.waitForDebugger();
		}
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@SmallTest
	public void testSomething() {
		fail("Not implemented yet");
	}

	@VeryImportantTest
	public void testOtherStuff() {
		fail("Not implemented yet");
	}

	public void testShouldThrowException() {
		try {
			MyFirstProjectActivity.methodThatShouldThrowException();
			fail("Exception was not throw");
		} catch (Exception e) {
			// do nothing
		}
	}

	public void testMax() {
		final int a = 1;
		final int b = 2;
		final int expected = b;
		final int actual = Math.max(a, b);
		assertEquals("Expectation " + expected + " but was " + actual,
				expected, actual);
	}

}
