package com.example.aatg.myfirstproject.provider.test;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.test.ProviderTestCase2;

import com.example.aatg.myfirstproject.provider.MyProvider;

public class MyProviderTests extends ProviderTestCase2<MyProvider> {

	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private MyProvider mProvider;

	// ===========================================================
	// Constructors
	// ===========================================================

	public MyProviderTests() {
		this(MyProviderTests.class.getSimpleName());
	}

	public MyProviderTests(String name) {
		super(MyProvider.class, MyProvider.AUTHORITY);
		setName(name);
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		setContext(getMockContext());
		mProvider = getProvider();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testDelete() {
		Uri uri = Uri.withAppendedPath(MyProvider.CONTENT_URI, "dummy");
		final int actual = mProvider.delete(uri, "_id = ?",
				new String[] { "1" });
		final int expected = 1;
		assertEquals(expected, actual);
	}

	public void testQuery() {
		Uri uri = Uri.withAppendedPath(MyProvider.CONTENT_URI, "dummy");
		final Cursor c = mProvider.query(uri, null, null, null, null);
		final int expected = 2;
		final int actual = c.getCount();
		assertEquals(expected, actual);
	}

	public void testInsertUsingContentResolver() {
		final ContentValues values = new ContentValues();

		values.put("_id", 3);
		values.put("name", "Pluto");

		final Uri newUri = getMockContentResolver().insert(
				Uri.withAppendedPath(MyProvider.CONTENT_URI, "dummy"), values);
		assertNotNull(newUri);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

}
