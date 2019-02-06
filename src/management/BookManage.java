package management;

import java.util.*;

import java.io  .BufferedReader;
import java.io.InputStreamReader;
import data.Book;
import operation.Operate;
import utilities.Checks;

public class BookManage implements Manage<Object>{
	
	Operate<Book> obj= new Operate<Book>();
	
	public void create() {
		
		try {
			BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
			Book book =new Book();
			int id;
			while(true) {
				try {
					System.out.println("Enter Book id");
					int i =Integer.parseInt(in.readLine());
					if(i<0) {
						System.out.println("Enter valid id");
						continue;
					}
					book.setId(i);
					id=i;
					break;					
				}
				catch(Exception e) {
					System.out.println("Enter valid id");
				}
			}
			while(true) {
				System.out.println("Enter Book name");
				String j= in.readLine();
				if(Checks.IsValidName(j)) {
					book.setName(j);
					break;
				}
			}			
			while(true) {
				System.out.println("Enter name of the Author");
				String j= in.readLine();
				if(Checks.IsValidName(j)) {
					book.setAuthor(j);
					break;
				}
			}			
			while(true) {
				try {
					System.out.println("Enter number of copies in stock");
					int i=Integer.parseInt(in.readLine());
					book.setStock(i);
					break;
				}
				catch(Exception e) {
					System.out.println("Enter valid number");
				}
			}
			while(true) {
				try {
					System.out.println("Enter number of copies lent");
					int i=Integer.parseInt(in.readLine());
					book.setLent(i);
					break;
				}
				catch(Exception e) {
					System.out.println("Enter valid number");
					continue;
				}
			}
			obj.create(id, book);
			System.out.println("Book updated in Inventory");			
		} catch(Exception e) {}		
	}
		
	public void update()
	{
		try {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
			
			Book book = new Book();
			int id;
			while(true) {
				System.out.println("Enter Book id to be updated");
				id =Integer.parseInt(in.readLine());
				if(obj.IsIdExist(id, book.getClass().getSimpleName()))
					break;
				System.out.println("Entry not found, Enter again.");
			}
			while(true) {
				try {
					System.out.println("Enter new Book id");
					int i =Integer.parseInt(in.readLine());
					if(i<0) {
						System.out.println("Enter valid id");
						continue;
					}
					book.setId(i);
					break;	
				}
				catch(Exception e) {
					System.out.println("Enter valid id");
					continue;}
			}
				
			while(true) {
				System.out.println("Enter new Book name");
				String j= in.readLine();
				if(Checks.IsValidName(j)) {
					book.setName(j);
					break;
				}
			}
				
			while(true) {
				System.out.println("Enter new name of the Author");
				String j= in.readLine();
				if(Checks.IsValidName(j)) {
					book.setAuthor(j);
					break;
				}
			}
			
			while(true) {
				try {
					System.out.println("Enter number of copies in stock");
					int i=Integer.parseInt(in.readLine());
					if(i<0) {
						System.out.println("Enter valid number");
						continue;
					}
					book.setStock(i);
					break;
				}
				catch(Exception e) {
					System.out.println("Enter valid number");
					continue;
				}
			}
				
			while(true) {
				try {
					System.out.println("Enter number of copies lent");
					int i=Integer.parseInt(in.readLine());
					if(i<0) {
						System.out.println("Enter valid number");
						continue;
					}
					book.setLent(i);
					break;
				}
				catch(Exception e) {
					System.out.println("Enter valid number");
					continue;
				}
			}
			obj.update(id,book);
			System.out.println("Entry Updated");
				
		}catch(Exception e) {}

	}
	
	public void displayAll() {
		Book book =new Book();
		List <Book> list= obj.viewAll(book);	
		Iterator<Book> itr = list.iterator();
		while(itr.hasNext()) {
			book = itr.next();
			System.out.println(book.toString());
		}		
	}
		
	public void delete() {
		try {
			BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
			int id;
			Book book =new Book();
			while(true) {
				System.out.println("Enter Book id to be deleted");
				id = Integer.parseInt(in.readLine());
				if(obj.IsIdExist(id, book.getClass().getSimpleName()))
					break;
				System.out.println("Entry not found. Enter again");
			}
			obj.delete(id,book);
			System.out.println("Entry Deleted");
		} catch(Exception e) {}		
	}
}


