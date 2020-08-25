package ThreadExample;

public class ThreadEx1 implements Runnable {

	public static void main(String[] args) {
		ThreadEx1 t = new ThreadEx1();
		Thread th = new Thread(t);
		th.start();
		
		Thread th1 = new Thread(t);
		th1.start();
	}

	@Override
	public void run() {
		for(int i = 0; i<10;i++)
		{
			System.out.print(i);
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
