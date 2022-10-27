package com.div;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Datatest {
	@Before
	public void before() {
		System.out.println("connect to the database");
	}
	@Before
	public void before1() {
		System.out.println("load the schema");
		
	}
	@After
	public void after() {
		System.out.println("Disconnect from the database");
	}
	@After
	public void after1() {
		System.out.println("Test One");
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("Test two");
		
	}

}
