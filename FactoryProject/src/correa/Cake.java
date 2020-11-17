package correa;

import java.util.ArrayList;

public abstract class Cake {
	protected String name;
	protected String baseFlavor;
	protected ArrayList<String> ingredients;

	public String getName() {
		return name;
	}

	public String getIngredients() {
		String str = "";
		for (int i = 0; i < ingredients.size(); i++) {
			str += "\n" + ingredients.get(i);
		}
		return str;
	}

	public void prepare() {
		System.out.println("Preaparing: " + this.toString());
	}

	public void bake() {
		System.out.println("Baking " + this.toString());
	}

	public void box() {
		System.out.println("Boxing " + this.toString());
	}

	public String toString() {
		return name + " with base flavor of " + baseFlavor;
	}

}
