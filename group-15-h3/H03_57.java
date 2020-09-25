/*********************************************************************************************************
 * CLASS: H03_57 (H03_57.java)
 *
 * DESCRIPTION
 * Ternary searching system
 *
 * COURSE AND PROJECT INFORMATION
 * CSE205 Object Oriented Programming and Data Structures, Fall 2020
 * Homework Number: 3
 *
 * GROUP INFORMATION
 * AUTHOR 1: Emily Nesbitt, eanesbit, eanesbit@asu.edu
 * AUTHOR 2: Alan Morales, aamora14, aamora14@asu.edu
 * AUTHOR 3: Ethen Kisner, ekisner, ekisner@asu.edu
 ********************************************************************************************************/

public class H03_57 {
	public int ternarySearch(ArrayList<Integer> pList, Integer pKey, int pLow, int pHigh) {
		int low = pLow, high = pHigh;
		while (low <= high) {
		int range = high - low;
		int oneThirdIdx = (int)Math.round(low + range / 3.0);
		int twoThirdIdx = (int)Math.round(low + range / 1.3333333333333333);
		if (pKey.equals(pList.get(oneThirdIdx))) {
		return oneThirdIdx;
		} else if (pKey.equals(pList.get(twoThirdIdx))) {
		return twoThirdIdx;
		} else if (pKey < pList.get(oneThirdIdx)) {
		high = oneThirdIdx - 1;
		} else if (pKey > pList.get(twoThirdIdx)) {
		low = twoThirdIdx + 1;
		} else {
		low = oneThirdIdx + 1;
		high = twoThirdIdx - 1;
		}
		}
		return -1;
		}
}

