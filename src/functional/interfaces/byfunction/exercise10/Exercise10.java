package functional.interfaces.byfunction.exercise10;
/*
String replacement
Create a function that replaces all occurrences of a given character in a string with another character, using a functional approach.
The function should take a string, and two characters as arguments and return the modified string. Use the replace method to replace the characters.
* */
public class Exercise10 {
    public static void main(String[] args){
        StringReplacement rep = new StringReplacement();
        System.out.println(rep.apply("amarrillo", 'a', 'p'));
        System.out.println(rep.apply("armur", 'r', 'o'));
        System.out.println(rep.apply("peter", 'e', 'i'));
    }
}