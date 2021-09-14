package multithreading;

class Test extends Thread {
	@Override
	public void run() {
		System.out.println("run");
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("before start");
		t.start();
		
		System.out.println("after start");
	}
}
