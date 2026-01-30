class Library
{
	int bookId;
	String title;
	String author;
	boolean isAvailable=true;
	
	Library(int bookId,String title,String author)
	{
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.isAvailable=isAvailable;
		
	}
	void display()
	{
		System.out.println("BookId"+" ="+bookId);
		System.out.println("Booktitle"+"= "+title);
		System.out.println("Bookauthor"+" ="+author);
		
	}
	void borrowbook()
	{
		if(isAvailable)
		{
			isAvailable=false;		
			System.out.println("Book is Available");
		}
		else
		{
			
			System.out.println("Book is borrowed");
		}
		
	}
	void returnbook()
	{
		isAvailable=true;
		System.out.println("Book is return successfully");
		
	}
	
}