/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
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

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		//arrayの中にある各list、1つ1つチェックして"レアル・マドリード"か"バルセロナ"がequals(String)だったら、除外

		Iterator<Player> i = array.iterator();
		while (i.hasNext()) {
			Player members = i.next();

			if (members.getTeam().equals("レアル・マドリード") || members.getTeam().equals("バルセロナ")) {
				i.remove();
			}
		}

		// ★ 削除後のArrayListの中身を全件出力してください

		for (Player toString : array) {
			System.out.println(toString);
		}

	}
}
