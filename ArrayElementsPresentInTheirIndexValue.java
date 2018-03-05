package com.Hunter;

import java.util.Scanner;

public class ArrayElementsPresentInTheirIndexValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
			
			
		}
		getArrayElementsPresentInTheirIndexValue(arr);
	}

	private static void getArrayElementsPresentInTheirIndexValue(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==i)
			{
				System.out.print(arr[i]+ " ");
			}
		}
	}

}
