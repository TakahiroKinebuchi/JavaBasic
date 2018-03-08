package practice10;

public class Car {

	int serialNo;
	String color;
	int gasoline;

	int run() {
		if(this.gasoline > 0) {
		this.gasoline -= 1;
		return new java.util.Random().nextInt(15);

		}else {
		return -1;
	}
	}
}
