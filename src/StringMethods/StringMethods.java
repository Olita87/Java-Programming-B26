package StringMethods;

public class StringMethods {
    public static void main(String[] args) {

        //the String class has a variety of methods -> methods are tools that are called to be used to perform a function
        //use this format to call a String method for its designed function -> stringName.methodName(parameters)

        //two ways to declare a string, these are stored and accessed differently based on declaration
        String first = "java";//string literal -> in string pool
        String second = "java";//string object -> in heap, not in string pool
        boolean isSame;

        isSame = first == second; //the == checks to see if the data is stored in the same location not that the strings are the same
        ////returns false because first is stored in string pool and second is stored in heap
        System.out.println("returns false because first is stored in string pool and second is stored in heap " + isSame);

        isSame = first.equals(second);//checks to see if the first string equals second string
        //returns true because the strings are identical
        System.out.println("returns true because the strings are identical " + isSame);

        second = second.toUpperCase();//toUpperCase() method converts entire String to uppercase

        isSame = first.equals(second);
        System.out.println(first + " and " + second + " are the same word but are not equal " + !isSame);

        isSame = first.equalsIgnoreCase(second);//equalsIgnoreCase() method checks if the two strings are the same sequence of characters regardless of capitol or lowercase
        System.out.println(first + " and " + second + " are the same word but not the same case but the equalsIgnoreCase method returns " + isSame + " because the two String are the same sequence of characters");

        String third = "I want to get better everyday";

        int length = third.length();//length() method returns length of String -> index of last char + 1
        System.out.println("length of String. length: " + length);

        char index = third.charAt(0);//the charAt(int) method returns the char that is located at the (int) parameter -> first letter is index 0
        System.out.println("letter located at index 0 in \"I want to get better everyday\" \" is the letter " + index + "\"");//prints letter located at index 0 -> the character at index 0 of String third is = 'I'

        int indexOfW = third.indexOf("w");//the indexOf("String") method returns the first instance of the (String) parameter as an int
        System.out.println("index of first \"w\" in the same string as above. index: " + indexOfW);//prints the index of first "w" in the string, third letter in String third -> the index for the first "w" is 2

        int indexOfLastE = third.lastIndexOf("e");//lastIndexOf("find") method searches for first index of "find' in String starting at the end of the String and working towards the front
        System.out.println("index of last occuring \"e\" in the same string as above. index: " + indexOfLastE);

        boolean endsWithLowercaseY = third.endsWith("y");//endsWith("this") method returns boolean for if the String ends with "this"
        boolean endsWIthUppercaseY = third.endsWith("Y");//String ends with lowercase 'y' this returns false because it is checking if the String ends with uppercase 'Y'
        System.out.println("endsWithLowercaseY = " + endsWithLowercaseY);
        System.out.println("endsWIthUppercaseY = " + endsWIthUppercaseY);

        //substring("start index", "not included end index") method returns the String that exists between defined start index and up but not including the defined end index -> first letter index = 0
        System.out.print("is a substring as same string as above \"" + third.substring(10, 20) + "\" \"");
        System.out.print(third.subrinstg(third.indexOf("g")) + "\" \"");//prints everything starting after first character 'g'
        System.out.println(third.substring(third.indexOf("g"), third.indexOf(" e")) + "\"");//prints everything between first 'g' and up to but not including first ' e'


        String fourth = "james wallace";

        fourth = fourth.replace("j", "J");//replace("this", "that") method replaces first String with second String located in (parameter)
        fourth = fourth.replace("w", "W");
        System.out.println(fourth);//new String now has a capitol J which replaced the original lower case 'j'

        fourth = fourth.toUpperCase();//toUpperCase() method converts entire String to uppercase
        System.out.println("uppercase: " + fourth);
        fourth = fourth.toLowerCase();//toLowerCase() method converts entire String to lowercase
        System.out.println("lowercase: " + fourth);


        String fifth = "  i will practice so i improve  ";
        System.out.println("\"i will pracice\" is a substring: " + fifth.contains("i will practice"));//contains("this") method returns boolean value for if a String contains "this" -> case sensitive

        //methods can be chained together to be applied to the same String in one line
        //the methods are applied left to right -> returns value of the last method
        //before the contains methods checks for the existence of the substring the String it is checking has the toUpperCase() method applied to it
        System.out.println("if the original String was all caps would \"I WILL PRACTICE\" be a substring: " + fifth.toUpperCase().contains("I WILL PRACTICE"));

        fifth = fifth.replaceFirst("i", "I");//replaceFirst("this", "that") method replaces the first instance of regex String with replacement String
        System.out.println(fifth);

        fifth = fifth.replaceAll("i", "I");//replaceAll("this", "that") method replaces all instances of regex String with replacement String
        System.out.println(fifth);

        fifth = fifth.trim();
        System.out.println(fifth);


        //isEmpty() method returns boolean for no character String
        String sixth = "";
        System.out.println("this String has no characters and is empty: " + sixth.isEmpty());

        //isBlank() method returns boolean for String with only whitespace for characters
        sixth += " ";
        System.out.println("this String has only whitespace for characters: " +
                "" + sixth.isBlank());


        //can use indexOf('char' , start index)
        String seventh = "simplified";
        int firstI = seventh.indexOf('i');
        System.out.println("firstI = " + firstI);
        int secondI = seventh.indexOf('i' , firstI + 1);
        System.out.println("secondI = " + secondI);

        System.out.println(seventh.indexOf('i' , seventh.indexOf('i') + 1));

        String s = "XHix";
        System.out.println(s.toLowerCase().startsWith("x"));

    }
}


