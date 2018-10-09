import java.util.Scanner;

public class Service
	{
		public static void main(String[] args) {
			boolean i = true;
			while(i) {
			Database.fillArray();
			Scanner ask = new Scanner(System.in);
			System.out.println("Please type in the number of the genre you like. 1 = Mystery  2 = Love  3 = Science Fiction  4 = Fantasy");
			int answer = ask.nextInt(); 
			if (answer==1) {
				System.out.println("Please type in the letter of your choice:");
				System.out.println("a = Paper Town  b = The Magpie Murder");
				Scanner ask2 = new Scanner(System.in);
				String answer2 = ask2.nextLine();
				if(answer2.equals("a")) {
					System.out.println("You can keep this book for three days, please return yes or no to confirm.");
					Scanner ask3 = new Scanner(System.in);
					String answer3 = ask3.nextLine();
					if(answer3.equals("yes")) {
						System.out.println("Success!  Name:" + Database.name.get(0).getBookname() +"    Author:"+ Database.name.get(0).getAuthor() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
					
				}
				else if(answer2.equals("b")) {
					System.out.println("You can keep this book for five days, please return yes or no to confirm.");
					Scanner ask4 = new Scanner(System.in);
					String answer4 = ask4.nextLine();
					if(answer4.equals("yes")) {
						System.out.println("Success!  Name:" + Database.name.get(1).getBookname() +"    Author:"+ Database.name.get(1).getAuthor() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
				}
				
			}
			else if(answer==2)	{
				System.out.println("Please type in the letter of your choice:");
				System.out.println("a = Jane Eyre  b = Pride and Prejudice");
				Scanner ask5 = new Scanner(System.in);
				String answer5 = ask5.nextLine();
				if(answer5.equals("a")) {
					System.out.println("You can keep this book for three days, please return yes or no to confirm.");
					Scanner ask6 = new Scanner(System.in);
					String answer6 = ask6.nextLine();
					if(answer6.equals("yes")) {
						System.out.println("Success!  Name:" + Database.name.get(4).getBookname() +"    Author:"+ Database.name.get(4).getAuthor() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
					
				}
				else if(answer5.equals("b")) {
					System.out.println("You can keep this book for five days, please return yes or no to confirm.");
					Scanner ask7 = new Scanner(System.in);
					String answer7 = ask7.nextLine();
					if(answer7.equals("yes")) {
						System.out.println("Success!  Name:" + Database.name.get(5).getBookname() +"    Author:"+ Database.name.get(5).getAuthor() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
				}
				
				
			}
			
			else if(answer==3) {
				System.out.println("Please type in the letter of your choice:");
				System.out.println("a = The Hunger Games  b = The Time Machine");
				Scanner ask8 = new Scanner(System.in);
				String answer8 = ask8.nextLine();
				if(answer8.equals("a")) {
					System.out.println("You can keep this book for three days, please return yes or no to confirm.");
					Scanner ask9 = new Scanner(System.in);
					String answer9 = ask9.nextLine();
					if(answer9.equals("yes")) {
						System.out.println("Success!  Name:" + Database.name.get(6).getBookname() +"    Author:"+ Database.name.get(6).getAuthor() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
					
				}
				else if(answer8.equals("b")) {
					System.out.println("You can keep this book for five days, please return yes or no to confirm.");
					Scanner ask10 = new Scanner(System.in);
					String answer10 = ask10.nextLine();
					if(answer10.equals("yes")) {
						System.out.println("Success!  Name:" + Database.name.get(7).getBookname() +"    Author:"+ Database.name.get(7).getAuthor() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
				}
				
			}
			
			else if(answer==4) {
				System.out.println("Please type in the letter of your choice:");
				System.out.println("a = Harry Poter  b = The Lion, the Witch and the Wardrobe");
				Scanner ask11 = new Scanner(System.in);
				String answer11 = ask11.nextLine();
				if(answer11.equals("a")) {
					System.out.println("You can keep this book for three days, please return yes or no to confirm.");
					Scanner ask12 = new Scanner(System.in);
					String answer12 = ask12.nextLine();
					if(answer12.equals("yes")) {
						System.out.println("Success!  Name:" + Database.name.get(2).getBookname() +"    Author:"+ Database.name.get(2).getAuthor() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
					
				}
				else if(answer11.equals("b")) {
					System.out.println("You can keep this book for five days, please return yes or no to confirm.");
					Scanner ask13 = new Scanner(System.in);
					String answer13 = ask13.nextLine();
					if(answer13.equals("yes")) {
						System.out.println("Success!  Name:" + Database.name.get(3).getBookname() +"    Author:"+ Database.name.get(3).getAuthor() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
				}
				
				
			}
			
			System.out.println("");
		}
		}
            
	}
