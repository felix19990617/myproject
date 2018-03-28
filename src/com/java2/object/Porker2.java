package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Porker2 {

	public static void main(String[] args) {
		Random random = new Random();
		String flowers = "SHDC";
		List<Integer> porker=new ArrayList();
		//«Ø¥ßporker
		for(int i =0;i<52;i++) {
			porker.add(i);
		}
		//¬~µP
		for(int i =0;i<52;i++) {
			int r = random.nextInt(52);
			int temp = porker.get(i);
			porker.set(i, porker.get(r));
			porker.set(r, temp);
		}
		
		for(int i=0;i<52;i++) {
			System.out.println((flowers.charAt(porker.get(i)/13))+""+((porker.get(i)%13)+1));
		}
	}

}
