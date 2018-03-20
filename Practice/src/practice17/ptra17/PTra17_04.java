/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

public class PTra17_04 {
	public static void main(String[] args) {

		String str = "スッキリわかるJava入門";

		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
		 * ※ Thread.sleep を使用すること
		 */

		//文字列を配列に一文字ずつセット
		char data[] = str.toCharArray();

		//配列数を取得
		int arr_num = data.length;

		//i = 0 ~ i = 12(i < data.lengthとすることで、できる) の間繰り返しを行う。ex.data[0] = "ス"・・・以下同様
		for(int i = 0;i < arr_num; i++) {
			try {
				Thread.sleep(1000);//10秒間眠るThread.sleep(millisecond)
			}catch(InterruptedException e) {
				//例外が発生しても、もみ消す
			}
			System.out.print(data[i]);
		}
	}
}
