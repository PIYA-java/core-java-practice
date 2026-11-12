package mock;

import java.util.List;

public class m3 {

	public static void main(String[] args) {
		
List<Integer> list=List.of(10,77,8,40,33,89,200);
list.stream()
.sorted((i,j)->{return Integer.compare(j,i);})
.limit(3)
.skip(2)
.forEach((i)->{System.out.println((i));});
	
	}
}

	
