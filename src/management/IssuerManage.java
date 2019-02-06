package management;

import java.io  .BufferedReader;
import java.util.*;
import java.io.InputStreamReader;
import data.Issuer;
import operation.Operate;
import utilities.Checks;

public class IssuerManage implements Manage<Object>{
	
	Operate<Issuer> obj = new Operate<Issuer>();
	
	public void create() {		
		try {
			BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
			Issuer issuer =new Issuer();
			int id;
			
			while(true) {
				try {
					System.out.println("Enter Issuer id");
					int i =Integer.parseInt(in.readLine());
					if(i<0) {
						System.out.println("Enter valid id");
						continue;
					}
					issuer.setId(i);
					id=i;
					break;
					
				}
				catch(Exception e) {
					System.out.println("Enter valid id");
					continue;}
			}
			
			
			while(true) {
				System.out.println("Enter issuer name");
				String j= in.readLine();
				if(Checks.IsValidName(j)) {
					issuer.setName(j);
					break;
				}
				System.out.println("Enter again");
			}
			
			while(true) {
				System.out.println("Enter Book name");
				String j= in.readLine();
				if(Checks.IsValidName(j)) {
					issuer.setBook(j);
					break;
				}
				System.out.println("Enter again");
			}			
			while(true) {
				System.out.println("Enter Issue Date in format MM/DD/YYYY");
				String j= in.readLine();
				if(Checks.IsValidDate(j)) {
					issuer.setIssueDate(j);
					break;
				}
				System.out.println("Enter again");
			}
			while(true) {
				System.out.println("Enter Due Date in format MM/DD/YYYY");
				String j= in.readLine();
				if(Checks.IsValidDate(j)) {
					issuer.setDuedate(j);
					break;
				}
				System.out.println("Enter again");
			}			
			obj.create(id, issuer);
			System.out.println("Issuer updated in Database");			
		} catch(Exception e) {}		
	}
		
	public void update(){
		try {
			BufferedReader in =new BufferedReader(new InputStreamReader(System.in));			
			Issuer issuer =new Issuer();
			int i,id;
			while(true) {
				System.out.println("Enter Book id to be updated");
				id =Integer.parseInt(in.readLine());
				if(obj.IsIdExist(id, issuer.getClass().getSimpleName()))
					break;
				System.out.println("Entry not found. Enter again");
			}
			
			while(true) {
				try {
					System.out.println("Enter new Issuer id");
					i =Integer.parseInt(in.readLine());
					if(i<0) {
						System.out.println("Enter valid id");
						continue;
					}
					issuer.setId(i);
					break;					
				}
				catch(Exception e) {
					System.out.println("Enter valid id");
					continue;}
			}
			while(true) {
				System.out.println("Enter new issuer name");
				String j= in.readLine();
				if(Checks.IsValidName(j)) {
					issuer.setName(j);
					break;
				}
				System.out.println("Enter again");
			}
			
			while(true) {
				System.out.println("Enter new Book name");
				String j= in.readLine();
				if(Checks.IsValidName(j)) {
					issuer.setBook(j);
					break;
				}
				System.out.println("Enter again");
			}
			
			while(true) {
				System.out.println("Enter new Issue Date in format MM/DD/YYYY");
				String j= in.readLine();
				if(Checks.IsValidDate(j)) {
					issuer.setIssueDate(j);
					break;
				}
				System.out.println("Enter again");
			}
			
			while(true) {
				System.out.println("Enter Due Date in format MM/DD/YYYY");
				String j= in.readLine();
				if(Checks.IsValidDate(j)) {
					issuer.setDuedate(j);
					break;
				}
				System.out.println("Enter again");
			}	
			obj.update(id,issuer);
			System.out.println("Entry Updated");
			
			
		}catch(Exception e) {}

	}
	
	public void displayAll() {
		Issuer issuer =new Issuer();
		List<Issuer> list= obj.viewAll(issuer);	
		Iterator<Issuer> itr = list.iterator();
		while(itr.hasNext()) {
			issuer = itr.next();
			System.out.println(issuer.toString());
		}		
	}
				
	public void delete() {
		try {
			BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
			int id;
			Issuer issuer =new Issuer();
			while(true) {
				System.out.println("Enter issuer id to be deleted");
				id = Integer.parseInt(in.readLine());
				if(obj.IsIdExist(id, issuer.getClass().getSimpleName()))
					break;
				System.out.println("Entry not found. Enter again");
			}
			obj.delete(id, issuer);
			System.out.println("Entry Deleted");
		} catch(Exception e) {}		
	}
}


