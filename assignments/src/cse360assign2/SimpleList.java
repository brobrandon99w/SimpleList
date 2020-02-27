/*
 * @creator: 		Brandon Williams
 * @created:		2/20/2020
 * @classID:		125
 * @assignmentNum: 	2
 * description: Used for practice with Javadoc formatting, creating unit tests,
 * 				and using Junit. Methods either alter an array or offer
 * 				information pertaining to it.
 */

package cse360assign2;

/**
 * Declares an array of ten integers, as well as a count integer value
 * that is set to zero. Methods either alter the array or offer
 * information pertaining to it.
 * @author Brandon Williams
 *
 */
public class SimpleList{
	public int[] list = new int[10];
	public int count = 0;
	
	/**
	 * Adds the parameter to the beginning of the list (index = 0). Moves
	 * the other integers in the list over to make room for the parameter.
	 * If the list is full, then increase the size by 50% to make room for
	 * the parameter. Increment the count.
	 * @param element
	 */
	public void add(int element) {
		if (count == list.length) {
			int[] incSizeArray = new int[list.length 
			+ (int)Math.floor(list.length / 2)];
			
			for (int index = 0; index < list.length; index++) {
				incSizeArray[index] = list[index];
			}
			list = incSizeArray;
		}
		for(int index = count - 1; index >= 0; index--) {
			if (index != list.length - 1)
				list[index + 1] = list[index];
		}
		list[0] = element;
		count++;
	}
	
	/**
	 * Removes the first occurrence of the element from the list if it exists.
	 * Situationally moves the other values in the list down and adjust the 
	 * count. If more than a fourth of the list is empty, and the list has at
	 * least more than one entry, then the size of the list is decreased by
	 * 25%.
	 * @param element
	 */
	public void remove(int element) {
		int index = 0;
		
		while((list[index] != element) && (index < count)) {
			index++;
		}
		
		if(list[index] == element) {
			while(index != list.length - 1) {
				list[index] = list[index + 1];
				index++;
			}
			count--;
			
			if(((list.length - count) > (Math.floor(list.length / 4)))
			&& list.length > 1) {
				int[] decSizeArray = new int[list.length -
				(int)Math.floor(list.length / 4)];
				
				for (index = 0; index < list.length -
				(int)Math.floor(list.length / 4); index++) {	
					decSizeArray[index] = list[index];
				}
				list = decSizeArray;
			}
		}
	}
	
	/**
	 * Return the size of the list.
	 * @return count
	 */
	public int count() {
		return count;
	}
	
	/**
	 * Return the list as a String.
	 * @return String(buffer)
	 */
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		int size = count - 1;
		for (int index = 0; index < size; index++)
			buffer.append(list[index] + " ");
		if (count > 0)
			buffer.append(list[size]);
		return new String(buffer);
	}
	
	/**
	 * Returns the index of the parameter if it is in the list, else -1
	 * is returned.
	 * @param element
	 * @return index
	 */
	public int search(int element) {
		int index = 0;
		
		while((list[index] != element) && (index < count)) {
			index++;
		}
		if (index == count)
			index = -1;
		return index;
	}
	
	/**
	 * Adds the parameter to the end of the list. Moves the other
	 * integers in the list over to make room for the parameter.
	 * If the list is full, then increase the size by 50% to make room for
	 * the parameter. Increment the count.
	 * @param element
	 */
	public void append(int element) {
		if (count == list.length) {
			int[] incSizeArray = new int[list.length 
			+ (int)Math.floor(list.length / 2)];
			
			for (int index = 0; index < list.length; index++) {
				incSizeArray[index] = list[index];
			}
			list = incSizeArray;
		}
		list[count] = element;
		count++;
	}
	
	/**
	 * Return the first element in the list.
	 * @return firstElement
	 */
	public int first() {
		int firstElement = -1;
		if (count > 0)
			firstElement = list[0];
		return firstElement;
		
	}
	
	/**
	 * Return the first element in the list.
	 * @return lastElement
	 */
	public int last() {
		int lastElement = -1;
		if (count > 0)
			lastElement = list[count - 1];
		return lastElement;
	}
	
	/**
	 * Return the current number of possible locations in the list
	 * @return list.length;
	 */
	public int size() {
		return list.length;
	}
}