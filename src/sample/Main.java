package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		List<String> answerlist = new ArrayList<>();
		String question = "赤いフルーツを選んでください";
		
		answerlist.add("バナナ");
		answerlist.add("イチゴ");
		answerlist.add("メロン");
		
		Map<Integer, List<String>> keyToChoice = new HashMap<>();
		Random r = new Random();
		int answerNumber = r.nextInt(2);
		
		System.out.println(String.format("問題文: %s", question));
		
		for (int i = 0; i < answerlist.size(); i++) {
			System.out.println(answerlist.get(i));
			
		}
		
		String inputAnswer = new Scanner(System.in).next();
		
	}

}
