package etechtexas_assessment;

import java.util.HashMap;

public class assessment02 
{

	public static void main(String[] args) 
	{
		int[] nums = {1,1,3,1,3,8};
		 
	     HashMap<Integer,Integer> intMap = new HashMap<Integer,Integer>();
	     
	     for(int i:nums)
	     {
	            if(intMap.containsKey(i))
	            {
	                intMap.put(i, intMap.get(i)+1);
	            } 
	            else
	            {
	                intMap.put(i, 1);
	            }
	        }
	        for(int a:nums){
	            if(intMap.get(a)==1){
	                System.out.println(a+" is single Number in list");
	            }
		
	}

}
}
