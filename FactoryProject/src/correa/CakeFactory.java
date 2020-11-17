package correa;

public class CakeFactory {
	public Cake orderCake(String type) {
		if (type.equals("chocolate")) {
			return new ChocolateCake();
		} else if (type.equals("yellow")) {
			return new YellowCake();
		} else {
			return new RedVelvetCake();
		}
	}

}
