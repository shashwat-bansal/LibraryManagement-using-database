package driver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import management.BookManage;
import management.IssuerManage;


public class Main {	
	public static void main(String[] args) {				
		 try {
			BufferedReader in =new BufferedReader(new InputStreamReader(System.in));  
		
			String choice = "0";
		
			while(true) {
				System.out.println("Choose one of following \n"
						+ " 1.Book Management System \n 2.Issuer Management System \n 3.Exit");
				choice = in.readLine();
				
				switch (choice) {
					case"1" :
						BookManage bookManage = new BookManage();
						
						System.out.println("Please enter a choice: \n 1.Enter new book details \n "
										+ "2.Update book details \n 3.Delete book details \n"
										+ " 4.View all entries \n 5.Exit");
								
						choice = in.readLine();
						
						switch (choice) {
						
							case "1" :
								bookManage.create();
								break;
								
							case "2" :
								bookManage.displayAll();
								bookManage.update();
								break;
								
							case "3" :
								bookManage.displayAll();
								bookManage.delete();				
								break;
								
							case "4" :
								bookManage.displayAll();
								break;
								
							case "5" :
								System.exit(0);
								break;
								
							default:
								System.out.println("Invalid Choice. Please try again.");
						}
						break;		
						
					case "2" :
					IssuerManage issuerManage = new IssuerManage();
						
					System.out.println("Please enter a choice: \n 1.Enter new Issuer details \n "
							+ "2.Update issuer details \n 3.Delete issuer details \n"
							+ " 4.View all entries \n 5.Exit");
					
					choice = in.readLine();
					
					switch (choice) {
					
						case "1" :
							issuerManage.create();
							break;
							
						case "2" :
							issuerManage.displayAll();
							issuerManage.update();
							break;
							
						case "3" :
							issuerManage.displayAll();
							issuerManage.delete();				
							break;
							
						case "4" :
							issuerManage.displayAll();
							break;
							
						case "5" :
							System.exit(0);
							break;
							
						default:
							System.out.println("Invalid Choice. Please try again.");
						}
					break;
					
			
					case "3" :
						System.exit(0);
						break;
						
					default:							
						System.out.println("Invalid Choice. Please try again.");
				}			
			}
		} catch(Exception e) {}
	}
}
	
				
		
		
	
