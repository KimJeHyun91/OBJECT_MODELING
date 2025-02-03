package design_pattern;

class Subway {

	private int size;
	private String bread;
	private String cheese;
	private boolean vegetable;
	private String source;
	
	public Subway() {
	}
	public Subway(int size, String bread, String cheese, boolean vegetable, String source) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.vegetable = vegetable;
		this.source = source;
	}
	
	@Override
	public String toString() {
		return "Subway [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", vegetable=" + vegetable
				+ ", source=" + source + "]";
	}
	
}

class SubwayBuilder {
	
	private int size;
	private String bread;
	private String cheese;
	private boolean vegetable;
	private String source;
	
	public SubwayBuilder(int size, String bread){
		this.size = size;
		this.bread = bread;
	}
	
	public SubwayBuilder setSize(int size) {
		this.size = size;
		return this;
	}
	public SubwayBuilder setBread(String bread) {
		this.bread = bread;
		return this;
	}
	public SubwayBuilder setCheese(String cheese) {
		this.cheese = cheese;
		return this;
	}
	public SubwayBuilder setVegetable(boolean vegetable) {
		this.vegetable = vegetable;
		return this;
	}
	public SubwayBuilder setSource(String source) {
		this.source = source;
		return this;
	}
	
	public Subway build() {
		return new Subway(size, bread, cheese, vegetable, source);
	}
	
}

public class Builder {

	public static void main(String[] args) {
		
		SubwayBuilder builder = new SubwayBuilder(5, "통밀")
				.setCheese("치즈")
				.setSource("마요네즈")
				.setVegetable(true);
		
		System.out.println(builder.build());
		
	}

}
