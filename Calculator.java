public class Calculator {

	private int result;

	/**
		Суммируем аргументы
		@params params Аргументы суммирования
	*/
	public void add(int ...params) {
		for (Integer param : params) {
		this.result += param;
		}
	}

	public int getResult() {
		return this.result;
	}

	public void cleanResult() {
		this.result = 0;
	}
}