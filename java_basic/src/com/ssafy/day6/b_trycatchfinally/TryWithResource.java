package com.ssafy.day6.b_trycatchfinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {
        TryWithResource test = new TryWithResource();
        test.useStream();
        test.useStreamNewStye();

    }

    public void useStream() {
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream("abc.txt");
            fileInput.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        	//fileInput이 제대로 생성되지 않았을 경우
            if (fileInput != null) {
                try {
                    fileInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void useStreamNewStye() {
        try (FileInputStream fileInput = new FileInputStream("abc.txt");){
        	fileInput.read();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 

        // END
    }
}
