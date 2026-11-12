package mock;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class m2 {

	public static void main(String[] args) {
		List <Integer> ls=List.of(11,22,11,22,23);
		Map <Integer,Integer> mp=new HashMap<Integer,Integer>();
		
		for(int i=0;i<ls.size();i++)
		{
			if(mp.containsKey(ls.get(i)))
			{
				int freq=mp.get(ls.get(i))+1;
				mp.put(ls.get(i), freq);
				
				
			}
			else
			{
				mp.put(ls.get(i),1);
			}
		}
		System.out.println(mp);

	}

}
