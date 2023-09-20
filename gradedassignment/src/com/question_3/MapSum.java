package com.question_3;

import java.util.Arrays;
public class MapSum {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		System.out.println(Arrays.stream(arr).filter(x->x%2!=0).map(x->x*x).sum());

	}

}