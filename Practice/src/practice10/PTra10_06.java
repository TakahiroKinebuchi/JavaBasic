package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car car = new Car();
		Car car1 = new Car();
		Car car2 = new Car();

		car.color = "Red";
		car1.color = "Blue";
		car2.color = "Green";

		car.gasoline = 50;
		car1.gasoline = 60;
		car2.gasoline = 70;

		//目的地までの距離
		int distance = 300;
		int distance1 = 300;
		int distance2 = 300;

		int count = 0;
		while(true) {
			distance -= car.run();
			count += 1;

			if(car.gasoline < 0) {
				System.out.println("目的地に到達できませんでした");
				break;
			}

			if(distance <= 0) {
				System.out.println("目的地にまで" + count + "時間かかりました。残りのガソリンは、" + car.gasoline + "リットルです");
				break;
			}
		}


		int count1 = 0;
		while(true) {
			distance1 -= car1.run();
			count1 += 1;

			if(car1.gasoline < 0) {
				System.out.println("目的地に到達できませんでした");
				break;
			}

			if(distance1 <= 0) {
				System.out.println("目的地にまで" + count1 + "時間かかりました。残りのガソリンは、" + car1.gasoline + "リットルです");
				break;
			}
		}


		int count2 = 0;
		while(true) {
			distance2 -= car2.run();
			count2 += 1;

			if(car2.gasoline < 0) {
				System.out.println("目的地に到達できませんでした");
				break;
			}

			if(distance2 <= 0) {
				System.out.println("目的地にまで" + count2 + "時間かかりました。残りのガソリンは、" + car2.gasoline + "リットルです");
				break;
			}
		}


	}
}
