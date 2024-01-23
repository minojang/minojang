package com.ssafy.day5.c_generic.box;

public class NumberBox <T extends Number>{
	public void addSomes(T...ts) {
		double sum = 0;
		for ( T t : ts) {
			sum += t.doubleValue();
		}
		
		System.out.println("총 합 : " + sum);
	}
	private T some;
	
	public T getSome() {
		return some;
	}
	public void setSome(T some) {
		this.some = some;
	}
	
}
