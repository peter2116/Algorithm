package com.algorithm.sort;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author chen_wj
 * @Description:
 * @date 2019/11/5
 * @Description: 二分查找算法
 * @modifier
 */
public class BiSearch {

	@Test
	public void testBiSearch() {
		int[] arr = {1,3,4,5,7,9,11,15,20};
		Assert.assertEquals(biSearch(arr,1),  0);
		Assert.assertEquals(biSearch(arr,4),  2);
		Assert.assertEquals(biSearch(arr,15),  7);
		Assert.assertEquals(biSearch(arr,20),  8);
		Assert.assertEquals(biSearch(arr,6),  -1);
	}


	public static int biSearch(int[] arr, int target) {
		int min = 0;
		int max = arr.length - 1;
		int mid;

		while(min <= max) {
			mid = (min + max) / 2;
			if (arr[mid] == target) {
				return mid;
			} else {
				if (arr[mid] > target) {
					max = mid - 1;
				} else {
					min = mid + 1;
				}
			}
		}
		return -1;
	}
}
