package com.ssafy.day8.b_processing.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderVsScanner {
    private File file = null;

    public static void main(String[] args) throws IOException {
        BufferedReaderVsScanner rs = new BufferedReaderVsScanner();
        rs.makeFile();
        rs.useScanner();
        rs.useBufferedReader();
    }

    @SuppressWarnings("unused")
    private void useScanner() throws FileNotFoundException {

        try (Scanner s = new Scanner(file)) {
            long start = System.nanoTime();
            int line = -1;
            while (s.hasNext()) {
                line = s.nextInt();	// 원하는 타입으로 바로 읽을 수 있다.
                // System.out.println(line);
            }
            System.out.printf("sc: %10d%n", System.nanoTime() - start);
        }
    }

    @SuppressWarnings("unused")
    private void useBufferedReader() throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            long start = System.nanoTime();
            String line = null;
            while ((line = br.readLine()) != null) {
            	int num = Integer.parseInt(line);	// bufferedReader : 별도의 캐스팅 필요
                // System.out.println(line);
            }
            System.out.printf("br: %10d%n", System.nanoTime() - start);
        }
    }

    private void makeFile() {
        file = new File("./sample.txt");
        try (BufferedWriter output = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 1_000_000; i++) {
                output.write("" + i);
                output.newLine();
            }
            System.out.println("파일 작성 완료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
