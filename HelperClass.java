package hundekennel;

import java.util.Random;

public class HelperClass {

		public static void fillWithRand(int[] myLocalArr, int randRange){
		Random myRand = new Random();
		for (int i = 0;i < myLocalArr.length;i++) {
			int randInt = myRand.nextInt(randRange)+1;
			myLocalArr[i]=randInt;
		}
	}
	
}
