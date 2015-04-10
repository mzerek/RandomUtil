package pl.mzerek.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RandomUtil {

	public static final String[] members = readFromFile();

	public static void main(String[] args) {
		List<Integer> randomTab = new ArrayList<>();
		List<String> currentTeams = new ArrayList<>();
		int i = 0;
		while (i < 10) {
			int tmpVal = randomInt();
			if (!randomTab.contains(tmpVal)) {
				randomTab.add(tmpVal);
				i++;
			}
		}

		for (Integer k : randomTab) {
			System.out.print(k + " | ");
		}
		System.out.println(" ");

		int count = 0;

		for (Integer k : randomTab) {
			if (count == 5) {
				currentTeams.add("========");
			}
			currentTeams.add(k + "." + members[k - 1]);
			count++;
		}

		System.out.println(" ");

		for (String member : currentTeams) {
			System.out.println(member);
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Read from file:  ");
		readFromFile();

	}

	private static int randomInt() {
		return (int) (Math.random() * 10 + 1);
	}

	private static String[] readFromFile() {

		File file = new File("c:/", "test.txt");
		
		String[] players = new String[10];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String line = null;
			int i=0;
			while ((line = br.readLine()) != null && i < 10) {
				players[i] = line;
				i++;
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		return players;
	}

}
