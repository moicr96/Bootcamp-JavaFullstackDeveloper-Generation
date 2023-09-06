import java.util.Random;

public class CicloRunnable implements Runnable {
	private int max = 0;
	private Random random;
	private String name;

	public CicloRunnable(int max, String name) {
		this.max = max;
		setName(name);
		random = new Random();
	}// CicloRunnable

	public String getName() {
		return name;
	}// getName

	private void setName(String name) {
		this.name = name;
	}// setName

	@Override
	public void run() {
		int cont = 0;
		while (cont < this.max) {
			System.out.println(this.getName() + ": " + cont);
			cont++;
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // catch
		} // while
		System.out.println("***********" + this.getName() + " FIN");
	}// run

	public static void main(String[] args) {
		CicloRunnable c1 = new CicloRunnable(15, "Thread 1");
		CicloRunnable c2 = new CicloRunnable(20, "Thread 2");
		CicloRunnable c3 = new CicloRunnable(10, "Thread 3");
		CicloRunnable c4 = new CicloRunnable(5, "Thread 4");

		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		Thread t4 = new Thread(c4);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}// main
}// class CicloThread
