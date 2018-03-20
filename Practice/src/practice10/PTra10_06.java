package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Scanner;
public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		//車の製造
		Scanner scanner = new Scanner(System.in);
		Car[] car = new Car[3];

		for(int i = 0;i < car.length;i++) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println((i+1) + "台目");
			car[i] = new Car();

			System.out.println("シリアルナンバー（5桁の数字）、車体カラー、ガソリン量（2桁の数字）をカンマ区切りで入力して下さい。");
			String line = scanner.nextLine();

			String[] inputInfo = line.split(",",0);

			car[i].serialNo = Integer.parseInt(inputInfo[0]);
			car[i].color = inputInfo[1];
			car[i].gasoline = Integer.parseInt(inputInfo[2]);
		}

		//それぞれの車を走らせる
		int distance = 300;
		int[] count = new int[car.length];

		for(int i = 0;i < car.length;i++) {
			int move = 0;
			while(distance - move > 0) {
				int ret = car[i].run();
				if(ret == -1) {
					count[i] = -1;
					break;
				}
				move += ret;
				count[i]++;
			}
		}

		//出力
		for(int i = 0;i < count.length;i++) {
			if(count[i] == -1) {
				System.out.println("目的地に到達できませんでした。");
			}else {
				System.out.println((i+1) + "台目は目的地にまで" + count[i] + "時間かかりました。残りのガソリンは、" + car[i].gasoline + "リットルです。");
			}
		}



	}
}
