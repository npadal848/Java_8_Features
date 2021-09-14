package multithreading;

class RunnableTest implements Runnable {
	@Override
	public void run() {
		System.out.println("run");
	}
}

public class ThreadRunnableTest {

	public static void main(String[] args) {
		RunnableTest runnable = new RunnableTest();
		Thread t = new Thread(runnable);
		
		System.out.println("before start");
		t.start();
		System.out.println("after start");
	}
}
