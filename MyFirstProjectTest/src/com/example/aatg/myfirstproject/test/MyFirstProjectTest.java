package com.example.aatg.myfirstproject.test;

import android.test.suitebuilder.annotation.SmallTest;
import junit.framework.TestCase;

public class MyFirstProjectTest extends TestCase {

	public MyFirstProjectTest() {
		this(MyFirstProjectTest.class.getSimpleName());
	}

	public MyFirstProjectTest(String name) {
		super(name);
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
