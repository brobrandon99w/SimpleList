/*
 * @creator: 		Brandon Williams
 * @created:		2/4/2020
 * @classID:		125
 * @assignmentNum: 	1
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
	 * If the list is full, then the last element "falls off" the list.
	 * Increments the count only if the list isn't full.
	 * @param element
	 */
	public void add(int element) {
		for(int index = count - 1; index >= 0; index--) {
			if (index != list.length-1)
				list[index + 1] = list[index];
		}
		list[0] = element;
		if (count != list.length)
			count++;
	}
	
	/**
	 * Removes the first occurrence of the element from the list if it exists.
	 * Situationally moves the other values in the list down and adjust the 
	 * count.
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
	
	
	
}