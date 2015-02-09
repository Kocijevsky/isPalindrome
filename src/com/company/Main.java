package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] stringArray = {"ololo", "Shalash", "Oloolo"};
        for (String string : stringArray) {
            System.out.println(isPalindrome(string));
        }
    }

    public static boolean isPalindrome (String someString) {
        someString = someString.toLowerCase().replace(" ","");
        for (int i = 0; i < someString.length()/2; i++) {
            if(someString.charAt(i) != someString.charAt(someString.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
