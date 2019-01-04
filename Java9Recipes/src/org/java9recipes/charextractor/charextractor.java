package org.java9recipes.charextractor;

public class charextractor {

    public static void main(String[] args) {
        String plateNum = "@Alpha123KCL";
        StringBuffer letters = new StringBuffer();
        StringBuffer digits = new StringBuffer();

        for (int x = 0; x < plateNum.length(); x++) {
            if (Character.isLetter(plateNum.charAt(x))) {
                letters.append(plateNum.charAt(x));
            } else {
                digits.append(plateNum.charAt(x));
             }
        }
        System.out.println(letters.toString().toUpperCase());
        System.out.println(digits.toString());
    }
}
