package com.ssafy.day4.d_object;

import java.util.Objects;

public class Product {
    private String sn;

    public Product(String sn) {
        this.sn = sn;
    }
    
    public int solution(String word) {
        double answer = 1;
        char[] alphabets= {'A', 'E', 'I', 'O', 'U'};
        
        for ( int j = 0; j < word.length(); j++) {
        	for ( int i = 0; i < alphabets.length; i++) {
            	if (alphabets[i] == word.charAt(0))  {
            		answer += Math.pow(5, word.length() - 1) * i;	
            	}
            }
        }
        return (int)answer;
    }
    
    // TODO: toString, equals, hashCode를 적절히 재정의해보자.

    // END
   

}
