package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},		//0列目
				{70,8,90,1000}	//1列目
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください

		double sum = 0;
		int index = 0;

		for(int i = 0;i < array.length;i++) {			//iが列
			for(int j = 0;j < array[i].length;j++) {	//jが各配列番号
				sum += array[i][j];
				index++;
			}
		}

		System.out.println("合計値：" + sum);
		System.out.println("値数：" + index);
		System.out.println("平均値：" + sum/index);

	}
}
