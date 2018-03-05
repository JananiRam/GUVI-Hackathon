package com.Hunter;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		int bigNumber=0;
		int multiple=1;
		int prevNumber=0;
		for(int num:arr)
		{
			if(prevNumber!=num)
			{
				prevNumber=num;	
				bigNumber+=(num*multiple);

				multiple*=10;
			}
		}
		System.out.println(bigNumber);
	}

}
