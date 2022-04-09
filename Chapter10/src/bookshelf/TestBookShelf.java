package bookshelf;

public class TestBookShelf {

	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		shelfQueue.endQueue("태백산맬1");
		shelfQueue.endQueue("태백산맬2");
		shelfQueue.endQueue("태백산맬3");
		
		
		System.out.println(shelfQueue.deQueue());
		
	}

}
