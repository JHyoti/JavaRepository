

import java.util.Arrays;
import java.util.List;

public class DemoList {

		public static void main(String[] args) {
			List <Integer>list= Arrays.asList(1,2,3);
			list.forEach((x)->{
			     x+=2;
				System.out.println(x);
			

		});
		}
}
