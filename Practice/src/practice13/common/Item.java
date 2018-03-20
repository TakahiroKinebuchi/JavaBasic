package practice13.common;

public class Item {

	//フィールド
	//アイテム名
	private String name;
	//追加ダメージ量
	private int additionalDamage;


	//メソッド：各フィールドのアクセサ
	//アイテム名を得る
	 public String getName() {
		 return this.name;
	 }

	 //アイテム名を設定する
	 public void setName(String name) {
		 this.name = name;
	 }

	 //追加ダメージ量を得る
	 public int getAdditionalDamage() {
		 return this.additionalDamage;
	 }

	 //追加ダメージ量を設定する
	 public void setAdditionalDamage(int additionalDamage) {
		 this.additionalDamage = additionalDamage;
	 }


	 //装備品の初期値を設定するコンストラクタ
	 public Item(String name, int additionalDamage) {
		 this.name = name;
		 this.additionalDamage = additionalDamage;
	 }
}
