//String class

class Main{
    private static void print(Object msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        String firstName = "Shivansh";
        String lastName = "Mishra";


        print("To get the length of the string : ");
        print(text.length());
        print("To get a character at specific index : ");
        print(text.charAt(4));
        print("To concatinate two strings : ");
        print(firstName.concat(lastName));
        print("Get a substring of a string : ");
        print(firstName.substring(4));
        print(firstName.substring(4,8));
        print("Get index of a character 'i' :");
        print(firstName.indexOf("i"));
        print("Check if a string contains a specific sequence : ");
        print(text.contains("dummy"));
        print(text.contains("shivansh"));
        print("Compare two strings : ");
        print(firstName.equals(lastName));
        print("Covert to uppercase : ");
        print(firstName.toUpperCase());
        print("Covert to lowercase : ");
        print(firstName.toLowerCase());
        print("Convert a string into an array of type sting : ");
        print("First name : "+ firstName);

        String[] strArray = firstName.split("");
        for(String c : strArray) print(c);
    }
}