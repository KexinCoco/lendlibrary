
public class Book
	{
        private String bookname;
        private String auther;
        private String genre;
		

		public Book (String a, String b, String c)
		{
			bookname=a;
			auther=b;
			genre=c;
			
			
		}


		public String getBookname()
			{
				return bookname;
			}


		public void setBookname(String bookname)
			{
				this.bookname = bookname;
			}


		public String getAuther()
			{
				return auther;
			}


		public void setAuther(String auther)
			{
				this.auther = auther;
			}


		public String getGenre()
			{
				return genre;
			}


		public void setGenre(String genre)
			{
				this.genre = genre;
			}
		
		
		
		
		
		
		
	}
