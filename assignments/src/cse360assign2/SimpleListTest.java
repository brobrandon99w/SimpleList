/*
 * @creator: 		Brandon Williams
 * @created:		2/20/2020
 * @classID:		125
 * @assignmentNum: 	2
 * description: Used for practice with Javadoc formatting, creating unit tests,
 * 				and using Junit.
 */

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Used to do a series of tests to see if the SimpleList class is
 * working correctly.
 * @author Brandon Williams
 *
 */
class SimpleListTest {

	/**
	 * Tests add to see if integers are correctly added to the list.
	 */
	@Test
	void testAdd() {
		SimpleList test = new SimpleList();
		test.add(7);
		test.add(10);
		test.add(9);
		String output = test.toString();
		assertEquals("9 10 7", output);
	}
	
	/**
	 * Tests add to see if integers aren't pushed off the list, but
	 * rather the list increases in size when count and list.length
	 * are the same value.
	 */
	@Test
	void testAdd2() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.add(11);
		String output = test.toString();
		assertEquals("11 10 9 8 7 6 5 4 3 2 1", output);
	}
	
	/**
	 * Tests remove to see if a value in the list is removed.
	 */
	@Test
	void testRemove() {
		SimpleList test = new SimpleList();
		test.add(7);
		test.add(10);
		test.add(9);
		test.remove(10);
		String output = test.toString();
		assertEquals("9 7", output);
	}
	
	/**
	 * Tests remove to see if a value not in the list is attempted to
	 * be removed decrements the count.
	 */
	@Test
	void testRemove2() {
		SimpleList test = new SimpleList();
		test.add(7);
		test.add(10);
		test.add(9);
		test.remove(1);
		String output = test.toString();
		assertNotEquals("9 10", output);
	}
	
	/**
	 * Tests remove to see if the length of the list is decreased by 25%
	 * after an element is removed (when the conditions are met)
	 */
	@Test
	void testRemove3() {
		SimpleList test = new SimpleList();
		test.add(7);
		test.add(10);
		test.add(9);
		test.remove(10);
		assertEquals(8, test.list.length);
	}
	
	/**
	 * Tests remove to see if the length of the list is decreased
	 * after an element is removed (when the conditions aren't met)
	 */
	@Test
	void testRemove4() {
		SimpleList test = new SimpleList();
		test.add(7);
		test.add(10);
		test.add(9);
		test.remove(1);
		assertNotEquals(8, test.list.length);
	}
	
	/**
	 * Tests remove to see if the length of the list may be decreased
	 * to less than one entry.
	 */
	@Test
	void testRemove5() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.remove(1);
		test.add(1);
		test.remove(1);
		test.add(1);
		test.remove(1);
		test.add(1);
		test.remove(1);
		test.add(1);
		test.remove(1);
		test.add(1);
		test.remove(1);
		test.add(1);
		test.remove(1);
		test.add(1);
		test.remove(1);
		test.add(1);
		test.remove(1);
		test.add(1);
		test.remove(1);
		assertNotEquals(0, test.list.length);
	}
	
	/**
	 * Tests count to see if the count is correct after adding
	 * elements to the list.
	 */
	@Test
	void testCount() {
		SimpleList test = new SimpleList();
		test.add(7);
		test.add(10);
		test.add(9);
		int output = test.count();
		assertEquals(3, output);
	}
	
	/**
	 * Tests count to see if the count could be more than 10.
	 */
	@Test
	void testCount2() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.add(9);
		test.add(10);
		test.add(11);
		int output = test.count();
		assertNotEquals(10, output);
	}
	
	/**
	 * Tests toString to see if the string is empty when there are no elements
	 * in the list.
	 */
	@Test
	void testToString() {
		SimpleList test = new SimpleList();
		String output = test.toString();
		assertEquals("", output);
	}
	
	/**
	 * Test toString to see if spaces are placed after elements.
	 */
	@Test
	void testToString2() {
		SimpleList test = new SimpleList();
		test.add(2);
		String output = test.toString();
		assertNotEquals("2 ", output);
	}
	
	/**
	 * Tests search to see if the location of an element in the list is
	 * correct.
	 */
	@Test
	void testSearch() {
		SimpleList test = new SimpleList();
		test.add(7);
		test.add(10);
		test.add(9);
		int output = test.search(10);
		assertEquals(1, output);
	}
	
	/**
	 * Tests search to see if the location of an element not present in
	 * the list outputs the count instead of -1.
	 */
	@Test
	void testSearch2() {
		SimpleList test = new SimpleList();
		test.add(7);
		test.add(10);
		test.add(9);
		int output = test.search(4);
		assertNotEquals(3, output);
	}
	
	/**
	 * Tests append to see if integers are correctly added
	 * to the end of the list.
	 */
	@Test
	void testAppend() {
		SimpleList test = new SimpleList();
		test.append(7);
		test.append(10);
		test.append(9);
		String output = test.toString();
		assertEquals("7 10 9", output);
	}
	
	/**
	 * Tests append to see if the list increases in size when
	 * count and list.length are the same value.
	 */
	@Test
	void testAppend2() {
		SimpleList test = new SimpleList();
		test.append(1);
		test.append(2);
		test.append(3);
		test.append(4);
		test.append(5);
		test.append(6);
		test.append(7);
		test.append(8);
		test.append(9);
		test.append(10);
		test.append(11);
		String output = test.toString();
		assertEquals("1 2 3 4 5 6 7 8 9 10 11", output);
	}
	
	/**
	 * Tests first to see if the first element is correctly returned.
	 */
	@Test
	void testFirst() {
		SimpleList test = new SimpleList();
		test.add(3);
		test.add(7);
		test.add(10);
		int output = test.first();
		assertEquals(10, output);
	}
	
	/**
	 * Tests first to see if -1 is returned when there is no
	 * elements in the list.
	 */
	@Test
	void testFirst2() {
		SimpleList test = new SimpleList();
		int output = test.first();
		assertEquals(-1, output);
	}
	
	/**
	 * Tests last to see if the last element is correctly returned.
	 */
	@Test
	void testLast() {
		SimpleList test = new SimpleList();
		test.add(3);
		test.add(7);
		test.add(10);
		int output = test.last();
		assertEquals(3, output);
	}
	
	/**
	 * Tests last to see if -1 is returned when there is no
	 * elements in the list.
	 */
	@Test
	void testLast2() {
		SimpleList test = new SimpleList();
		int output = test.last();
		assertEquals(-1, output);
	}
	
	/**
	 * Tests size to see if the length of the list is correctly returned.
	 */
	@Test
	void testSize() {
		SimpleList test = new SimpleList();
		int output = test.size();
		assertEquals(10, output);
	}
	
	/**
	 * Tests size to see if the length of the list after it
	 * is increased by 50% is correctly returned.
	 */
	@Test
	void testSize2() {
		SimpleList test = new SimpleList();
		test.append(1);
		test.append(2);
		test.append(3);
		test.append(4);
		test.append(5);
		test.append(6);
		test.append(7);
		test.append(8);
		test.append(9);
		test.append(10);
		test.append(11);
		int output = test.size();
		assertEquals(15, output);
	}
	
	/**
	 * Tests size to see if the length of the list after it
	 * is decreased by 25% is correctly returned.
	 */
	@Test
	void testSize3() {
		SimpleList test = new SimpleList();
		test.add(1);
		test.remove(1);
		int output = test.size();
		assertEquals(8, output);
	}
}