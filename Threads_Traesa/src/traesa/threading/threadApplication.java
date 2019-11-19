package traesa.threading;

import java.util.concurrent.ScheduledThreadPoolExecutor;
//import java.util.concurrent.ScheduledFuture;
import static java.util.concurrent.TimeUnit.*;

import java.util.concurrent.ExecutorService;

public class threadApplication {

	public static void main(String[] args) {
		//Task taskRunner = new Task();
		//taskRunner.start();
		System.out.println("Hello Threads");
		//Task taskRunner2 = new Task();
		//taskRunner2.start();
		
		addThreadsToPool();
		
		
		
	}
	
	public static void addThreadsToPool() {
		
		ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(5);
		threadPool.scheduleAtFixedRate(new CheckTime(), 0, 2, SECONDS);
		for (int i=0; i<6; i++) {
			String nxtToDo = getNextReminder( 1,  i);
			threadPool.scheduleAtFixedRate(new ProcessReminder("To Do: ", nxtToDo), 5, 5, SECONDS);
		}
		//threadPool.scheduleAtFixedRate(new ProcessReminder("To Do: ", nxtToDo), 5, 5, SECONDS);
		
		for (int i=0; i<5; i++) {
			String nxtCheckOn = getNextReminder( 2,  i);
			threadPool.scheduleAtFixedRate(new ProcessReminder("Check On: ", nxtCheckOn), 0, 7, SECONDS);
		}
		//threadPool.scheduleAtFixedRate(new ProcessReminder("Check On: ", "Hannah"), 10, 7, SECONDS);
		for (int i=0; i<3; i++) {
			String nxtCheckOn = getNextReminder( 3,  i);
			threadPool.scheduleAtFixedRate(new ProcessReminder("Run Errands: ", nxtCheckOn), 8, 12, SECONDS);
		}
		//threadPool.scheduleAtFixedRate(new ProcessReminder("Run Errands: ", "Grocery Shopping"), 15, 15, SECONDS);
		
		System.out.println("Number of Threads: " + Thread.activeCount());
		
		try {
			Thread.sleep(20000);
		}
		catch(InterruptedException e)
		{}
		
		threadPool.shutdown();
	}
	
	synchronized public static String getNextReminder(int type, int currentIndex) {
		String[] listToDo= {"Read Scripture", "Do Homework", "Teach Science", "Plan Church Activity", "Make Dinner", "Play with Kids"};
		String[] listChkOn= {"Kyle", "Dallin", "Zenna", "Sarah", "Hannah"};
		String[] listErrands= {"Grocery Shopping", "Temple", "Hannah Birthday Gifts"};
		
		switch (type) {
		case 1:{
			return listToDo[currentIndex];
		}
		case 2:{
			return listChkOn[currentIndex];
		}
		case 3:{
			return listErrands[currentIndex];
		}
		default:
			return null;
		}
		
	}

}


class Task extends Thread{
	
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("number:" + i);
		}
		
	}
	
}