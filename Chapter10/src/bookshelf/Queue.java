package bookshelf;

public interface Queue {
	
	void endQueue(String title);
	String deQueue();
	int getSize();
	
}
