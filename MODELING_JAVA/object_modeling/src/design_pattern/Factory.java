package design_pattern;

class Product {
	
	private String name;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + "]";
	}
	
}

class ProductFactory {
	
	public static Product getInstance(String name) {
		Product product = new Product();
		if(name.equalsIgnoreCase("TV")) {
			product.setName("TV");
			product.setPrice(300);
		}else if(name.equalsIgnoreCase("computer")) {
			product.setName("COMPUTER");
			product.setPrice(200);
		}
		return product;
	}
}

public class Factory {

	public static void main(String[] args) {
		
		System.out.println(ProductFactory.getInstance("tv"));
		System.out.println(ProductFactory.getInstance("computer"));
		
		
		
		
	}

}
