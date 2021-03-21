package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i=0;i<eggs.size();i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for(int i=0;i<oysters.size();i++) {
			if(oysters.get(i) == true) {
				pearls++;
			}
		}
		return pearls;
		
	}
	
	public static double findTallest(List<Double> peeps) {
		double tallest = peeps.get(0);
		for(int i=0;i<peeps.size();i++) {
			if(peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
		
	}
	
	public static String findLongestWord(List<String> words) {
		String longestWord = words.get(0);
		for(int i=0;i<words.size();i++) {
			if(longestWord.length()<words.get(i).length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
		
	}
	
	public static boolean containsSOS(List<String> message) {
		String SOS = "... --- ...";
		for(int i=0;i<message.size();i++) {
			if(message.get(i).equals(SOS)) {
				return true;
			}
		}
		 return false;
	}
	
	public static List<Double> sortScores(List<Double> scores){
		double temp = scores.get(0);
		for(int i=1;i<scores.size();i++) {
			if(scores.get(i)<temp) {
				scores.set(i-1, scores.get(i));
				scores.set(i, temp);
			}
			temp = scores.get(i);
			
		}
		
		for(int i=1;i<scores.size();i++) {
			if(scores.get(i-1)>scores.get(i)) {
				 sortScores(scores);
			}
			
		}
		return scores;
		
	}
	
	
	
}
