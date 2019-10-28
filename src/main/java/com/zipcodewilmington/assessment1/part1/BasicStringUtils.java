package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        return Character.toUpperCase(str.charAt(0))+ str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String result = "" ;
        for (int i =str.length()-1; i>=0;i--){
            result = result + str.charAt(i);
        }

        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        return camelCase(reverse(str));

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

            String result = "" ;
            for (int i=0 ; i< str.length() ; i++){
                if (str.charAt(i) != str.charAt(0) && str.charAt(i) != str.charAt(str.length()-1)){
                    result += str.charAt(i);
                }
            }
            return result;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String result = "";
        for (int i=0 ; i<str.length() ; i++){
            if (Character.isUpperCase(str.charAt(i)) ){
                result += Character.toLowerCase(str.charAt(i));

            }
            else if (Character.isLowerCase(str.charAt(i)) ){
                result += Character.toUpperCase(str.charAt(i));
            }
            else {
                result += " ";
            }
        } return result;

    }
}
