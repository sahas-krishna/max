package max;
import java.util.*;
public class Maximum {
	public static void main(String arg[])
	{
		System.out.println(findy(new int[]{1,2,3,4,2,2,2,2,2,2}));
	}
	public static int findy(int a[])
	{
		/*HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		int max=a.length/2;
		int p=0;
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				p=hm.get(a[i]);
				hm.put(a[i],p+1);
			}
			else
				hm.put(a[i],1);
			if(p>=max)
			{
				return a[i];
			}
		}
		return -1;
	}*/
		
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		l.add(a[i]);
		Set<Integer>s=new HashSet<Integer>(l);
		for(Integer k:s)
		{
			if(Collections.frequency(l, k)>=a.length/2)
			{
				return k;
			}
		}
			
		return -1;
		
	}
}