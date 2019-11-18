package com.algorithm.sort;

import java.util.Arrays;

/**
 * @author chen_wj
 * @Description:
 * @date 2019/11/18
 * @Description: 插入排序
 * @modifier
 */
public class InsertSort {


	public static void main(String[] args) {

		int[] arr = new int[] {3, 5, 2, 4, 1};
		sort(arr);
		System.out.println(Arrays.toString(arr));

		int[] arr2 = new int[] {0, 0, 2, 2, 5, 7, 6, 6};
		sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}


	/**
	 * 插入排序
	 */
	public static void sort(int[] arr) {
		for(int i = 1, len = arr.length; i < len; i++) {
			//待插入数据
			int insertVal = arr[i];
			int index = i - 1;
			while (index >= 0 && arr[index] > insertVal) {
				//如果该位置数据比待插入数据大，向后移动
				arr[index + 1] = arr[index];
				index--;
			}
			//将待插入数据放到合适位置
			arr[index + 1] = insertVal;
		}
	}

}
