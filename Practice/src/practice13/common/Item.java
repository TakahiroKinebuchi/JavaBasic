package practice13.common;

public class Item {

	//フィールド
	private String name;
	private int additionalDamage;


	//メソッド：各フィールドのアクセサ
	 public String getName() {
		 return this.name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public int getAdditionalDamage() {
		 return this.additionalDamage;
	 }

	 public void setAdditionalDamage(int additionalDamage) {
		 this.additionalDamage = additionalDamage;
	 }


	 //コンストラクタ
	 public Item(String name, int additionalDamage) {
		 this.name = name;
		 this.additionalDamage = additionalDamage;
	 }
}
