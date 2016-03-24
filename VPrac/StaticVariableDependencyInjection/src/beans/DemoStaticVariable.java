package beans;

public class DemoStaticVariable {

	private static String name;

	public static void setName(String name) {
		DemoStaticVariable.name = name;
	}

	public static void show() {

		System.out.println(name);
	}
}
