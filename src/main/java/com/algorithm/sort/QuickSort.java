package com.algorithm.sort;

import java.util.Arrays;

/**
 * @author chen_wj
 * @Description:
 * @date 2019/11/19
 * @Description: 快速排序
 * @modifier
 */
public class QuickSort {

	public static void main(String[] args) {

		int[] arr = new int[]{4,10,9,8,7,6,5,4,3,1,2,1,8};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
	}


	/**
	 * 快速排序
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	public static int[] quickSort(int arr[],int start,int end) {
		int pivot = arr[start];
		int i = start;
		int j = end;
		while (i<j) {
			while ((i<j)&&(arr[j]>pivot)) {
				j--;
			}
			while ((i<j)&&(arr[i]<pivot)) {
				i++;
			}
			if ((arr[i]==arr[j])&&(i<j)) {
				i++;
			} else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		if(i-1>start) {
			arr=quickSort(arr,start,i-1);
		}
		if(j+1<end){
			arr=quickSort(arr,j+1,end);
		}
		return arr;
	}
}
