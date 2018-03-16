/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra18_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> array = new ArrayList<Player>();

		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] splitLine = line.split(",", 0);

				Player list = new Player();

				list.setPosition(splitLine[0]);
				list.setName(splitLine[1]);
				list.setCountry(splitLine[2]);
				list.setTeam(splitLine[3]);

				array.add(list);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(array);

		int gkCount = 0;
		int dfCount = 0;
		int mfCount = 0;
		int fwCount = 0;

		for(Player list:array){
			switch(list.getPosition()) {
			case "GK":
				if(gkCount < 1) {
					System.out.println(list);
					gkCount++;
				}
				break;
			case "DF":
				if(dfCount < 4) {
					System.out.println(list);
					dfCount++;
				}
				break;
			case "MF":
				if(mfCount < 4) {
					System.out.println(list);
					mfCount++;
				}
				break;
			case "FW":
				if(fwCount < 2) {
					System.out.println(list);
					fwCount++;
				}
				break;
			}

		}





	}
}
