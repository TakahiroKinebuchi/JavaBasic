package practice02;
/*
 * PTra02_10.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra02_10 {
	public static void main(String[] args) {
		int moneyInHand = 1000;	// 所持金
		int coffee = 120;	// コーヒーの値段
		int snack = 200;	// スナック菓子

		/*
		 * ●一本120円（税別）の缶コーヒーを2本
		 * ●一袋200円（税別）のスナック菓子を1袋
		 *
		 * ★ 上記の商品を購入したときの所持金を出力してください
		 * ※ 消費税は、全商品の合計に8%が加算されます
		 * ※ 日本円には小数点がありませんので、整数の値で出力してください(少数部分は切り捨て)
		 * ※ プログラムは何行書いても良いです
		 */

		double zei = 0.08;
		int total = coffee * 2 + snack;//合計金額120*2 + 200 = 440円
		double tax = total * zei;		//消費税440*0.08 =  35.2円

		int taxTruncation = (int)tax;	//消費税（少数切り捨て）35円
		int moneyInHand1;				//買った後の所持金
		moneyInHand1 = moneyInHand - (total + taxTruncation);//1000 - (440 + 35) = 525円



		System.out.println("買った後の所持金：" + moneyInHand1 + "円");//買った後の所持金525円
	}
}
