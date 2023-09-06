import java.util.Random;

public class CicloThread extends Thread {
	private int max = 0;
	private Random random;

	public CicloThread(int max, String name) {
		this.max = max;
		setName(name);
		random = new Random();
	}// CicloThread constructor

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
		System.out.println("*********" + this.getName() + "FIN");
	}// run

	public static void main(String[] args) {
		CicloThread c1 = new CicloThread(15, "Thread 1");
		CicloThread c2 = new CicloThread(10, "Thread 2");
		CicloThread c3 = new CicloThread(20, "Thread 3");
		CicloThread c4 = new CicloThread(5, "Thread 4");

		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}// main
}// class CicloThread
