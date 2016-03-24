package beans;

public class Cars {

	private String[] carName;
	private Engine[] engModel;

	public void setCarName(String[] carName) {
		this.carName = carName;
	}

	public void setEngModel(Engine[] engModel) {
		this.engModel = engModel;
	}

	public void printCarData() {

		for (String cars : carName) {
			System.out.println(cars);
		}

		for (Engine Engine : engModel) {
			System.out.println(Engine.getModelYear());
		}

	}
}
