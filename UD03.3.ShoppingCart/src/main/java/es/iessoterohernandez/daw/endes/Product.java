package es.iessoterohernandez.daw.endes;

public class Product {
	private String title;
	private double price;
	
	public Product (String t, double p) {
		this.title = t;
		this.price = p;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
        @Override
	public boolean equals(Object o) {
		if (o instanceof Product) {
			Product p = (Product)o;
			return p.getTitle().equals(title);
		}
		return false;
	}
}
