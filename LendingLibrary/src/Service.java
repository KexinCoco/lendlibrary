import java.util.Scanner;

public class Service
	{
		public static void main(String[] args) {
			boolean i = true;
			while(i) {
			Database.fillArray();
			Scanner ask = new Scanner(System.in);
			System.out.println("Which genre of books do you like? Mystrey, Love, Science Fiction or Fantasy?");
			String answer = ask.nextLine(); 
			if (answer.equals("Mystery")) {
				System.out.println("Please type in your choice:");
				System.out.println("Paper Town or The Magpie Murder");
				Scanner ask2 = new Scanner(System.in);
				String answer2 = ask2.nextLine();
				if(answer2.equals("Paper Town")) {
					System.out.println("You can keep this book for three days, please return yes or no to confirm.");
					Scanner ask3 = new Scanner(System.in);
					String answer3 = ask3.nextLine();
					if(answer3.equals("yes")) {
						System.out.println("Success! Name:" + Database.name.get(0).getBookname() +" Author:"+ Database.name.get(0).getAuther() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
					
				}
				else if(answer2.equals("The Magpie Murder")) {
					System.out.println("You can keep this book for five days, please return yes or no to confirm.");
					Scanner ask4 = new Scanner(System.in);
					String answer4 = ask4.nextLine();
					if(answer4.equals("yes")) {
						System.out.println("Success! Name:" + Database.name.get(1).getBookname() +" Author:"+ Database.name.get(1).getAuther() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
				}
				
			}
			else if(answer.equals("Love"))	{
				System.out.println("Please type in your choice:");
				System.out.println("Jane Eyre or Pride and Prejudice");
				Scanner ask5 = new Scanner(System.in);
				String answer5 = ask5.nextLine();
				if(answer5.equals("Jane Eyre")) {
					System.out.println("You can keep this book for three days, please return yes or no to confirm.");
					Scanner ask6 = new Scanner(System.in);
					String answer6 = ask6.nextLine();
					if(answer6.equals("yes")) {
						System.out.println("Success! Name:" + Database.name.get(4).getBookname() +" Author:"+ Database.name.get(4).getAuther() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
					
				}
				else if(answer5.equals("Pride and Prejudice")) {
					System.out.println("You can keep this book for five days, please return yes or no to confirm.");
					Scanner ask7 = new Scanner(System.in);
					String answer7 = ask7.nextLine();
					if(answer7.equals("yes")) {
						System.out.println("Success! Name:" + Database.name.get(5).getBookname() +" Author:"+ Database.name.get(5).getAuther() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
				}
				
				
			}
			
			else if(answer.equals("Science Fiction")) {
				System.out.println("Please type in your choice:");
				System.out.println("The Hunger Games or The Time Machine");
				Scanner ask8 = new Scanner(System.in);
				String answer8 = ask8.nextLine();
				if(answer8.equals("The Hunger Games")) {
					System.out.println("You can keep this book for three days, please return yes or no to confirm.");
					Scanner ask9 = new Scanner(System.in);
					String answer9 = ask9.nextLine();
					if(answer9.equals("yes")) {
						System.out.println("Success! Name:" + Database.name.get(6).getBookname() +" Author:"+ Database.name.get(6).getAuther() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
					
				}
				else if(answer8.equals("The Time Machine")) {
					System.out.println("You can keep this book for five days, please return yes or no to confirm.");
					Scanner ask10 = new Scanner(System.in);
					String answer10 = ask10.nextLine();
					if(answer10.equals("yes")) {
						System.out.println("Success! Name:" + Database.name.get(7).getBookname() +" Author:"+ Database.name.get(7).getAuther() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
				}
				
			}
			
			else if(answer.equals("Fantasy")) {
				System.out.println("Please type in your choice:");
				System.out.println("Harry Poter or The Lion");
				Scanner ask11 = new Scanner(System.in);
				String answer11 = ask11.nextLine();
				if(answer11.equals("Harry Poter")) {
					System.out.println("You can keep this book for three days, please return yes or no to confirm.");
					Scanner ask12 = new Scanner(System.in);
					String answer12 = ask12.nextLine();
					if(answer12.equals("yes")) {
						System.out.println("Success! Name:" + Database.name.get(2).getBookname() +" Author:"+ Database.name.get(2).getAuther() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
					
				}
				else if(answer11.equals("The Lion")) {
					System.out.println("You can keep this book for five days, please return yes or no to confirm.");
					Scanner ask13 = new Scanner(System.in);
					String answer13 = ask13.nextLine();
					if(answer13.equals("yes")) {
						System.out.println("Success! Name:" + Database.name.get(3).getBookname() +" Author:"+ Database.name.get(3).getAuther() );
					}
					else {
						System.out.println("Thanks for visiting.");
					}
					
				}
				
				
			}
			
		}
		}
            
	}
