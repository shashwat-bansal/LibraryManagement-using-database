package data;
import java.util.*;

public class Book implements Library{

	private int id;
	private String name;
	private String author;
	private int stock;
	private int lent;
	public Book() {}
	
	public Book(int id, String name,String author,int stock, int lent) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.stock=stock;
		this.lent=lent;
	}
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getLent() {
		return lent;
	}

	public void setLent(int lent) {
		this.lent = lent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return (getId()+"\t"+getName()+"\t"+getAuthor()
		+"\t"+getStock()+"\t"+getLent());
	}
	
	public LinkedHashMap<String, String> tomap() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("id",Integer.toString(id));
		map.put("book", name);
		map.put("author", author);
		map.put("stock",Integer.toString(stock));
		map.put("lent",Integer.toString(lent));
		return map;
	}
}


