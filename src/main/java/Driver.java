import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment(12);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement(23);
		
		System.out.println("Current count:" + counter.getCount());

		counter.multiplyBy(6);
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
