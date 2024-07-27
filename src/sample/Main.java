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
		
		System.out.println("答えを入力してください");
		
		while (true) {
		
			String inputAnswer = new Scanner(System.in).next();
		
		/*
		 *	以下の条件分岐内でこの無限ループからの脱出を宣言する。
		 */
			if(inputAnswer.equals(answerlist.get(1))) {
				System.out.println("正解！");
			} else {
				System.out.println("不正解！");
			}
		
		}
	}

}
