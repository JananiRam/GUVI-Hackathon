package com.Hunter;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class FindRepeatedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//System.out.println();
		int n = scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();		
		}
		//System.out.println();
		findRepeatedNumbers(arr);
	}

	private static void findRepeatedNumbers(int[] arr) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Integer> map = new TreeMap<>();
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i],1);
			}	
			else
			{
				map.put(arr[i],map.get(arr[i])+1);
				flag=true;
			}
		}
		if(flag)
		{
			for(int key:map.keySet()) {
				if(map.get(key)!=1)
				{
					System.out.print(key+" ");
				}
			}
		}
		else
			System.out.println("unique");
	}

}
