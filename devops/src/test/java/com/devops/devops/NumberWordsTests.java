package com.devops.devops;

import org.junit.*;

import com.devops.devops.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( 1 ) ) ;
		//Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	@Test
	public void numberOutOfRangeReturnsError1() {
		//Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( 1 ) ) ;
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}

}
