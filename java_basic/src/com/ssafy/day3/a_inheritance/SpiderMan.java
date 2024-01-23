package com.ssafy.day3.a_inheritance;



public class SpiderMan extends Person {
	//String a = super.name;
	Spider spider = new Spider();
	boolean isSpider;
	
	SpiderMan ( String name, Spider spider, boolean isSpider )  {
		super(name);
		this.spider = spider;
		this.isSpider = isSpider;
	}
	
	SpiderMan ( String name )  {
		this(name, new Spider(), true );
	}
	
	
	@Override
	public String toString() {
		return "SpiderMan [toString()=" + super.toString() + "]";
	}

	public SpiderMan() {}
	
	public static void main(String[] args) {
		SpiderMan sman = new SpiderMan("피터 카ㅓ");
		System.out.println(sman.name);
		Person p = new SpiderMan("df");
		
		
		Person[] pa = new Person[3];
		
		pa[0] = new SpiderMan("df");
		
		SpiderMan s2 = (SpiderMan)pa[0];
		
		
		//System.out.println(p.isSpider);
		//Person[] pa = new Person[] {p};
		for ( Person ps : pa ) {
			System.out.println(ps.name);
		}
	}
}
