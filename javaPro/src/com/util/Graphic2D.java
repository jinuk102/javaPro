package com.util;

public class Graphic2D {
	public static void drawLine() {
		System.out.print("=--------------="); // 50줄 코딩
	} 
	/*
	public static int drawLine() {
		System.out.println("=--------------="); // 50줄 코딩
		return 0;
	} 
	*/
	public static void drawLine(int length) {
		for (int i = 1; i <= length; i++) {
			System.out.print("="); // 50줄 코딩
		} // for i
	
	} 
	public static void drawLine(int length, String style) {
		for (int i = 1; i <= length; i++) {
			System.out.print(style); // 50줄 코딩
	} // for i
	}
}
