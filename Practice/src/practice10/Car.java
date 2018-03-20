package practice10;

public class Car {

	int serialNo;
	String color;
	int gasoline;

	int run() {
		if(gasoline > 0) {
		gasoline--;
		return new java.util.Random().nextInt(15)+1;

		}else {
		return -1;
	}
	}
}
