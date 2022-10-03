package etechtexas_assessment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.zip.Inflater;


public class Assessmento1       
{
	
	public static void main(String[] args) 		
	{
		int num[] = {1,1,4,4,3,3,8};
	
		Arrays.sort(num);	                           
		
	    int singlenum = num[0];     
	
		for(int i=1; i<num.length; i++)
		{			
			singlenum = singlenum^num[i];			
						
		}
		System.out.println("single number present in given array is - "+singlenum);
	}
			
	}
	
