package pl.mzerek.util;

import java.util.ArrayList;
import java.util.List;

public class RandomUtil {

	public static final String[] members = { "Robert", "Kamil", "Darek", "Piotrek", "Maciek",
			"Damian N.", "Arek", "Marek", "Damian M.", "Rafal" };

	public static void main(String[] args) {
		List<Integer> randomTab = new ArrayList<>();		
		
		for(int i = 1; i<10;i++){
			int tmpVal = randomInt();
			while(!randomTab.contains(tmpVal)){
				randomTab.add(tmpVal);
			}
		}
	}
	
	private static int randomInt(){
		return (int) (Math.random() * 10 + 1);
	}

}
