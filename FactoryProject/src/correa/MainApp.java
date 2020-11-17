package correa;

public class MainApp {
	public static void main(String[] args) {
		CakeFactory factory = new CakeFactory();
		CakeStore store = new CakeStore(factory);
		Cake cake1 = store.onlineOrder("chocolate");
		Cake cake2 = store.onlineOrder("yellow");
		Cake cake3 = store.onlineOrder("red velvet");

		System.out.println("Order completed: " + cake1.getName());
		System.out.println("Order completed: " + cake2.getName());
		System.out.println("Order completed: " + cake3.getName());
	}

}
