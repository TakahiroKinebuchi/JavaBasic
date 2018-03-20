/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください

		Hero hero1 = new Hero();
		Slime slime1 = new Slime();

		hero1.setName("勇者");
		slime1.setName("スライム");

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */

		while(true) {
			boolean isSlimeDead = slime1.damage(hero1.attack());
			if(isSlimeDead) {
				System.out.println(hero1.getName() + "は" + slime1.getName() + "との戦闘に勝利した");
				break;
			}
			boolean isHeroDead = hero1.damage(slime1.attack());
			if(isHeroDead) {
				System.out.println(slime1.getName() + "は" + hero1.getName() + "との戦闘に勝利した");
				break;
			}
		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
		}
	}
}
