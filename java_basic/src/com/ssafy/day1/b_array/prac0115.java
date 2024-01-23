package com.ssafy.day1.b_array;

import java.util.Arrays;
import java.util.Scanner;

public class prac0115 {
	public static void main( String[] args ){
		/*
		int R = 3;   //행
		int C = 4;   //열
		int[][] arr = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		};

		System.out.println(Arrays.deepToString(arr));
		//행우선 역방향
		for ( int i = arr.length - 1; i >= 0 ; i-- ) {
			for (int j = arr[i].length - 1; j >= 0; j-- ) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		//열우선 정방향
		for ( int i = 0; i < arr[0].length; i++ ) {
			for ( int j = 0; j < arr.length; j++ ) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		
		//열우선 역방향
		for ( int i = arr[0].length - 1; i >= 0; i-- ) {
			for ( int j = arr.length - 1; j >= 0; j-- ) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		
		// 지그재그 정방향
		for ( int i = 0; i < arr.length; i++ ) {
			if ( i % 2 == 0 ) {
				for ( int j = 0; j < arr[0].length; j++ ) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j-- ) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		// 지그재그 역방향
		for ( int i = arr.length - 1; i >= 0; i-- ) {
			if ( i % 2 != 0 ) {
				for ( int j = 0; j < arr[i].length; j++ ) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j-- ) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		*/
		/* 사방
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(), col = sc.nextInt();
		char[][] matrix = new char[row][col];
		int sum = 0;
		int count = 0;
		for ( int i = 0; i < row; i++ ) {
			for ( int j = 0; j < col; j++ ) {
				matrix[i][j] = sc.next().charAt(0);
			}
		}
		
		
		for ( int i = 0; i < row; i++) {
			for ( int j = 0; j < col; j++ ) {
				if (matrix[i][j] == 'X') {
					count = 0;
					if ( i + 1 < row && matrix[i+1][j] != 'X') count += matrix[i+1][j] - '0';
					if ( i - 1 >= 0 && matrix[i-1][j] != 'X') count += (int)matrix[i-1][j] - '0';
					if ( j + 1 < col && matrix[i][j+1] != 'X') count += (int)matrix[i][j+1] - '0';
					if ( j - 1 >= 0 && matrix[i][j-1] != 'X') count += (int)matrix[i][j-1] - '0';
					sum += count;
				}
			}
		}
		System.out.println(sum);
		*/
		/*사방(델타)
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(), col = sc.nextInt();
		char[][] matrix = new char[row][col];
		int sum = 0;
		int count = 0;
		for ( int i = 0; i < row; i++ ) {
			for ( int j = 0; j < col; j++ ) {
				matrix[i][j] = sc.next().charAt(0);
			}
		}
		int[][] dt = {
				{-1, 0},	//상
				{1, 0}, 
				{0, -1}, 
				{0, 1}
		};
		
		for ( int i = 0; i < row; i++ ) {
			for ( int j = 0; j < col; j++ ) {
				if ( matrix[i][j] == 'X' ) {
					for ( int k = 0; k < dt.length; k++ ) {
						int nr = i + dt[k][0];
						int nc = j + dt[k][1];
						if (nr < 0 || nr >= row || nc < 0 || nc >= col || matrix[nr][nc] == 'X') continue;
						sum += matrix[nr][nc] - '0';
					}
				}
			}
		}
		System.out.println(sum);
		*/
		/*팔방 델타
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(), col = sc.nextInt();
		char[][] matrix = new char[row][col];
		int sum = 0;
		for ( int i = 0; i < row; i++ ) {
			for ( int j = 0; j < col; j++ ) {
				matrix[i][j] = sc.next().charAt(0);
			}
		}
		int[][] dt = {
				{-1, 0},	//상
				{1, 0}, 
				{0, -1}, 
				{0, 1},
				{-1, -1},	//대각
				{-1, 1},
				{1, 1},
				{1, -1}
		};
		
		for ( int i = 0; i < row; i++ ) {
			for ( int j = 0; j < col; j++ ) {
				if ( matrix[i][j] == 'X' ) {
					for ( int k = 0; k < dt.length; k++ ) {
						int nr = i + dt[k][0];
						int nc = j + dt[k][1];
						if (nr < 0 || nr >= row || nc < 0 || nc >= col || matrix[nr][nc] == 'X') continue;
						sum += matrix[nr][nc] - '0';
						matrix[nr][nc] = '0';
					}
				}
			}
		}
		System.out.println(sum);
		*/
		/* 팔방
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(), col = sc.nextInt();
		char[][] matrix = new char[row][col];
		int sum = 0;
		int count = 0;
		for ( int i = 0; i < row; i++ ) {
			for ( int j = 0; j < col; j++ ) {
				matrix[i][j] = sc.next().charAt(0);
			}
		}
		
		for ( int i = 0; i < row; i++) {
			for ( int j = 0; j < col; j++ ) {
				if (matrix[i][j] == 'X') {
					count = 0;
					if ( i + 1 < row && matrix[i+1][j] != 'X') {count += matrix[i+1][j] - '0';matrix[i+1][j] = '0';}
					if ( i + 1 < row && j + 1 < col && matrix[i+1][j+1] != 'X'){count += matrix[i+1][j+1] - '0';matrix[i+1][j+1] = '0';} 
					if ( i + 1 < row && j - 1 >= 0 && matrix[i+1][j-1] != 'X'){count += matrix[i+1][j-1] - '0';matrix[i+1][j-1] = '0';} 
					if ( i - 1 >= 0 && matrix[i-1][j] != 'X') {count += matrix[i-1][j] - '0';matrix[i-1][j] = '0';}
					if ( i - 1 >= 0 && j - 1 >= 0 && matrix[i-1][j-1] != 'X'){count += matrix[i-1][j-1] - '0';matrix[i-1][j-1] = '0';} 
					if ( i - 1 >= 0 && j + 1 < col && matrix[i-1][j+1] != 'X') {count += matrix[i-1][j+1] - '0';matrix[i-1][j+1] = '0';}
					if ( j + 1 < col && matrix[i][j+1] != 'X') {count += matrix[i][j+1] - '0';matrix[i][j+1] = '0';}
					if ( j - 1 >= 0 && matrix[i][j-1] != 'X') {count += matrix[i][j-1] - '0';matrix[i][j-1] = '0';}
					sum += count;
				}
			}
		}
		System.out.println(sum);
		*/
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for ( int tc = 0; tc < T; tc++ ) {
			int N = sc.nextInt();
			char[][] matrix = new char[N][N];
			int sum = 0;
			int answer = 0;
			for ( int i = 0; i < N; i++ ) {
				for ( int j = 0; j < N; j++ ) {
					matrix[i][j] = sc.next().charAt(0);
				}
			}
			int[][] dt = {
					{-1, 0},	//상
					{1, 0}, 
					{0, -1}, 
					{0, 1},
					{-1, -1},	//대각
					{-1, 1},
					{1, 1},
					{1, -1}
			};
			
			for ( int i = 0; i < N; i++ ) {
				for ( int j = 0; j < N; j++ ) {
					if ( matrix[i][j] == 'B' ) {
						sum = 0;
						for ( int k = 0; k < dt.length; k++ ) {
							int nr = i + dt[k][0];
							int nc = j + dt[k][1];
							if (nr < 0 || nr >= N || nc < 0 || nc >= N ) continue;
							if (matrix[nr][nc] == 'G') {
								sum = 2;
								break;
							}
							if ( k == dt.length - 1)  {
								for ( int b = 0; b < N; b++ ) {
									if ( matrix[b][j] == 'B' ) {
										sum++;
									}
									if ( matrix[i][b] == 'B' ) {
										sum++;
									}
								}
								
							}
						}
						answer = Math.max(answer, sum);
						
					}
				}
			}
			System.out.println("#" + tc + " " + answer);
		}
		
	}
}
