package beans;

public class DemoFactory {

	private DemoFactory() {
		throw new InstantiationError();
	}

	private static String car;

	public static void setCar(String car) {
		DemoFactory.car = car;
	}

	public static DemoInterface getCar() throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		DemoInterface demoInterface = (DemoInterface) Class.forName(car).newInstance();
		return demoInterface;

	}

}
