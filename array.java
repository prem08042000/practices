package com.cal;

public class arraydemo {

	public static void main(String[] args) {
		String stringArray[] = new String[4];
		stringArray[0] = "Hello";
        stringArray[1] = "World";
        stringArray[2] = "Java";
        stringArray[3] = "Programming";
        System.out.println("Strings in the array:");

        for (String str : stringArray) {
            System.out.println(str);
        }
	}

}
