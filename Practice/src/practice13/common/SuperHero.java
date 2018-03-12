package practice13.common;

public class SuperHero extends Hero{

	public SuperHero() {
		super();
	}


	Item equipment;


	public int attack() {
		return super.attack() + equipment.getAdditionalDamage();
	}

	//アクセサ
	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}
}
