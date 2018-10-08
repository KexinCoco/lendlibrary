

import java.util.ArrayList;




public class Database{
	public static ArrayList <Book> name = new ArrayList <Book> ();
    public static void fillArray()
	
{

	name.add(new Book("Paper Town", "John Green","Mystery") );
	name.add(new Book("The Magpie Murders", " Anthony Horowitz","Mystery") );
	name.add(new Book("Harry Poter", "J.K. Rowling","Fantasy") );
	name.add(new Book("The Lion, the Witch and the Wardrobe", "C. S. Lewis","Fantasy") );
	name.add(new Book("Jane Eyre", "Charlotte Bront�","Love") );
	name.add(new Book("Pride and Prejudice" , "Jane Austen","Love") );
	name.add(new Book("The Hunger Games", "Suzanne Collins","Science fiction") );
	name.add(new Book("The Time Machine", "H. G. Wells", "Science fiction") );
	name.add(new Book("The Ultimate Hitchhiker's Guide", "Douglas Adams", "Science fiction") );
	
}
}
		
