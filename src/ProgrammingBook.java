public class ProgrammingBook extends Book {
	private String language;
	private String framework;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getFramework() {
		return framework;
	}

	public void setFramework(String framework) {
		this.framework = framework;
	}

	ProgrammingBook(String name, double price, String author,
                    String language, String framework) {
		super(name, price, author);
		this.language = language;
		this.framework = framework;
	}

	@Override
	public double getAmount() {
		return this.getPrice() * 0.95;
	}
}
