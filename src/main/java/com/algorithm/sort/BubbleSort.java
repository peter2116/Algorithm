package com.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author chen_wj
 * @Description:
 * @date 2019/11/5
 * @Description: 冒泡排序
 * @modifier
 */
public class BubbleSort {

	@Test
	public void testBubbleSort() {
		int[] arr = { 1, 9, 2, 8, 3, 7, 4, 6, 5 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		Assert.assertArrayEquals(arr,new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
	}


	public static void bubbleSort(int[] arr) {
		for(int i = 0, len = arr.length - 1; i < len; i++) {
			for(int j = len; j != 0; j-- ) {
				if(arr[j - 1] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
	}
}
