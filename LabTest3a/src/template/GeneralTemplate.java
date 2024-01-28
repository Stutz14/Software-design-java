package template;

public class GeneralTemplate {
	public void transaction() {
		System.out.println("Starting Transaction in transaction class ");
		this.transactionPartA();
		this.transactionPartB();
		this.transactionPartC();
	}
	
	public void transactionPartA() {
		System.out.println("Doing PartA in transaction class ");
	}

	public void transactionPartB() {
		System.out.println("Doing PartB in transaction class ");
	}

	public void transactionPartC() {
		System.out.println("Doing PartC in transaction class ");
	}
}
