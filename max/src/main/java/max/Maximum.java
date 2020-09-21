package max;
import java.util.*;
//A class to find the maximum occurred element
public final class Maximum{
	
	//Constructor
	
	private Maximum() 
	{}
	 //To find the maximum occurrence
	
	public  static int findy(final int... array)throws InvalidException
	{		
		List<Integer> larray=new ArrayList<>();
		for(final Integer index:array)
		{
			larray.add(index);
		}
		Set<Integer>unique=new HashSet<>(larray);
		int result=Integer.MAX_VALUE;
		for(Integer element:unique)
		{
			if(Collections.frequency(larray, element)>=array.length/2)
			{
				result=element;
				break;
			}
		}
		if(result==Integer.MAX_VALUE)
		{
			throw new InvalidException("No element occurred more than the half of the length of the array");
		}
		else
		return result;
		
	}
}