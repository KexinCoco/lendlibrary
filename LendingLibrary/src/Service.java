import java.util.Scanner;

public class Service
	{
		public static void main(String[] args) {
			Scanner ask = new Scanner(System.in);
			System.out.println("Which genre of books do you like? Mystrey, Love, Science Fiction or Fantasy?");
			String answer = ask.nextLine(); 
			if (answer=="mystery") {
				System.out.println("We have two choices.");
			}
		}
			
            
	}
