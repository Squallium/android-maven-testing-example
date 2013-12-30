package com.example.aatg.myfirstproject.test;

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
}
