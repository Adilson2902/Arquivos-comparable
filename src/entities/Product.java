package entities;

public class Product implements Comparable<Product>{
	String Nome;
	Double Price;
	
	
	public Product(String nome, Double price) {
		Nome = nome;
		Price = price;
	}
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}


	@Override
	public String toString() {
		return Nome + ","+ String.format("%.2f", Price);
	}


	@Override
	public int compareTo(Product o) {
		
		return Price.compareTo(o.getPrice());
	}
 	
	
}