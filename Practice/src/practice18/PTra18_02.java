/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */


		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう



		ArrayList<Player> array = new ArrayList<Player>();

		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(",",0);

                Player list = new Player();

                list.setPosition(splitLine[0]);
                list.setName(splitLine[1]);
                list.setCountry(splitLine[2]);
                list.setTeam(splitLine[3]);

                array.add(list);

            }
		}catch(FileNotFoundException e){
			System.out.println("ファイルが見つかりません");
		}




		for(Player toString:array) {
			System.out.println(toString);
		}
	}
}
