package traesa.threading;

public class ProcessReminder implements Runnable {
	private String Type;
	private String What;
	
	public ProcessReminder(String type, String what) {
		this.Type = type;
		this.What = what;
	}
	
	synchronized public void run() {
		System.out.println(this.Type + ": "+ this.What);
	}
	

}
